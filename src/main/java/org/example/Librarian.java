package org.example;

public class Librarian extends LibraryStaff {

    public Librarian(LibraryStaff superior) {
        tiposAtendidos.add(FineWaiverRequest.getInstance());
        setSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Bibliotecário";
    }

}
