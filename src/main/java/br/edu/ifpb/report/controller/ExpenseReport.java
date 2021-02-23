package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport {

    private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();

    public void generate() {
        createDatabaseConnection();
        executePostgresQuery();
        convertToXLS();
    }

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    public void executePostgresQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.runQuery(query);
    }

    public void convertToXLS() {
        System.out.println("Converting To XLS...");
    }

}
