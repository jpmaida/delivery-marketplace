package main.java.com.delivery.marketplace.domain;

import java.util.Calendar;

public class Pedido {
    private long numero;
    private Entrega entrega;
    private Entregador entregador;
    private Calendar dataHora;

    public Pedido(Loja loja, Cliente cliente) {
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Entrega getEntrega(){ return this.entrega; }

    public void setEntrega(Entrega entrega) { this.entrega = entrega; }

    public void setEntregador(Entregador entregador) { this.entregador = entregador; }
}
