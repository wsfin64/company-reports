package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends Report{

    private final PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();

    @Override
    // conexão específica com postgres
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    @Override
    public void executeSQLQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.runQuery(query);
    }

    @Override
    // Aqui converte especificamente para .xls
    public void convertToFile() {
        System.out.println("Converting To XLS...");
    }

}
