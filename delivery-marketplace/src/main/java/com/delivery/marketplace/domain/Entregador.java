package main.java.com.delivery.marketplace.domain;

public class Entregador {
    private long numero;
    private MarketPlace marketPlace;
    private Pedido pedido;

    public void pegarPedido(long numero){
        this.pedido = this.marketPlace.obterPedido(numero);
        this.marketPlace.gerarEntrega(numero, this);
    }

    public void realizarEntrega(long numeroPedido){
        this.marketPlace.pedidoRealizado(numeroPedido);
    }
}
