//Universidad del valle de guatemala
//Proyecto de Bases de Datos No. 1
//Integrantes:
//--Luisa Arboleda
//--Andres Oliva
//--Santiago Paiz



grammar Sql;


//LEXER SPECIFICATION

INT :     'int' ;
CHAR :    'char' ;
BOOLEAN : 'boolean';
DATETIME: 'datetime';

fragment LETTER : ('a'..'z'|'A'..'Z') ;
fragment DIGIT :'0'..'9' ;
fragment ASCII : (' ' ..'~') | '\\' | '\'' | '\"' | '\t' | '\n' ;
fragment TWO_DIGITS   : DIGIT DIGIT ;
fragment THREE_DIGITS : DIGIT TWO_DIGITS ;
fragment FOUR_DIGITS  : DIGIT THREE_DIGITS ;
fragment YEAR      : FOUR_DIGITS ;                   // year
fragment MONTH       : DIGIT | TWO_DIGITS ;        // month of year.
fragment DAY       : DIGIT | TWO_DIGITS ; 

//* \'
ID : LETTER ( LETTER | DIGIT )* ;
NUM : DIGIT ( DIGIT )* ;
FLOAT: DIGIT ( DIGIT )* ('.' (DIGIT)* )? ;
Char: '\''~('\r'|'\n'|'\'')* '\'';
DATE: YEAR '-' MONTH '-' DAY ;
 
 

WS : 
    [\t\r\n\f ]+ -> skip
    ;


// PARSER SPECIFICATION

program 
	:	
            ( sql_executable_statement )+
	;

sql_executable_statement 

	:	sql_schema_statement 
	|	sql_data_statement
	;

sql_schema_statement  
	:	sql_schema_definition_statement 
	|	sql_schema_manipulation_statement       
	;

sql_schema_definition_statement  
	:	schema_definition 
	|	table_definition 
	;

sql_schema_manipulation_statement 
	:	drop_schema_statement
	|	alter_table_statement 
	|	drop_table_statement 
        |       alter_database_statement
        |       use_schema_statement
        |       show_schema_statement
        |       rename_table_statement
        |       show_table_statement
        |       show_column_statement
        |       dmlstatement 

    ;
sql_data_statement  

	:	 
        select_value 
	;


schema_definition: ('CREATE'|'create') ('DATABASE'|'database') ID ';';

table_definition: ('CREATE'|'create') ('TABLE'|'table') ID '(' (column)+ ')' ';';

drop_schema_statement: ('DROP'|'drop') ('DATABASE'|'database') ID ';';

alter_table_statement: ('ALTER'|'alter') ('TABLE'|'table') ID accion ';';

drop_table_statement: ('DROP'|'drop') ('TABLE'|'table') ID ';';
alter_database_statement: ('ALTER'|'alter') ('DATABASE'|'database') ID ('RENAME'|'rename') ('TO'|'to') ID ';' ;

 show_schema_statement: ('SHOW'|'show') ('DATABASES'|'databases') ';';

use_schema_statement: ('USE'|'use') ('DATABASE'|'database') ID ';';


column: ID  tipo_literal(',')?          #defcolumna
		|  constraint(',')?    #defconstraint
		;

tipo_literal: 
				  'INT'                    #tipoInt
				| 'FLOAT' 		   #tipoFloat
				| 'CHAR(' NUM ')'          #tipoChar 
				| 'DATE' 		   #tipoDate
				;

constraint: 'CONSTRAINT' constraintType;

constraintType:
            ID 'PRIMARY' 'KEY' '(' ID (',' ID)*')'                                           #primaryK
        |   ID 'FOREIGN' 'KEY'  '(' ID (',' ID)*')' ID '(' ID (',' ID)*')'	               	 #foreignK
        |   ID 'CHECK'  '('expression')'													 #check
        ;

rename_table_statement: ('ALTER'|'alter') ('TABLE'|'table') ID ('RENAME'|'rename') ('TO'|'to') ID ';';

accion:
          ('ADD'|'add') ('COLUMN'|'column') ID tipo_literal (constraint)					#addColumn
        | ('ADD'|'add') constraint												#addConstraint
        | ('DROP'|'drop') ('COLUMN'|'column') ID 											#dropColumn
        | ('DROP'|'drop') ('CONSTRAINT'|'constraint') ID										#dropConstraint
    ;


show_table_statement: ('SHOW'|'show') ('TABLES'|'tables') ';';
show_column_statement: ('SHOW'|'show') ('COLUMNS'|'columns') ('FROM'|'from') ID ';';
       
dmlstatement : insert_value
    | update_value
    | delete_value
    | select_value
    ;

insert_value: ('INSERT'|'insert') ('INTO'|'into') ID ( '(' (columns) ')' )? ('VALUES'|'values') '('list_values')' ';' ;

update_value: ('UPDATE'|'update') ID ('SET'|'set')  ID '=' literal (','ID '=' literal)* (('WHERE'|'where') expression)? ';' ;

delete_value: ('DELETE'|'delete') ('FROM'|'from') ID (('WHERE'|'where') expression)? ';' ;

select_value: ('SELECT'|'select') ('*' | ID (',' ID)* ) ('FROM'|'from') ID (('WHERE'|'where') expression)?  (('ORDER'|'order') ('BY'|'by') (('ASC'|'asc') | ('DESC'|'desc')))? ';';

                  
columns : (ID)(','ID)*;

list_values : (literal)(','literal)* ;
         
literal :  
        int_literal
    |   float_literal
    |   date_literal
    |   char_literal
    ;

int_literal: NUM;
	float_literal: FLOAT;
	date_literal: DATE;
char_literal: Char;



rel_op
	:	'<'												#relL
	|	'>'												#rekB
	| 	'<='											#relLE
	|	'>='											#relBE
    |	'='											    #eqE
	|	'<>'									 	    #eqNE	
	;


rel_op2
	:	'<'												#relL2
	|	'>'												#rekB2
	| 	'<='											#relLE2
	|	'>='											#relBE2
    |	'='											    #eqE2
	|	'<>'										    #eqNE2	
	;

	rel_op3
	:	'<'												#relL3
	|	'>'												#rekB3
	| 	'<='											#relLE3
	|	'>='											#relBE3
    |	'='											    #eqE3
	|	'<>'										    #eqNE3	
	;
cond_op
	:	'AND'   #cond_op1
	|  'OR' # cond_op2
	|  'IS NULL' #logic1
	|  'IS NOT NULL' #logic2
	;



expression							
	: expression cond_op expr1		#expression1
	| expr1							#expression2
	;
	
expr1								
	: expr1 cond_op expr3		#expr11
	|expr3						#expr12
	;
	

expr3								
	: expr3 rel_op unifactor			#expr31
	| unifactor							#expr32
	|expr3 rel_op2 literal  			#expr33
	|literal rel_op3 expr3				#expr34
	;

unifactor
	: 'NOT' factor						#uniFactorNot
	| factor							#uniFactorFactor
	;
	
factor 		
	: '(' expression ')'		#factorExpression
	| ID              			#factorID
	| ID.ID 					#factorID2
	;
	


              
 
