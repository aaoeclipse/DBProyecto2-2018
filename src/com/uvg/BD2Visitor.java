package com.uvg;
import ANTLR.SqlBaseVisitor;
import ANTLR.SqlParser;
import fileManager.FileManager;
import fileManager.FileManagerImpl;
import fileManager.globalVariables;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by luisa on 17/04/18.
 */
public class BD2Visitor extends SqlBaseVisitor<String> {
    FileManager fileManager = new FileManagerImpl();
    @Override public String visitUse_schema_statement(@NotNull SqlParser.Use_schema_statementContext ctx) {
        String funcionoOutput = "No se logro usar esa base de datos";
        if (fileManager.useDatabase(ctx.getChild(2).getText()))
            funcionoOutput = "Utilizando: "+ ctx.getChild(2).getText();
        return funcionoOutput;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTable_definition(@NotNull SqlParser.Table_definitionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTipoFloat(@NotNull SqlParser.TipoFloatContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAddConstraint(@NotNull SqlParser.AddConstraintContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProgram(@NotNull SqlParser.ProgramContext ctx) {
        return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDropColumn(@NotNull SqlParser.DropColumnContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInt_literal(@NotNull SqlParser.Int_literalContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSql_schema_manipulation_statement(@NotNull SqlParser.Sql_schema_manipulation_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAlter_table_statement(@NotNull SqlParser.Alter_table_statementContext ctx) {
        switch (ctx.getChild(3).getChild(0).getText()){
            case "ADD":
                if (ctx.getChild(3).getChild(1).getText().equals("COLUMN")){
                    if (! fileManager.alterAddColumn(ctx.getChild(2).getText(), ctx.getChild(3).getChild(2).getText(),ctx.getChild(3).getChild(3).getChild(0).getText())){
                        return globalVariables.printError();
                    }
                } else { // CONSTRAINT
                    if (ctx.getChild(3).getChild(1).getChild(1).getChild(1).getText().equals("PRIMARY") || ctx.getChild(3).getChild(1).getChild(1).getChild(1).getText().equals("FOREIGN")) {
                        if (!fileManager.alterAddConstraint(ctx.getChild(2).getText(), ctx.getChild(3).getChild(1).getChild(1).getChild(1).getText() + "" + ctx.getChild(3).getChild(1).getChild(1).getChild(2).getText(), ctx.getChild(3).getChild(1).getChild(1).getChild(4).getText())) {
                            return globalVariables.printError();
                        }
                    }else {
                        if (!fileManager.alterAddConstraint(ctx.getChild(2).getText(), ctx.getChild(3).getChild(1).getChild(1).getChild(1).getText(), ctx.getChild(3).getChild(1).getChild(1).getChild(3).getChild(0).getChild(0).getChild(0).getChild(0).getChild(0).getText())) {
                            return globalVariables.printError();
                        }
                    }
                }

                break;
            case "DROP":
                if (ctx.getChild(3).getChild(1).getText().equals("COLUMN")){
                    if (! fileManager.alterDropColumn(ctx.getChild(2).getText(), ctx.getChild(3).getChild(2).getText())){
                        return globalVariables.printError();
                    }
                } else { // CONSTRAINT
                    if (! fileManager.alterDropConstraint(ctx.getChild(2).getText(), ctx.getChild(3).getChild(2).getText())){
                        return globalVariables.printError();
                    }
                }

                break;
        }
        return "Modificacion completa";
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEqE3(@NotNull SqlParser.EqE3Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAlter_database_statement(@NotNull SqlParser.Alter_database_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEqE2(@NotNull SqlParser.EqE2Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEqE(@NotNull SqlParser.EqEContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCond_op1(@NotNull SqlParser.Cond_op1Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitUniFactorFactor(@NotNull SqlParser.UniFactorFactorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDelete_value(@NotNull SqlParser.Delete_valueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitUniFactorNot(@NotNull SqlParser.UniFactorNotContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitChar_literal(@NotNull SqlParser.Char_literalContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRekB(@NotNull SqlParser.RekBContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCond_op2(@NotNull SqlParser.Cond_op2Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAddColumn(@NotNull SqlParser.AddColumnContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSql_executable_statement(@NotNull SqlParser.Sql_executable_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitForeignK(@NotNull SqlParser.ForeignKContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDefcolumna(@NotNull SqlParser.DefcolumnaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDropConstraint(@NotNull SqlParser.DropConstraintContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelLE(@NotNull SqlParser.RelLEContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDefconstraint(@NotNull SqlParser.DefconstraintContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFactorID2(@NotNull SqlParser.FactorID2Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCheck(@NotNull SqlParser.CheckContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelL3(@NotNull SqlParser.RelL3Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRename_table_statement(@NotNull SqlParser.Rename_table_statementContext ctx) {
        if (!fileManager.renameTable(ctx.getChild(2).getText(), ctx.getChild(5).getText())){
            return globalVariables.printError();
        }
        return "Exito!"; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpr31(@NotNull SqlParser.Expr31Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDmlstatement(@NotNull SqlParser.DmlstatementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRekB3(@NotNull SqlParser.RekB3Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpr33(@NotNull SqlParser.Expr33Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRekB2(@NotNull SqlParser.RekB2Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpr32(@NotNull SqlParser.Expr32Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpr34(@NotNull SqlParser.Expr34Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTipoInt(@NotNull SqlParser.TipoIntContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitShow_column_statement(@NotNull SqlParser.Show_column_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSql_schema_definition_statement(@NotNull SqlParser.Sql_schema_definition_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelL2(@NotNull SqlParser.RelL2Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSql_data_statement(@NotNull SqlParser.Sql_data_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEqNE(@NotNull SqlParser.EqNEContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitShow_schema_statement(@NotNull SqlParser.Show_schema_statementContext ctx) {
        String[] nombresDeDatabase = fileManager.showDatabases();
        String returnString = "";
        for (String s: nombresDeDatabase) {
            returnString += s +"\n";
        }
        return returnString;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSql_schema_statement(@NotNull SqlParser.Sql_schema_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLiteral(@NotNull SqlParser.LiteralContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFactorID(@NotNull SqlParser.FactorIDContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTipoDate(@NotNull SqlParser.TipoDateContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitList_values(@NotNull SqlParser.List_valuesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFactorExpression(@NotNull SqlParser.FactorExpressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFloat_literal(@NotNull SqlParser.Float_literalContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDrop_schema_statement(@NotNull SqlParser.Drop_schema_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSelect_value(@NotNull SqlParser.Select_valueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDate_literal(@NotNull SqlParser.Date_literalContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelBE3(@NotNull SqlParser.RelBE3Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelBE2(@NotNull SqlParser.RelBE2Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDrop_table_statement(@NotNull SqlParser.Drop_table_statementContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelL(@NotNull SqlParser.RelLContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelLE3(@NotNull SqlParser.RelLE3Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelBE(@NotNull SqlParser.RelBEContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitRelLE2(@NotNull SqlParser.RelLE2Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInsert_value(@NotNull SqlParser.Insert_valueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEqNE2(@NotNull SqlParser.EqNE2Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression2(@NotNull SqlParser.Expression2Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSchema_definition(@NotNull SqlParser.Schema_definitionContext ctx) {
        System.out.println("visitvisitUse_schema_statement");
        System.out.println(ctx.getChild(2));
        String created = "No se logro crear";
        if(fileManager.createDB(ctx.getChild(2).getText()))
            created = "Si se logro crear";
        return created;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrimaryK(@NotNull SqlParser.PrimaryKContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression1(@NotNull SqlParser.Expression1Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitEqNE3(@NotNull SqlParser.EqNE3Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitUpdate_value(@NotNull SqlParser.Update_valueContext ctx) {
        if (ctx.getChild(6).getText().equalsIgnoreCase("WHERE")) {
            return "UNDER CONSTRUCTION";
        }else {
            if (! fileManager.updateNoWhere(ctx.getChild(1).getText(),ctx.getChild(3).getText(),ctx.getChild(5).getChild(0).getChild(0).getText())){
                return globalVariables.printError();
            }
        }
        return "Tabla "+ ctx.getChild(1).getText() + " Modificada"; }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitConstraint(@NotNull SqlParser.ConstraintContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitShow_table_statement(@NotNull SqlParser.Show_table_statementContext ctx) {
        String list = "";
        for (String s: fileManager.listTables()) {
            list += s +"\n";
        }
        return list;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTipoChar(@NotNull SqlParser.TipoCharContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpr11(@NotNull SqlParser.Expr11Context ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpr12(@NotNull SqlParser.Expr12Context ctx) { return visitChildren(ctx); }

}