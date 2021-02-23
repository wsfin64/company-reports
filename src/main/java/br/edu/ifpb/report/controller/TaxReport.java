package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport {

    private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();

    public void generate() {
        createDatabaseConnection();
        executeMySQLQuery();
        convertToPDF();
    }

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.openConnection();
    }

    public void executeMySQLQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.executeQuery(query);
    }

    public void convertToPDF() {
        System.out.println("Converting To PDF...");
    }
}
