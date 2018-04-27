// Generated from Sql.g4 by ANTLR 4.5.3
package ANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, INT=79, CHAR=80, BOOLEAN=81, 
		DATETIME=82, ID=83, NUM=84, FLOAT=85, Char=86, DATE=87, WS=88;
	public static final int
		RULE_program = 0, RULE_sql_executable_statement = 1, RULE_sql_schema_statement = 2, 
		RULE_sql_schema_definition_statement = 3, RULE_sql_schema_manipulation_statement = 4, 
		RULE_sql_data_statement = 5, RULE_schema_definition = 6, RULE_table_definition = 7, 
		RULE_drop_schema_statement = 8, RULE_alter_table_statement = 9, RULE_drop_table_statement = 10, 
		RULE_alter_database_statement = 11, RULE_show_schema_statement = 12, RULE_use_schema_statement = 13, 
		RULE_column = 14, RULE_tipo_literal = 15, RULE_constraint = 16, RULE_constraintType = 17, 
		RULE_rename_table_statement = 18, RULE_accion = 19, RULE_show_table_statement = 20, 
		RULE_show_column_statement = 21, RULE_dmlstatement = 22, RULE_insert_value = 23, 
		RULE_update_value = 24, RULE_delete_value = 25, RULE_select_value = 26, 
		RULE_list_values = 27, RULE_literal = 28, RULE_int_literal = 29, RULE_float_literal = 30, 
		RULE_date_literal = 31, RULE_char_literal = 32, RULE_rel_op = 33, RULE_rel_op2 = 34, 
		RULE_rel_op3 = 35, RULE_cond_op = 36, RULE_expression = 37, RULE_expr1 = 38, 
		RULE_expr3 = 39, RULE_unifactor = 40, RULE_factor = 41;
	public static final String[] ruleNames = {
		"program", "sql_executable_statement", "sql_schema_statement", "sql_schema_definition_statement", 
		"sql_schema_manipulation_statement", "sql_data_statement", "schema_definition", 
		"table_definition", "drop_schema_statement", "alter_table_statement", 
		"drop_table_statement", "alter_database_statement", "show_schema_statement", 
		"use_schema_statement", "column", "tipo_literal", "constraint", "constraintType", 
		"rename_table_statement", "accion", "show_table_statement", "show_column_statement", 
		"dmlstatement", "insert_value", "update_value", "delete_value", "select_value", 
		"list_values", "literal", "int_literal", "float_literal", "date_literal", 
		"char_literal", "rel_op", "rel_op2", "rel_op3", "cond_op", "expression", 
		"expr1", "expr3", "unifactor", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'CREATE'", "'create'", "'DATABASE'", "'database'", "';'", "'TABLE'", 
		"'table'", "'('", "')'", "'DROP'", "'drop'", "'ALTER'", "'alter'", "'RENAME'", 
		"'rename'", "'TO'", "'to'", "'SHOW'", "'show'", "'DATABASES'", "'databases'", 
		"'USE'", "'use'", "','", "'INT'", "'FLOAT'", "'CHAR('", "'DATE'", "'PRIMARY'", 
		"'KEY'", "'FOREIGN'", "'CHECK'", "'ADD'", "'add'", "'COLUMN'", "'column'", 
		"'CONSTRAINT'", "'constraint'", "'TABLES'", "'tables'", "'COLUMNS'", "'columns'", 
		"'FROM'", "'from'", "'INSERT'", "'insert'", "'INTO'", "'into'", "'VALUES'", 
		"'values'", "'UPDATE'", "'update'", "'SET'", "'set'", "'='", "'WHERE'", 
		"'where'", "'DELETE'", "'delete'", "'SELECT'", "'select'", "'*'", "'ORDER'", 
		"'order'", "'BY'", "'by'", "'ASC'", "'asc'", "'DESC'", "'desc'", "'<'", 
		"'>'", "'<='", "'>='", "'<>'", "'AND'", "'OR'", "'NOT'", "'int'", "'char'", 
		"'boolean'", "'datetime'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "INT", "CHAR", "BOOLEAN", "DATETIME", 
		"ID", "NUM", "FLOAT", "Char", "DATE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<Sql_executable_statementContext> sql_executable_statement() {
			return getRuleContexts(Sql_executable_statementContext.class);
		}
		public Sql_executable_statementContext sql_executable_statement(int i) {
			return getRuleContext(Sql_executable_statementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				sql_executable_statement();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__44) | (1L << T__45) | (1L << T__50) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_executable_statementContext extends ParserRuleContext {
		public Sql_schema_statementContext sql_schema_statement() {
			return getRuleContext(Sql_schema_statementContext.class,0);
		}
		public Sql_data_statementContext sql_data_statement() {
			return getRuleContext(Sql_data_statementContext.class,0);
		}
		public Sql_executable_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_executable_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_executable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_executable_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_executable_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_executable_statementContext sql_executable_statement() throws RecognitionException {
		Sql_executable_statementContext _localctx = new Sql_executable_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_executable_statement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				sql_schema_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				sql_data_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_schema_statementContext extends ParserRuleContext {
		public Sql_schema_definition_statementContext sql_schema_definition_statement() {
			return getRuleContext(Sql_schema_definition_statementContext.class,0);
		}
		public Sql_schema_manipulation_statementContext sql_schema_manipulation_statement() {
			return getRuleContext(Sql_schema_manipulation_statementContext.class,0);
		}
		public Sql_schema_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_schema_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_schema_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_schema_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_schema_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_schema_statementContext sql_schema_statement() throws RecognitionException {
		Sql_schema_statementContext _localctx = new Sql_schema_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_schema_statement);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				sql_schema_definition_statement();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__17:
			case T__18:
			case T__21:
			case T__22:
			case T__44:
			case T__45:
			case T__50:
			case T__51:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				sql_schema_manipulation_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_schema_definition_statementContext extends ParserRuleContext {
		public Schema_definitionContext schema_definition() {
			return getRuleContext(Schema_definitionContext.class,0);
		}
		public Table_definitionContext table_definition() {
			return getRuleContext(Table_definitionContext.class,0);
		}
		public Sql_schema_definition_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_schema_definition_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_schema_definition_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_schema_definition_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_schema_definition_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_schema_definition_statementContext sql_schema_definition_statement() throws RecognitionException {
		Sql_schema_definition_statementContext _localctx = new Sql_schema_definition_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_schema_definition_statement);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				schema_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				table_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_schema_manipulation_statementContext extends ParserRuleContext {
		public Drop_schema_statementContext drop_schema_statement() {
			return getRuleContext(Drop_schema_statementContext.class,0);
		}
		public Alter_table_statementContext alter_table_statement() {
			return getRuleContext(Alter_table_statementContext.class,0);
		}
		public Drop_table_statementContext drop_table_statement() {
			return getRuleContext(Drop_table_statementContext.class,0);
		}
		public Alter_database_statementContext alter_database_statement() {
			return getRuleContext(Alter_database_statementContext.class,0);
		}
		public Use_schema_statementContext use_schema_statement() {
			return getRuleContext(Use_schema_statementContext.class,0);
		}
		public Show_schema_statementContext show_schema_statement() {
			return getRuleContext(Show_schema_statementContext.class,0);
		}
		public Rename_table_statementContext rename_table_statement() {
			return getRuleContext(Rename_table_statementContext.class,0);
		}
		public Show_table_statementContext show_table_statement() {
			return getRuleContext(Show_table_statementContext.class,0);
		}
		public Show_column_statementContext show_column_statement() {
			return getRuleContext(Show_column_statementContext.class,0);
		}
		public DmlstatementContext dmlstatement() {
			return getRuleContext(DmlstatementContext.class,0);
		}
		public Sql_schema_manipulation_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_schema_manipulation_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_schema_manipulation_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_schema_manipulation_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_schema_manipulation_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_schema_manipulation_statementContext sql_schema_manipulation_statement() throws RecognitionException {
		Sql_schema_manipulation_statementContext _localctx = new Sql_schema_manipulation_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sql_schema_manipulation_statement);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				drop_schema_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				alter_table_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				drop_table_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				alter_database_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				use_schema_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				show_schema_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				rename_table_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				show_table_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				show_column_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
				dmlstatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_data_statementContext extends ParserRuleContext {
		public Select_valueContext select_value() {
			return getRuleContext(Select_valueContext.class,0);
		}
		public Sql_data_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_data_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_data_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_data_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_data_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_data_statementContext sql_data_statement() throws RecognitionException {
		Sql_data_statementContext _localctx = new Sql_data_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sql_data_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			select_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public Schema_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSchema_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSchema_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSchema_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_definitionContext schema_definition() throws RecognitionException {
		Schema_definitionContext _localctx = new Schema_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_schema_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(117);
			match(ID);
			setState(118);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public Table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_definitionContext table_definition() throws RecognitionException {
		Table_definitionContext _localctx = new Table_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(122);
			match(ID);
			setState(123);
			match(T__7);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				column();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(129);
			match(T__8);
			setState(130);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_schema_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public Drop_schema_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_schema_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_schema_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_schema_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_schema_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_schema_statementContext drop_schema_statement() throws RecognitionException {
		Drop_schema_statementContext _localctx = new Drop_schema_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_drop_schema_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(134);
			match(ID);
			setState(135);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public AccionContext accion() {
			return getRuleContext(AccionContext.class,0);
		}
		public Alter_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_statementContext alter_table_statement() throws RecognitionException {
		Alter_table_statementContext _localctx = new Alter_table_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alter_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(139);
			match(ID);
			setState(140);
			accion();
			setState(141);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public Drop_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_statementContext drop_table_statement() throws RecognitionException {
		Drop_table_statementContext _localctx = new Drop_table_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_drop_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(145);
			match(ID);
			setState(146);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_database_statementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SqlParser.ID, i);
		}
		public Alter_database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_database_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_database_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_database_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_database_statementContext alter_database_statement() throws RecognitionException {
		Alter_database_statementContext _localctx = new Alter_database_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alter_database_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(150);
			match(ID);
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(153);
			match(ID);
			setState(154);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_schema_statementContext extends ParserRuleContext {
		public Show_schema_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_schema_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShow_schema_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShow_schema_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShow_schema_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_schema_statementContext show_schema_statement() throws RecognitionException {
		Show_schema_statementContext _localctx = new Show_schema_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_show_schema_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(158);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_schema_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public Use_schema_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_schema_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUse_schema_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUse_schema_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUse_schema_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_schema_statementContext use_schema_statement() throws RecognitionException {
		Use_schema_statementContext _localctx = new Use_schema_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_use_schema_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(162);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(164);
			match(ID);
			setState(165);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
	 
		public ColumnContext() { }
		public void copyFrom(ColumnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefcolumnaContext extends ColumnContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public Tipo_literalContext tipo_literal() {
			return getRuleContext(Tipo_literalContext.class,0);
		}
		public DefcolumnaContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDefcolumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDefcolumna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDefcolumna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefconstraintContext extends ColumnContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public DefconstraintContext(ColumnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDefconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDefconstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDefconstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new DefcolumnaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(ID);
				setState(168);
				tipo_literal();
				setState(170);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(169);
					match(T__23);
					}
				}

				}
				break;
			case 2:
				_localctx = new DefconstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				constraint();
				setState(174);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(173);
					match(T__23);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_literalContext extends ParserRuleContext {
		public Tipo_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_literal; }
	 
		public Tipo_literalContext() { }
		public void copyFrom(Tipo_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TipoDateContext extends Tipo_literalContext {
		public TipoDateContext(Tipo_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTipoDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTipoDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTipoDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoIntContext extends Tipo_literalContext {
		public TipoIntContext(Tipo_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTipoInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTipoInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTipoInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoFloatContext extends Tipo_literalContext {
		public TipoFloatContext(Tipo_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTipoFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTipoFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTipoFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoCharContext extends Tipo_literalContext {
		public TerminalNode NUM() { return getToken(SqlParser.NUM, 0); }
		public TipoCharContext(Tipo_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTipoChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTipoChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTipoChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_literalContext tipo_literal() throws RecognitionException {
		Tipo_literalContext _localctx = new Tipo_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_literal);
		try {
			setState(184);
			switch (_input.LA(1)) {
			case T__24:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new TipoCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(T__26);
				setState(181);
				match(NUM);
				setState(182);
				match(T__8);
				}
				break;
			case T__27:
				_localctx = new TipoDateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(T__27);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public ConstraintTypeContext constraintType() {
			return getRuleContext(ConstraintTypeContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			constraintType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintTypeContext extends ParserRuleContext {
		public ConstraintTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintType; }
	 
		public ConstraintTypeContext() { }
		public void copyFrom(ConstraintTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForeignKContext extends ConstraintTypeContext {
		public List<TerminalNode> ID() { return getTokens(SqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SqlParser.ID, i);
		}
		public ForeignKContext(ConstraintTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeignK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeignK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeignK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckContext extends ConstraintTypeContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CheckContext(ConstraintTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryKContext extends ConstraintTypeContext {
		public List<TerminalNode> ID() { return getTokens(SqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SqlParser.ID, i);
		}
		public PrimaryKContext(ConstraintTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPrimaryK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPrimaryK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPrimaryK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintTypeContext constraintType() throws RecognitionException {
		ConstraintTypeContext _localctx = new ConstraintTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constraintType);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new PrimaryKContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(ID);
				setState(189);
				match(T__28);
				setState(190);
				match(T__29);
				setState(191);
				match(T__7);
				setState(192);
				match(ID);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(193);
					match(T__23);
					setState(194);
					match(ID);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new ForeignKContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(ID);
				setState(202);
				match(T__30);
				setState(203);
				match(T__29);
				setState(204);
				match(T__7);
				setState(205);
				match(ID);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(206);
					match(T__23);
					setState(207);
					match(ID);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(T__8);
				setState(214);
				match(ID);
				setState(215);
				match(T__7);
				setState(216);
				match(ID);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(217);
					match(T__23);
					setState(218);
					match(ID);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				match(T__8);
				}
				break;
			case 3:
				_localctx = new CheckContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(ID);
				setState(226);
				match(T__31);
				setState(227);
				match(T__7);
				setState(228);
				expression(0);
				setState(229);
				match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_table_statementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SqlParser.ID, i);
		}
		public Rename_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRename_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRename_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRename_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rename_table_statementContext rename_table_statement() throws RecognitionException {
		Rename_table_statementContext _localctx = new Rename_table_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rename_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(235);
			match(ID);
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(238);
			match(ID);
			setState(239);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccionContext extends ParserRuleContext {
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
	 
		public AccionContext() { }
		public void copyFrom(AccionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddColumnContext extends AccionContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public Tipo_literalContext tipo_literal() {
			return getRuleContext(Tipo_literalContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public AddColumnContext(AccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropConstraintContext extends AccionContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public DropConstraintContext(AccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDropConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDropConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDropConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddConstraintContext extends AccionContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public AddConstraintContext(AccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAddConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAddConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAddConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends AccionContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public DropColumnContext(AccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_accion);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==T__32 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(242);
				_la = _input.LA(1);
				if ( !(_la==T__34 || _la==T__35) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(243);
				match(ID);
				setState(244);
				tipo_literal();
				{
				setState(245);
				constraint();
				}
				}
				break;
			case 2:
				_localctx = new AddConstraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==T__32 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(248);
				constraint();
				}
				break;
			case 3:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(250);
				_la = _input.LA(1);
				if ( !(_la==T__34 || _la==T__35) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(251);
				match(ID);
				}
				break;
			case 4:
				_localctx = new DropConstraintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(254);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_table_statementContext extends ParserRuleContext {
		public Show_table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShow_table_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShow_table_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShow_table_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_table_statementContext show_table_statement() throws RecognitionException {
		Show_table_statementContext _localctx = new Show_table_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_show_table_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(259);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_column_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public Show_column_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_column_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterShow_column_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitShow_column_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitShow_column_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_column_statementContext show_column_statement() throws RecognitionException {
		Show_column_statementContext _localctx = new Show_column_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_show_column_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(264);
			match(ID);
			setState(265);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlstatementContext extends ParserRuleContext {
		public Insert_valueContext insert_value() {
			return getRuleContext(Insert_valueContext.class,0);
		}
		public Update_valueContext update_value() {
			return getRuleContext(Update_valueContext.class,0);
		}
		public Delete_valueContext delete_value() {
			return getRuleContext(Delete_valueContext.class,0);
		}
		public Select_valueContext select_value() {
			return getRuleContext(Select_valueContext.class,0);
		}
		public DmlstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDmlstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDmlstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDmlstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlstatementContext dmlstatement() throws RecognitionException {
		DmlstatementContext _localctx = new DmlstatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dmlstatement);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				insert_value();
				}
				break;
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				update_value();
				}
				break;
			case T__57:
			case T__58:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				delete_value();
				}
				break;
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				select_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_valueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SqlParser.ID, i);
		}
		public List_valuesContext list_values() {
			return getRuleContext(List_valuesContext.class,0);
		}
		public Insert_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsert_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsert_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsert_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_valueContext insert_value() throws RecognitionException {
		Insert_valueContext _localctx = new Insert_valueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_insert_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__45) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(275);
			match(ID);
			setState(288);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(276);
				match(T__7);
				setState(285);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					{
					setState(277);
					match(ID);
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__23) {
						{
						{
						setState(278);
						match(T__23);
						setState(279);
						match(ID);
						}
						}
						setState(284);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(287);
				match(T__8);
				}
			}

			setState(290);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__49) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(291);
			match(T__7);
			setState(292);
			list_values();
			setState(293);
			match(T__8);
			setState(294);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_valueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SqlParser.ID, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Update_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUpdate_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_valueContext update_value() throws RecognitionException {
		Update_valueContext _localctx = new Update_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_update_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==T__50 || _la==T__51) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(297);
			match(ID);
			setState(298);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==T__53) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(299);
			match(ID);
			setState(300);
			match(T__54);
			setState(301);
			literal();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(302);
				match(T__23);
				setState(303);
				match(ID);
				setState(304);
				match(T__54);
				setState(305);
				literal();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			_la = _input.LA(1);
			if (_la==T__55 || _la==T__56) {
				{
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==T__55 || _la==T__56) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(312);
				expression(0);
				}
			}

			setState(315);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Delete_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDelete_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_valueContext delete_value() throws RecognitionException {
		Delete_valueContext _localctx = new Delete_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_delete_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==T__57 || _la==T__58) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(319);
			match(ID);
			setState(322);
			_la = _input.LA(1);
			if (_la==T__55 || _la==T__56) {
				{
				setState(320);
				_la = _input.LA(1);
				if ( !(_la==T__55 || _la==T__56) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(321);
				expression(0);
				}
			}

			setState(324);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_valueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SqlParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Select_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_valueContext select_value() throws RecognitionException {
		Select_valueContext _localctx = new Select_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_select_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !(_la==T__59 || _la==T__60) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(336);
			switch (_input.LA(1)) {
			case T__61:
				{
				setState(327);
				match(T__61);
				}
				break;
			case ID:
				{
				setState(328);
				match(ID);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(329);
					match(T__23);
					setState(330);
					match(ID);
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(339);
			match(ID);
			setState(342);
			_la = _input.LA(1);
			if (_la==T__55 || _la==T__56) {
				{
				setState(340);
				_la = _input.LA(1);
				if ( !(_la==T__55 || _la==T__56) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(341);
				expression(0);
				}
			}

			setState(350);
			_la = _input.LA(1);
			if (_la==T__62 || _la==T__63) {
				{
				setState(344);
				_la = _input.LA(1);
				if ( !(_la==T__62 || _la==T__63) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==T__64 || _la==T__65) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(348);
				switch (_input.LA(1)) {
				case T__66:
				case T__67:
					{
					setState(346);
					_la = _input.LA(1);
					if ( !(_la==T__66 || _la==T__67) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case T__68:
				case T__69:
					{
					setState(347);
					_la = _input.LA(1);
					if ( !(_la==T__68 || _la==T__69) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(352);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_valuesContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterList_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitList_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitList_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_valuesContext list_values() throws RecognitionException {
		List_valuesContext _localctx = new List_valuesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_list_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(354);
			literal();
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(355);
				match(T__23);
				setState(356);
				literal();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				int_literal();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				float_literal();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				date_literal();
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				char_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SqlParser.NUM, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInt_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInt_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_literalContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(SqlParser.FLOAT, 0); }
		public Float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFloat_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFloat_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFloat_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_literalContext float_literal() throws RecognitionException {
		Float_literalContext _localctx = new Float_literalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_float_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(SqlParser.DATE, 0); }
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode Char() { return getToken(SqlParser.Char, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitChar_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitChar_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(Char);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
	 
		public Rel_opContext() { }
		public void copyFrom(Rel_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelLContext extends Rel_opContext {
		public RelLContext(Rel_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelLEContext extends Rel_opContext {
		public RelLEContext(Rel_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqEContext extends Rel_opContext {
		public EqEContext(Rel_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterEqE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitEqE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitEqE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelBEContext extends Rel_opContext {
		public RelBEContext(Rel_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelBE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelBE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelBE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqNEContext extends Rel_opContext {
		public EqNEContext(Rel_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterEqNE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitEqNE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitEqNE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RekBContext extends Rel_opContext {
		public RekBContext(Rel_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRekB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRekB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRekB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rel_op);
		try {
			setState(382);
			switch (_input.LA(1)) {
			case T__70:
				_localctx = new RelLContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(T__70);
				}
				break;
			case T__71:
				_localctx = new RekBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(T__71);
				}
				break;
			case T__72:
				_localctx = new RelLEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(T__72);
				}
				break;
			case T__73:
				_localctx = new RelBEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				match(T__73);
				}
				break;
			case T__54:
				_localctx = new EqEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				match(T__54);
				}
				break;
			case T__74:
				_localctx = new EqNEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(381);
				match(T__74);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_op2Context extends ParserRuleContext {
		public Rel_op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op2; }
	 
		public Rel_op2Context() { }
		public void copyFrom(Rel_op2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqE2Context extends Rel_op2Context {
		public EqE2Context(Rel_op2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterEqE2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitEqE2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitEqE2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelLE2Context extends Rel_op2Context {
		public RelLE2Context(Rel_op2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelLE2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelLE2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelLE2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelL2Context extends Rel_op2Context {
		public RelL2Context(Rel_op2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelL2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelL2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelL2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqNE2Context extends Rel_op2Context {
		public EqNE2Context(Rel_op2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterEqNE2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitEqNE2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitEqNE2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RekB2Context extends Rel_op2Context {
		public RekB2Context(Rel_op2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRekB2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRekB2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRekB2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelBE2Context extends Rel_op2Context {
		public RelBE2Context(Rel_op2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelBE2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelBE2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelBE2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_op2Context rel_op2() throws RecognitionException {
		Rel_op2Context _localctx = new Rel_op2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_rel_op2);
		try {
			setState(390);
			switch (_input.LA(1)) {
			case T__70:
				_localctx = new RelL2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(T__70);
				}
				break;
			case T__71:
				_localctx = new RekB2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(T__71);
				}
				break;
			case T__72:
				_localctx = new RelLE2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(T__72);
				}
				break;
			case T__73:
				_localctx = new RelBE2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(T__73);
				}
				break;
			case T__54:
				_localctx = new EqE2Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				match(T__54);
				}
				break;
			case T__74:
				_localctx = new EqNE2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
				match(T__74);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_op3Context extends ParserRuleContext {
		public Rel_op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op3; }
	 
		public Rel_op3Context() { }
		public void copyFrom(Rel_op3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqNE3Context extends Rel_op3Context {
		public EqNE3Context(Rel_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterEqNE3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitEqNE3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitEqNE3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelL3Context extends Rel_op3Context {
		public RelL3Context(Rel_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelL3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelL3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelL3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqE3Context extends Rel_op3Context {
		public EqE3Context(Rel_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterEqE3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitEqE3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitEqE3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelLE3Context extends Rel_op3Context {
		public RelLE3Context(Rel_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelLE3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelLE3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelLE3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RekB3Context extends Rel_op3Context {
		public RekB3Context(Rel_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRekB3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRekB3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRekB3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelBE3Context extends Rel_op3Context {
		public RelBE3Context(Rel_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelBE3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelBE3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelBE3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_op3Context rel_op3() throws RecognitionException {
		Rel_op3Context _localctx = new Rel_op3Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_rel_op3);
		try {
			setState(398);
			switch (_input.LA(1)) {
			case T__70:
				_localctx = new RelL3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(T__70);
				}
				break;
			case T__71:
				_localctx = new RekB3Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(T__71);
				}
				break;
			case T__72:
				_localctx = new RelLE3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(T__72);
				}
				break;
			case T__73:
				_localctx = new RelBE3Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				match(T__73);
				}
				break;
			case T__54:
				_localctx = new EqE3Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				match(T__54);
				}
				break;
			case T__74:
				_localctx = new EqNE3Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(397);
				match(T__74);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_opContext extends ParserRuleContext {
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
	 
		public Cond_opContext() { }
		public void copyFrom(Cond_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cond_op1Context extends Cond_opContext {
		public Cond_op1Context(Cond_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCond_op1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCond_op1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCond_op1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_op2Context extends Cond_opContext {
		public Cond_op2Context(Cond_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCond_op2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCond_op2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCond_op2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cond_op);
		try {
			setState(402);
			switch (_input.LA(1)) {
			case T__75:
				_localctx = new Cond_op1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(T__75);
				}
				break;
			case T__76:
				_localctx = new Cond_op2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(T__76);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression2Context extends ExpressionContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expression2Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression1Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expression1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Expression2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(405);
			expr1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression1Context(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(407);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(408);
					cond_op();
					setState(409);
					expr1(0);
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr11Context extends Expr1Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Expr11Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr11(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr12Context extends Expr1Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Expr12Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr12(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr12(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		return expr1(0);
	}

	private Expr1Context expr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr1Context _localctx = new Expr1Context(_ctx, _parentState);
		Expr1Context _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expr1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Expr12Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(417);
			expr3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr11Context(new Expr1Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr1);
					setState(419);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(420);
					cond_op();
					setState(421);
					expr3(0);
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr3Context extends ParserRuleContext {
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	 
		public Expr3Context() { }
		public void copyFrom(Expr3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr31Context extends Expr3Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public UnifactorContext unifactor() {
			return getRuleContext(UnifactorContext.class,0);
		}
		public Expr31Context(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr31(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr31(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr31(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr33Context extends Expr3Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Rel_op2Context rel_op2() {
			return getRuleContext(Rel_op2Context.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Expr33Context(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr33(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr33(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr33(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr32Context extends Expr3Context {
		public UnifactorContext unifactor() {
			return getRuleContext(UnifactorContext.class,0);
		}
		public Expr32Context(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr34Context extends Expr3Context {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Rel_op3Context rel_op3() {
			return getRuleContext(Rel_op3Context.class,0);
		}
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Expr34Context(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr34(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr34(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr34(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		return expr3(0);
	}

	private Expr3Context expr3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr3Context _localctx = new Expr3Context(_ctx, _parentState);
		Expr3Context _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			switch (_input.LA(1)) {
			case T__7:
			case T__77:
			case ID:
				{
				_localctx = new Expr32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(429);
				unifactor();
				}
				break;
			case NUM:
			case FLOAT:
			case Char:
			case DATE:
				{
				_localctx = new Expr34Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(430);
				literal();
				setState(431);
				rel_op3();
				setState(432);
				expr3(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(444);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new Expr31Context(new Expr3Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr3);
						setState(436);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(437);
						rel_op();
						setState(438);
						unifactor();
						}
						break;
					case 2:
						{
						_localctx = new Expr33Context(new Expr3Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr3);
						setState(440);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(441);
						rel_op2();
						setState(442);
						literal();
						}
						break;
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnifactorContext extends ParserRuleContext {
		public UnifactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unifactor; }
	 
		public UnifactorContext() { }
		public void copyFrom(UnifactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UniFactorFactorContext extends UnifactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UniFactorFactorContext(UnifactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUniFactorFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUniFactorFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUniFactorFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UniFactorNotContext extends UnifactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UniFactorNotContext(UnifactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUniFactorNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUniFactorNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUniFactorNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnifactorContext unifactor() throws RecognitionException {
		UnifactorContext _localctx = new UnifactorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unifactor);
		try {
			setState(452);
			switch (_input.LA(1)) {
			case T__77:
				_localctx = new UniFactorNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(T__77);
				setState(450);
				factor();
				}
				break;
			case T__7:
			case ID:
				_localctx = new UniFactorFactorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactorIDContext extends FactorContext {
		public TerminalNode ID() { return getToken(SqlParser.ID, 0); }
		public FactorIDContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFactorID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFactorID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFactorID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorExpressionContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFactorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFactorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFactorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorID2Context extends FactorContext {
		public List<TerminalNode> ID() { return getTokens(SqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SqlParser.ID, i);
		}
		public FactorID2Context(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFactorID2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFactorID2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFactorID2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_factor);
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new FactorExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(T__7);
				setState(455);
				expression(0);
				setState(456);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new FactorIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(ID);
				}
				break;
			case 3:
				_localctx = new FactorID2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				match(ID);
				setState(460);
				matchWildcard();
				setState(461);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 37:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 38:
			return expr1_sempred((Expr1Context)_localctx, predIndex);
		case 39:
			return expr3_sempred((Expr3Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr1_sempred(Expr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr3_sempred(Expr3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Z\u01d3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2X\n\2\r\2\16\2Y\3\3\3\3\5\3^\n\3\3\4\3\4\5\4b\n\4\3\5\3\5\5\5f\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6r\n\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\6\t\u0080\n\t\r\t\16\t\u0081\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\5\17"+
		"\u00a5\n\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00ad\n\20\3\20\3\20\5"+
		"\20\u00b1\n\20\5\20\u00b3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bb"+
		"\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c6\n\23\f\23"+
		"\16\23\u00c9\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d3"+
		"\n\23\f\23\16\23\u00d6\13\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00de"+
		"\n\23\f\23\16\23\u00e1\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ea"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0102\n\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0112"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u011b\n\31\f\31\16\31\u011e"+
		"\13\31\5\31\u0120\n\31\3\31\5\31\u0123\n\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0135\n\32"+
		"\f\32\16\32\u0138\13\32\3\32\3\32\5\32\u013c\n\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0145\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u014e\n\34\f\34\16\34\u0151\13\34\5\34\u0153\n\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0159\n\34\3\34\3\34\3\34\3\34\5\34\u015f\n\34\5\34\u0161\n\34\3"+
		"\34\3\34\3\35\3\35\3\35\7\35\u0168\n\35\f\35\16\35\u016b\13\35\3\36\3"+
		"\36\3\36\3\36\5\36\u0171\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\5#\u0181\n#\3$\3$\3$\3$\3$\3$\5$\u0189\n$\3%\3%\3%\3%\3%\3%\5"+
		"%\u0191\n%\3&\3&\5&\u0195\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u019e\n\'"+
		"\f\'\16\'\u01a1\13\'\3(\3(\3(\3(\3(\3(\3(\7(\u01aa\n(\f(\16(\u01ad\13"+
		"(\3)\3)\3)\3)\3)\3)\5)\u01b5\n)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u01bf\n)\f"+
		")\16)\u01c2\13)\3*\3*\3*\5*\u01c7\n*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01d1"+
		"\n+\3+\2\5LNP,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRT\2\36\3\2\3\4\3\2\5\6\3\2\b\t\3\2\f\r\3\2\16\17\3\2"+
		"\20\21\3\2\22\23\3\2\24\25\3\2\26\27\3\2\30\31\3\2#$\3\2%&\3\2\'(\3\2"+
		")*\3\2+,\3\2-.\3\2/\60\3\2\61\62\3\2\63\64\3\2\65\66\3\2\678\3\2:;\3\2"+
		"<=\3\2>?\3\2AB\3\2CD\3\2EF\3\2GH\u01ef\2W\3\2\2\2\4]\3\2\2\2\6a\3\2\2"+
		"\2\be\3\2\2\2\nq\3\2\2\2\fs\3\2\2\2\16u\3\2\2\2\20z\3\2\2\2\22\u0086\3"+
		"\2\2\2\24\u008b\3\2\2\2\26\u0091\3\2\2\2\30\u0096\3\2\2\2\32\u009e\3\2"+
		"\2\2\34\u00a2\3\2\2\2\36\u00b2\3\2\2\2 \u00ba\3\2\2\2\"\u00bc\3\2\2\2"+
		"$\u00e9\3\2\2\2&\u00eb\3\2\2\2(\u0101\3\2\2\2*\u0103\3\2\2\2,\u0107\3"+
		"\2\2\2.\u0111\3\2\2\2\60\u0113\3\2\2\2\62\u012a\3\2\2\2\64\u013f\3\2\2"+
		"\2\66\u0148\3\2\2\28\u0164\3\2\2\2:\u0170\3\2\2\2<\u0172\3\2\2\2>\u0174"+
		"\3\2\2\2@\u0176\3\2\2\2B\u0178\3\2\2\2D\u0180\3\2\2\2F\u0188\3\2\2\2H"+
		"\u0190\3\2\2\2J\u0194\3\2\2\2L\u0196\3\2\2\2N\u01a2\3\2\2\2P\u01b4\3\2"+
		"\2\2R\u01c6\3\2\2\2T\u01d0\3\2\2\2VX\5\4\3\2WV\3\2\2\2XY\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\3\3\2\2\2[^\5\6\4\2\\^\5\f\7\2][\3\2\2\2]\\\3\2\2\2^\5"+
		"\3\2\2\2_b\5\b\5\2`b\5\n\6\2a_\3\2\2\2a`\3\2\2\2b\7\3\2\2\2cf\5\16\b\2"+
		"df\5\20\t\2ec\3\2\2\2ed\3\2\2\2f\t\3\2\2\2gr\5\22\n\2hr\5\24\13\2ir\5"+
		"\26\f\2jr\5\30\r\2kr\5\34\17\2lr\5\32\16\2mr\5&\24\2nr\5*\26\2or\5,\27"+
		"\2pr\5.\30\2qg\3\2\2\2qh\3\2\2\2qi\3\2\2\2qj\3\2\2\2qk\3\2\2\2ql\3\2\2"+
		"\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\13\3\2\2\2st\5\66\34\2t\r"+
		"\3\2\2\2uv\t\2\2\2vw\t\3\2\2wx\7U\2\2xy\7\7\2\2y\17\3\2\2\2z{\t\2\2\2"+
		"{|\t\4\2\2|}\7U\2\2}\177\7\n\2\2~\u0080\5\36\20\2\177~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\7\13\2\2\u0084\u0085\7\7\2\2\u0085\21\3\2\2\2\u0086\u0087\t\5\2"+
		"\2\u0087\u0088\t\3\2\2\u0088\u0089\7U\2\2\u0089\u008a\7\7\2\2\u008a\23"+
		"\3\2\2\2\u008b\u008c\t\6\2\2\u008c\u008d\t\4\2\2\u008d\u008e\7U\2\2\u008e"+
		"\u008f\5(\25\2\u008f\u0090\7\7\2\2\u0090\25\3\2\2\2\u0091\u0092\t\5\2"+
		"\2\u0092\u0093\t\4\2\2\u0093\u0094\7U\2\2\u0094\u0095\7\7\2\2\u0095\27"+
		"\3\2\2\2\u0096\u0097\t\6\2\2\u0097\u0098\t\3\2\2\u0098\u0099\7U\2\2\u0099"+
		"\u009a\t\7\2\2\u009a\u009b\t\b\2\2\u009b\u009c\7U\2\2\u009c\u009d\7\7"+
		"\2\2\u009d\31\3\2\2\2\u009e\u009f\t\t\2\2\u009f\u00a0\t\n\2\2\u00a0\u00a1"+
		"\7\7\2\2\u00a1\33\3\2\2\2\u00a2\u00a4\t\13\2\2\u00a3\u00a5\t\3\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7U"+
		"\2\2\u00a7\u00a8\7\7\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\7U\2\2\u00aa\u00ac"+
		"\5 \21\2\u00ab\u00ad\7\32\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ad\u00b3\3\2\2\2\u00ae\u00b0\5\"\22\2\u00af\u00b1\7\32\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2"+
		"\u00ae\3\2\2\2\u00b3\37\3\2\2\2\u00b4\u00bb\7\33\2\2\u00b5\u00bb\7\34"+
		"\2\2\u00b6\u00b7\7\35\2\2\u00b7\u00b8\7V\2\2\u00b8\u00bb\7\13\2\2\u00b9"+
		"\u00bb\7\36\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3"+
		"\2\2\2\u00ba\u00b9\3\2\2\2\u00bb!\3\2\2\2\u00bc\u00bd\5$\23\2\u00bd#\3"+
		"\2\2\2\u00be\u00bf\7U\2\2\u00bf\u00c0\7\37\2\2\u00c0\u00c1\7 \2\2\u00c1"+
		"\u00c2\7\n\2\2\u00c2\u00c7\7U\2\2\u00c3\u00c4\7\32\2\2\u00c4\u00c6\7U"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00ea\7\13"+
		"\2\2\u00cb\u00cc\7U\2\2\u00cc\u00cd\7!\2\2\u00cd\u00ce\7 \2\2\u00ce\u00cf"+
		"\7\n\2\2\u00cf\u00d4\7U\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00d3\7U\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\13\2\2\u00d8"+
		"\u00d9\7U\2\2\u00d9\u00da\7\n\2\2\u00da\u00df\7U\2\2\u00db\u00dc\7\32"+
		"\2\2\u00dc\u00de\7U\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00ea\7\13\2\2\u00e3\u00e4\7U\2\2\u00e4\u00e5\7\"\2\2\u00e5"+
		"\u00e6\7\n\2\2\u00e6\u00e7\5L\'\2\u00e7\u00e8\7\13\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00be\3\2\2\2\u00e9\u00cb\3\2\2\2\u00e9\u00e3\3\2\2\2\u00ea"+
		"%\3\2\2\2\u00eb\u00ec\t\6\2\2\u00ec\u00ed\t\4\2\2\u00ed\u00ee\7U\2\2\u00ee"+
		"\u00ef\t\7\2\2\u00ef\u00f0\t\b\2\2\u00f0\u00f1\7U\2\2\u00f1\u00f2\7\7"+
		"\2\2\u00f2\'\3\2\2\2\u00f3\u00f4\t\f\2\2\u00f4\u00f5\t\r\2\2\u00f5\u00f6"+
		"\7U\2\2\u00f6\u00f7\5 \21\2\u00f7\u00f8\5\"\22\2\u00f8\u0102\3\2\2\2\u00f9"+
		"\u00fa\t\f\2\2\u00fa\u0102\5\"\22\2\u00fb\u00fc\t\5\2\2\u00fc\u00fd\t"+
		"\r\2\2\u00fd\u0102\7U\2\2\u00fe\u00ff\t\5\2\2\u00ff\u0100\t\16\2\2\u0100"+
		"\u0102\7U\2\2\u0101\u00f3\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u00fb\3\2"+
		"\2\2\u0101\u00fe\3\2\2\2\u0102)\3\2\2\2\u0103\u0104\t\t\2\2\u0104\u0105"+
		"\t\17\2\2\u0105\u0106\7\7\2\2\u0106+\3\2\2\2\u0107\u0108\t\t\2\2\u0108"+
		"\u0109\t\20\2\2\u0109\u010a\t\21\2\2\u010a\u010b\7U\2\2\u010b\u010c\7"+
		"\7\2\2\u010c-\3\2\2\2\u010d\u0112\5\60\31\2\u010e\u0112\5\62\32\2\u010f"+
		"\u0112\5\64\33\2\u0110\u0112\5\66\34\2\u0111\u010d\3\2\2\2\u0111\u010e"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112/\3\2\2\2\u0113"+
		"\u0114\t\22\2\2\u0114\u0115\t\23\2\2\u0115\u0122\7U\2\2\u0116\u011f\7"+
		"\n\2\2\u0117\u011c\7U\2\2\u0118\u0119\7\32\2\2\u0119\u011b\7U\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0117\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\7\13\2\2\u0122\u0116\3"+
		"\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\t\24\2\2\u0125"+
		"\u0126\7\n\2\2\u0126\u0127\58\35\2\u0127\u0128\7\13\2\2\u0128\u0129\7"+
		"\7\2\2\u0129\61\3\2\2\2\u012a\u012b\t\25\2\2\u012b\u012c\7U\2\2\u012c"+
		"\u012d\t\26\2\2\u012d\u012e\7U\2\2\u012e\u012f\79\2\2\u012f\u0136\5:\36"+
		"\2\u0130\u0131\7\32\2\2\u0131\u0132\7U\2\2\u0132\u0133\79\2\2\u0133\u0135"+
		"\5:\36\2\u0134\u0130\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u013b\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\t\27"+
		"\2\2\u013a\u013c\5L\'\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\7\7\2\2\u013e\63\3\2\2\2\u013f\u0140\t\30\2"+
		"\2\u0140\u0141\t\21\2\2\u0141\u0144\7U\2\2\u0142\u0143\t\27\2\2\u0143"+
		"\u0145\5L\'\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0147\7\7\2\2\u0147\65\3\2\2\2\u0148\u0152\t\31\2\2\u0149\u0153"+
		"\7@\2\2\u014a\u014f\7U\2\2\u014b\u014c\7\32\2\2\u014c\u014e\7U\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0149\3\2\2\2\u0152"+
		"\u014a\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\t\21\2\2\u0155\u0158\7"+
		"U\2\2\u0156\u0157\t\27\2\2\u0157\u0159\5L\'\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u0160\3\2\2\2\u015a\u015b\t\32\2\2\u015b\u015e\t"+
		"\33\2\2\u015c\u015f\t\34\2\2\u015d\u015f\t\35\2\2\u015e\u015c\3\2\2\2"+
		"\u015e\u015d\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7\7\2\2\u0163\67\3\2\2\2\u0164"+
		"\u0169\5:\36\2\u0165\u0166\7\32\2\2\u0166\u0168\5:\36\2\u0167\u0165\3"+
		"\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"9\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0171\5<\37\2\u016d\u0171\5> \2\u016e"+
		"\u0171\5@!\2\u016f\u0171\5B\"\2\u0170\u016c\3\2\2\2\u0170\u016d\3\2\2"+
		"\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171;\3\2\2\2\u0172\u0173"+
		"\7V\2\2\u0173=\3\2\2\2\u0174\u0175\7W\2\2\u0175?\3\2\2\2\u0176\u0177\7"+
		"Y\2\2\u0177A\3\2\2\2\u0178\u0179\7X\2\2\u0179C\3\2\2\2\u017a\u0181\7I"+
		"\2\2\u017b\u0181\7J\2\2\u017c\u0181\7K\2\2\u017d\u0181\7L\2\2\u017e\u0181"+
		"\79\2\2\u017f\u0181\7M\2\2\u0180\u017a\3\2\2\2\u0180\u017b\3\2\2\2\u0180"+
		"\u017c\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2"+
		"\2\2\u0181E\3\2\2\2\u0182\u0189\7I\2\2\u0183\u0189\7J\2\2\u0184\u0189"+
		"\7K\2\2\u0185\u0189\7L\2\2\u0186\u0189\79\2\2\u0187\u0189\7M\2\2\u0188"+
		"\u0182\3\2\2\2\u0188\u0183\3\2\2\2\u0188\u0184\3\2\2\2\u0188\u0185\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189G\3\2\2\2\u018a\u0191"+
		"\7I\2\2\u018b\u0191\7J\2\2\u018c\u0191\7K\2\2\u018d\u0191\7L\2\2\u018e"+
		"\u0191\79\2\2\u018f\u0191\7M\2\2\u0190\u018a\3\2\2\2\u0190\u018b\3\2\2"+
		"\2\u0190\u018c\3\2\2\2\u0190\u018d\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u018f"+
		"\3\2\2\2\u0191I\3\2\2\2\u0192\u0195\7N\2\2\u0193\u0195\7O\2\2\u0194\u0192"+
		"\3\2\2\2\u0194\u0193\3\2\2\2\u0195K\3\2\2\2\u0196\u0197\b\'\1\2\u0197"+
		"\u0198\5N(\2\u0198\u019f\3\2\2\2\u0199\u019a\f\4\2\2\u019a\u019b\5J&\2"+
		"\u019b\u019c\5N(\2\u019c\u019e\3\2\2\2\u019d\u0199\3\2\2\2\u019e\u01a1"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0M\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a3\b(\1\2\u01a3\u01a4\5P)\2\u01a4\u01ab\3\2\2"+
		"\2\u01a5\u01a6\f\4\2\2\u01a6\u01a7\5J&\2\u01a7\u01a8\5P)\2\u01a8\u01aa"+
		"\3\2\2\2\u01a9\u01a5\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01acO\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\b)\1\2\u01af"+
		"\u01b5\5R*\2\u01b0\u01b1\5:\36\2\u01b1\u01b2\5H%\2\u01b2\u01b3\5P)\3\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5\u01c0\3\2"+
		"\2\2\u01b6\u01b7\f\6\2\2\u01b7\u01b8\5D#\2\u01b8\u01b9\5R*\2\u01b9\u01bf"+
		"\3\2\2\2\u01ba\u01bb\f\4\2\2\u01bb\u01bc\5F$\2\u01bc\u01bd\5:\36\2\u01bd"+
		"\u01bf\3\2\2\2\u01be\u01b6\3\2\2\2\u01be\u01ba\3\2\2\2\u01bf\u01c2\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1Q\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c3\u01c4\7P\2\2\u01c4\u01c7\5T+\2\u01c5\u01c7\5T+\2\u01c6"+
		"\u01c3\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7S\3\2\2\2\u01c8\u01c9\7\n\2\2"+
		"\u01c9\u01ca\5L\'\2\u01ca\u01cb\7\13\2\2\u01cb\u01d1\3\2\2\2\u01cc\u01d1"+
		"\7U\2\2\u01cd\u01ce\7U\2\2\u01ce\u01cf\13\2\2\2\u01cf\u01d1\7U\2\2\u01d0"+
		"\u01c8\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d1U\3\2\2\2"+
		"+Y]aeq\u0081\u00a4\u00ac\u00b0\u00b2\u00ba\u00c7\u00d4\u00df\u00e9\u0101"+
		"\u0111\u011c\u011f\u0122\u0136\u013b\u0144\u014f\u0152\u0158\u015e\u0160"+
		"\u0169\u0170\u0180\u0188\u0190\u0194\u019f\u01ab\u01b4\u01be\u01c0\u01c6"+
		"\u01d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}