package org.example;

public class Request {

    private RequestType tipo;

    public Request(RequestType tipo) {
        this.tipo = tipo;
    }

    public RequestType getTipo() {
        return tipo;
    }

    public void setTipo(RequestType tipo) {
        this.tipo = tipo;
    }

}
