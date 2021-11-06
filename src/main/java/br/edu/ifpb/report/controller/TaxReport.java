package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends Report {

    private final MysqlDatabaseConnector connector = new MysqlDatabaseConnector();

    @Override
    // conexão específica com mysql
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.openConnection();
    }

    @Override
    public void executeSQLQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.executeQuery(query);
    }

    @Override
    // Aqui converte especificamente para .pdf
    public void convertToFile() {
        System.out.println("Converting To PDF...");
    }
}
