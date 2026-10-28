package org.example;

public class LibraryDirector extends LibraryStaff {

    public LibraryDirector(LibraryStaff superior) {
        tiposAtendidos.add(InterlibraryLoanRequest.getInstance());
        setSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor de Biblioteca";
    }

}
