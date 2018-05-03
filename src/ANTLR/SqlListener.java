// Generated from Sql.g4 by ANTLR 4.5.3
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_executable_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_executable_statement(SqlParser.Sql_executable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_executable_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_executable_statement(SqlParser.Sql_executable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_statement(SqlParser.Sql_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_statement(SqlParser.Sql_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_schema_definition_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_definition_statement(SqlParser.Sql_schema_definition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_schema_definition_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_definition_statement(SqlParser.Sql_schema_definition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_schema_manipulation_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_schema_manipulation_statement(SqlParser.Sql_schema_manipulation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_schema_manipulation_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_schema_manipulation_statement(SqlParser.Sql_schema_manipulation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_data_statement(SqlParser.Sql_data_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_data_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_data_statement(SqlParser.Sql_data_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#schema_definition}.
	 * @param ctx the parse tree
	 */
	void enterSchema_definition(SqlParser.Schema_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#schema_definition}.
	 * @param ctx the parse tree
	 */
	void exitSchema_definition(SqlParser.Schema_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_definition(SqlParser.Table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_definition(SqlParser.Table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema_statement(SqlParser.Drop_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema_statement(SqlParser.Drop_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_statement(SqlParser.Alter_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_statement(SqlParser.Alter_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_statement(SqlParser.Drop_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_statement(SqlParser.Drop_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_database_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_statement(SqlParser.Alter_database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_database_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_statement(SqlParser.Alter_database_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#show_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_schema_statement(SqlParser.Show_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#show_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_schema_statement(SqlParser.Show_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#use_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_schema_statement(SqlParser.Use_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#use_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_schema_statement(SqlParser.Use_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defcolumna}
	 * labeled alternative in {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterDefcolumna(SqlParser.DefcolumnaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defcolumna}
	 * labeled alternative in {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitDefcolumna(SqlParser.DefcolumnaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defconstraint}
	 * labeled alternative in {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterDefconstraint(SqlParser.DefconstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defconstraint}
	 * labeled alternative in {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitDefconstraint(SqlParser.DefconstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoInt}
	 * labeled alternative in {@link SqlParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void enterTipoInt(SqlParser.TipoIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoInt}
	 * labeled alternative in {@link SqlParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void exitTipoInt(SqlParser.TipoIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoFloat}
	 * labeled alternative in {@link SqlParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void enterTipoFloat(SqlParser.TipoFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoFloat}
	 * labeled alternative in {@link SqlParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void exitTipoFloat(SqlParser.TipoFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoChar}
	 * labeled alternative in {@link SqlParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void enterTipoChar(SqlParser.TipoCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoChar}
	 * labeled alternative in {@link SqlParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void exitTipoChar(SqlParser.TipoCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoDate}
	 * labeled alternative in {@link SqlParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void enterTipoDate(SqlParser.TipoDateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoDate}
	 * labeled alternative in {@link SqlParser#tipo_literal}.
	 * @param ctx the parse tree
	 */
	void exitTipoDate(SqlParser.TipoDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(SqlParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(SqlParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryK}
	 * labeled alternative in {@link SqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryK(SqlParser.PrimaryKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryK}
	 * labeled alternative in {@link SqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryK(SqlParser.PrimaryKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignK}
	 * labeled alternative in {@link SqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void enterForeignK(SqlParser.ForeignKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignK}
	 * labeled alternative in {@link SqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void exitForeignK(SqlParser.ForeignKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code check}
	 * labeled alternative in {@link SqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void enterCheck(SqlParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code check}
	 * labeled alternative in {@link SqlParser#constraintType}.
	 * @param ctx the parse tree
	 */
	void exitCheck(SqlParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rename_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterRename_table_statement(SqlParser.Rename_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rename_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitRename_table_statement(SqlParser.Rename_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link SqlParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAddColumn(SqlParser.AddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addColumn}
	 * labeled alternative in {@link SqlParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAddColumn(SqlParser.AddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addConstraint}
	 * labeled alternative in {@link SqlParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAddConstraint(SqlParser.AddConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addConstraint}
	 * labeled alternative in {@link SqlParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAddConstraint(SqlParser.AddConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link SqlParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterDropColumn(SqlParser.DropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropColumn}
	 * labeled alternative in {@link SqlParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitDropColumn(SqlParser.DropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropConstraint}
	 * labeled alternative in {@link SqlParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraint(SqlParser.DropConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropConstraint}
	 * labeled alternative in {@link SqlParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraint(SqlParser.DropConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#show_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_table_statement(SqlParser.Show_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#show_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_table_statement(SqlParser.Show_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#show_column_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_column_statement(SqlParser.Show_column_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#show_column_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_column_statement(SqlParser.Show_column_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dmlstatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlstatement(SqlParser.DmlstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dmlstatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlstatement(SqlParser.DmlstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_value(SqlParser.Insert_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_value(SqlParser.Insert_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_value}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_value(SqlParser.Update_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_value}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_value(SqlParser.Update_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_value}.
	 * @param ctx the parse tree
	 */
	void enterDelete_value(SqlParser.Delete_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_value}.
	 * @param ctx the parse tree
	 */
	void exitDelete_value(SqlParser.Delete_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_value(SqlParser.Select_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_value(SqlParser.Select_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(SqlParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(SqlParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#list_values}.
	 * @param ctx the parse tree
	 */
	void enterList_values(SqlParser.List_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#list_values}.
	 * @param ctx the parse tree
	 */
	void exitList_values(SqlParser.List_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SqlParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(SqlParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(SqlParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat_literal(SqlParser.Float_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat_literal(SqlParser.Float_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(SqlParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(SqlParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(SqlParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(SqlParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relL}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRelL(SqlParser.RelLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relL}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRelL(SqlParser.RelLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rekB}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRekB(SqlParser.RekBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rekB}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRekB(SqlParser.RekBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relLE}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRelLE(SqlParser.RelLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relLE}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRelLE(SqlParser.RelLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relBE}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRelBE(SqlParser.RelBEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relBE}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRelBE(SqlParser.RelBEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqE}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterEqE(SqlParser.EqEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqE}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitEqE(SqlParser.EqEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqNE}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterEqNE(SqlParser.EqNEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqNE}
	 * labeled alternative in {@link SqlParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitEqNE(SqlParser.EqNEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relL2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void enterRelL2(SqlParser.RelL2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code relL2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void exitRelL2(SqlParser.RelL2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code rekB2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void enterRekB2(SqlParser.RekB2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code rekB2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void exitRekB2(SqlParser.RekB2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code relLE2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void enterRelLE2(SqlParser.RelLE2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code relLE2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void exitRelLE2(SqlParser.RelLE2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code relBE2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void enterRelBE2(SqlParser.RelBE2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code relBE2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void exitRelBE2(SqlParser.RelBE2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code eqE2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void enterEqE2(SqlParser.EqE2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code eqE2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void exitEqE2(SqlParser.EqE2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code eqNE2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void enterEqNE2(SqlParser.EqNE2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code eqNE2}
	 * labeled alternative in {@link SqlParser#rel_op2}.
	 * @param ctx the parse tree
	 */
	void exitEqNE2(SqlParser.EqNE2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code relL3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void enterRelL3(SqlParser.RelL3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code relL3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void exitRelL3(SqlParser.RelL3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code rekB3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void enterRekB3(SqlParser.RekB3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code rekB3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void exitRekB3(SqlParser.RekB3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code relLE3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void enterRelLE3(SqlParser.RelLE3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code relLE3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void exitRelLE3(SqlParser.RelLE3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code relBE3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void enterRelBE3(SqlParser.RelBE3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code relBE3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void exitRelBE3(SqlParser.RelBE3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code eqE3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void enterEqE3(SqlParser.EqE3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code eqE3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void exitEqE3(SqlParser.EqE3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code eqNE3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void enterEqNE3(SqlParser.EqNE3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code eqNE3}
	 * labeled alternative in {@link SqlParser#rel_op3}.
	 * @param ctx the parse tree
	 */
	void exitEqNE3(SqlParser.EqNE3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_op1}
	 * labeled alternative in {@link SqlParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op1(SqlParser.Cond_op1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_op1}
	 * labeled alternative in {@link SqlParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op1(SqlParser.Cond_op1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_op2}
	 * labeled alternative in {@link SqlParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op2(SqlParser.Cond_op2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_op2}
	 * labeled alternative in {@link SqlParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op2(SqlParser.Cond_op2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code logic1}
	 * labeled alternative in {@link SqlParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterLogic1(SqlParser.Logic1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code logic1}
	 * labeled alternative in {@link SqlParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitLogic1(SqlParser.Logic1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code logic2}
	 * labeled alternative in {@link SqlParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterLogic2(SqlParser.Logic2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code logic2}
	 * labeled alternative in {@link SqlParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitLogic2(SqlParser.Logic2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression2}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(SqlParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression2}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(SqlParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression1}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(SqlParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression1}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(SqlParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr11}
	 * labeled alternative in {@link SqlParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr11(SqlParser.Expr11Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr11}
	 * labeled alternative in {@link SqlParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr11(SqlParser.Expr11Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr12}
	 * labeled alternative in {@link SqlParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr12(SqlParser.Expr12Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr12}
	 * labeled alternative in {@link SqlParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr12(SqlParser.Expr12Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr31}
	 * labeled alternative in {@link SqlParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr31(SqlParser.Expr31Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr31}
	 * labeled alternative in {@link SqlParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr31(SqlParser.Expr31Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr33}
	 * labeled alternative in {@link SqlParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr33(SqlParser.Expr33Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr33}
	 * labeled alternative in {@link SqlParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr33(SqlParser.Expr33Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr32}
	 * labeled alternative in {@link SqlParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr32(SqlParser.Expr32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr32}
	 * labeled alternative in {@link SqlParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr32(SqlParser.Expr32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr34}
	 * labeled alternative in {@link SqlParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr34(SqlParser.Expr34Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr34}
	 * labeled alternative in {@link SqlParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr34(SqlParser.Expr34Context ctx);
	/**
	 * Enter a parse tree produced by the {@code uniFactorNot}
	 * labeled alternative in {@link SqlParser#unifactor}.
	 * @param ctx the parse tree
	 */
	void enterUniFactorNot(SqlParser.UniFactorNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniFactorNot}
	 * labeled alternative in {@link SqlParser#unifactor}.
	 * @param ctx the parse tree
	 */
	void exitUniFactorNot(SqlParser.UniFactorNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniFactorFactor}
	 * labeled alternative in {@link SqlParser#unifactor}.
	 * @param ctx the parse tree
	 */
	void enterUniFactorFactor(SqlParser.UniFactorFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniFactorFactor}
	 * labeled alternative in {@link SqlParser#unifactor}.
	 * @param ctx the parse tree
	 */
	void exitUniFactorFactor(SqlParser.UniFactorFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorExpression}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorExpression(SqlParser.FactorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorExpression}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorExpression(SqlParser.FactorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorID}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorID(SqlParser.FactorIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorID}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorID(SqlParser.FactorIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorID2}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorID2(SqlParser.FactorID2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code factorID2}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorID2(SqlParser.FactorID2Context ctx);
}