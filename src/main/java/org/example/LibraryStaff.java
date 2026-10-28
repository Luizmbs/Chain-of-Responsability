package org.example;

import java.util.ArrayList;

public abstract class LibraryStaff {

    protected ArrayList<RequestType> tiposAtendidos = new ArrayList<>();
    private LibraryStaff superior;

    public LibraryStaff getSuperior() {
        return superior;
    }

    public void setSuperior(LibraryStaff superior) {
        this.superior = superior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarSolicitacao(Request solicitacao) {
        if (tiposAtendidos.contains(solicitacao.getTipo())) {
            return getDescricaoCargo();
        }
        else {
            if (superior != null) {
                return superior.aprovarSolicitacao(solicitacao);
            }
            else {
                return "Sem aprovação";
            }
        }
    }
}
