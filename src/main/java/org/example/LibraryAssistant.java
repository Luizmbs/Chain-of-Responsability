package org.example;

public class LibraryAssistant extends LibraryStaff {

    public LibraryAssistant(LibraryStaff superior) {
        tiposAtendidos.add(LoanRenewalRequest.getInstance());
        setSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Auxiliar de Biblioteca";
    }

}
