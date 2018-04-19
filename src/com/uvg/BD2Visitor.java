package com.uvg;
import ANTLR.SqlBaseListener;
import ANTLR.SqlBaseVisitor;
import ANTLR.SqlParser;
import ANTLR.SqlVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by luisa on 17/04/18.
 */
public class BD2Visitor extends SqlBaseVisitor<String> {
    @Override
    public String visitProgram(SqlParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public String visitSql_executable_statement(SqlParser.Sql_executable_statementContext ctx) {
        return null;
    }

    @Override
    public String visitSql_schema_statement(SqlParser.Sql_schema_statementContext ctx) {
        return null;
    }

    @Override
    public String visitSql_schema_definition_statement(SqlParser.Sql_schema_definition_statementContext ctx) {
        return null;
    }

    @Override
    public String visitSql_schema_manipulation_statement(SqlParser.Sql_schema_manipulation_statementContext ctx) {
        return null;
    }

    @Override
    public String visitSql_data_statement(SqlParser.Sql_data_statementContext ctx) {
        return null;
    }

    @Override
    public String visitSchema_definition(SqlParser.Schema_definitionContext ctx) {
        return null;
    }

    @Override
    public String visitTable_definition(SqlParser.Table_definitionContext ctx) {
        return null;
    }

    @Override
    public String visitDrop_schema_statement(SqlParser.Drop_schema_statementContext ctx) {
        return null;
    }

    @Override
    public String visitAlter_table_statement(SqlParser.Alter_table_statementContext ctx) {
        return null;
    }

    @Override
    public String visitDrop_table_statement(SqlParser.Drop_table_statementContext ctx) {
        return null;
    }

    @Override
    public String visitAlter_database_statement(SqlParser.Alter_database_statementContext ctx) {
        return null;
    }

    @Override
    public String visitShow_schema_statement(SqlParser.Show_schema_statementContext ctx) {
        return null;
    }

    @Override
    public String visitUse_schema_statement(SqlParser.Use_schema_statementContext ctx) {
        return null;
    }

    @Override
    public String visitDefcolumna(SqlParser.DefcolumnaContext ctx) {
        return null;
    }

    @Override
    public String visitDefconstraint(SqlParser.DefconstraintContext ctx) {
        return null;
    }

    @Override
    public String visitTipoInt(SqlParser.TipoIntContext ctx) {
        return null;
    }

    @Override
    public String visitTipoFloat(SqlParser.TipoFloatContext ctx) {
        return null;
    }

    @Override
    public String visitTipoChar(SqlParser.TipoCharContext ctx) {
        return null;
    }

    @Override
    public String visitTipoDate(SqlParser.TipoDateContext ctx) {
        return null;
    }

    @Override
    public String visitConstraint(SqlParser.ConstraintContext ctx) {
        return null;
    }

    @Override
    public String visitPrimaryK(SqlParser.PrimaryKContext ctx) {
        return null;
    }

    @Override
    public String visitForeignK(SqlParser.ForeignKContext ctx) {
        return null;
    }

    @Override
    public String visitCheck(SqlParser.CheckContext ctx) {
        return null;
    }

    @Override
    public String visitRename_table_statement(SqlParser.Rename_table_statementContext ctx) {
        return null;
    }

    @Override
    public String visitAddColumn(SqlParser.AddColumnContext ctx) {
        return null;
    }

    @Override
    public String visitAddConstraint(SqlParser.AddConstraintContext ctx) {
        return null;
    }

    @Override
    public String visitDropColumn(SqlParser.DropColumnContext ctx) {
        return null;
    }

    @Override
    public String visitDropConstraint(SqlParser.DropConstraintContext ctx) {
        return null;
    }

    @Override
    public String visitShow_table_statement(SqlParser.Show_table_statementContext ctx) {
        return null;
    }

    @Override
    public String visitShow_column_statement(SqlParser.Show_column_statementContext ctx) {
        return null;
    }

    @Override
    public String visitDmlstatement(SqlParser.DmlstatementContext ctx) {
        return null;
    }

    @Override
    public String visitInsert_value(SqlParser.Insert_valueContext ctx) {
        return null;
    }

    @Override
    public String visitUpdate_value(SqlParser.Update_valueContext ctx) {
        return null;
    }

    @Override
    public String visitDelete_value(SqlParser.Delete_valueContext ctx) {
        return null;
    }

    @Override
    public String visitSelect_value(SqlParser.Select_valueContext ctx) {
        return null;
    }

    @Override
    public String visitList_values(SqlParser.List_valuesContext ctx) {
        return null;
    }

    @Override
    public String visitLiteral(SqlParser.LiteralContext ctx) {
        return null;
    }

    @Override
    public String visitInt_literal(SqlParser.Int_literalContext ctx) {
        return null;
    }

    @Override
    public String visitFloat_literal(SqlParser.Float_literalContext ctx) {
        return null;
    }

    @Override
    public String visitDate_literal(SqlParser.Date_literalContext ctx) {
        return null;
    }

    @Override
    public String visitChar_literal(SqlParser.Char_literalContext ctx) {
        return null;
    }

    @Override
    public String visitRelL(SqlParser.RelLContext ctx) {
        return null;
    }

    @Override
    public String visitRekB(SqlParser.RekBContext ctx) {
        return null;
    }

    @Override
    public String visitRelLE(SqlParser.RelLEContext ctx) {
        return null;
    }

    @Override
    public String visitRelBE(SqlParser.RelBEContext ctx) {
        return null;
    }

    @Override
    public String visitEqE(SqlParser.EqEContext ctx) {
        return null;
    }

    @Override
    public String visitEqNE(SqlParser.EqNEContext ctx) {
        return null;
    }

    @Override
    public String visitRelL2(SqlParser.RelL2Context ctx) {
        return null;
    }

    @Override
    public String visitRekB2(SqlParser.RekB2Context ctx) {
        return null;
    }

    @Override
    public String visitRelLE2(SqlParser.RelLE2Context ctx) {
        return null;
    }

    @Override
    public String visitRelBE2(SqlParser.RelBE2Context ctx) {
        return null;
    }

    @Override
    public String visitEqE2(SqlParser.EqE2Context ctx) {
        return null;
    }

    @Override
    public String visitEqNE2(SqlParser.EqNE2Context ctx) {
        return null;
    }

    @Override
    public String visitRelL3(SqlParser.RelL3Context ctx) {
        return null;
    }

    @Override
    public String visitRekB3(SqlParser.RekB3Context ctx) {
        return null;
    }

    @Override
    public String visitRelLE3(SqlParser.RelLE3Context ctx) {
        return null;
    }

    @Override
    public String visitRelBE3(SqlParser.RelBE3Context ctx) {
        return null;
    }

    @Override
    public String visitEqE3(SqlParser.EqE3Context ctx) {
        return null;
    }

    @Override
    public String visitEqNE3(SqlParser.EqNE3Context ctx) {
        return null;
    }

    @Override
    public String visitCond_op1(SqlParser.Cond_op1Context ctx) {
        return null;
    }

    @Override
    public String visitCond_op2(SqlParser.Cond_op2Context ctx) {
        return null;
    }

    @Override
    public String visitExpression2(SqlParser.Expression2Context ctx) {
        return null;
    }

    @Override
    public String visitExpression1(SqlParser.Expression1Context ctx) {
        return null;
    }

    @Override
    public String visitExpr11(SqlParser.Expr11Context ctx) {
        return null;
    }

    @Override
    public String visitExpr12(SqlParser.Expr12Context ctx) {
        return null;
    }

    @Override
    public String visitExpr31(SqlParser.Expr31Context ctx) {
        return null;
    }

    @Override
    public String visitExpr33(SqlParser.Expr33Context ctx) {
        return null;
    }

    @Override
    public String visitExpr32(SqlParser.Expr32Context ctx) {
        return null;
    }

    @Override
    public String visitExpr34(SqlParser.Expr34Context ctx) {
        return null;
    }

    @Override
    public String visitUniFactorNot(SqlParser.UniFactorNotContext ctx) {
        return null;
    }

    @Override
    public String visitUniFactorFactor(SqlParser.UniFactorFactorContext ctx) {
        return null;
    }

    @Override
    public String visitFactorExpression(SqlParser.FactorExpressionContext ctx) {
        return null;
    }

    @Override
    public String visitFactorID(SqlParser.FactorIDContext ctx) {
        return null;
    }

    @Override
    public String visitFactorID2(SqlParser.FactorID2Context ctx) {
        return null;
    }

    @Override
    public String visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
