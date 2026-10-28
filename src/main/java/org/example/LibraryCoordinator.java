package org.example;

public class LibraryCoordinator extends LibraryStaff {

    public LibraryCoordinator(LibraryStaff superior) {
        tiposAtendidos.add(RareCollectionAccessRequest.getInstance());
        setSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Coordenador de Biblioteca";
    }

}
