package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {

    LibraryDirector director;
    LibraryCoordinator coordinator;
    Librarian librarian;
    LibraryAssistant assistant;

    @BeforeEach
    void setUp() {
        director = new LibraryDirector(null);
        coordinator = new LibraryCoordinator(director);
        librarian = new Librarian(coordinator);
        assistant = new LibraryAssistant(librarian);
    }

    @Test
    void deveRetornarAuxiliarParaRenovacaoDeEmprestimo() {
        assertEquals("Auxiliar de Biblioteca", assistant.aprovarSolicitacao(new Request(LoanRenewalRequest.getInstance())));
    }

    @Test
    void deveRetornarBibliotecarioParaIsencaoDeMulta() {
        assertEquals("Bibliotecário", assistant.aprovarSolicitacao(new Request(FineWaiverRequest.getInstance())));
    }

    @Test
    void deveRetornarCoordenadorParaAcessoAoAcervoRaro() {
        assertEquals("Coordenador de Biblioteca", assistant.aprovarSolicitacao(new Request(RareCollectionAccessRequest.getInstance())));
    }

    @Test
    void deveRetornarDiretorParaEmprestimoInterbibliotecas() {
        assertEquals("Diretor de Biblioteca", assistant.aprovarSolicitacao(new Request(InterlibraryLoanRequest.getInstance())));
    }

}
