package br.edu.ifpb.report.controller;

public abstract class Report {

    public final void generate(){
        createDatabaseConnection();
        executeSQLQuery();
        convertToFile();
    }

    // Conversao genérica para qualquer formato de arquivo
    protected abstract void convertToFile();

    // Execução da query independente de qual sgdb será utilizado
    protected abstract void executeSQLQuery();

    // Cria conexão com banco independente do sgbd
    protected abstract void createDatabaseConnection();

}
