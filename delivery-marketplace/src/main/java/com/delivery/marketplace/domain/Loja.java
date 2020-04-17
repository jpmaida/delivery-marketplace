package main.java.com.delivery.marketplace.domain;

public class Loja {
    private MarketPlace marketplace;

    private Pedido novoPedido(Cliente cliente){
        return new Pedido(this, cliente);
    }

    public void gerarPedidoNoMarketPlace(Cliente cliente){
        Pedido pedido = this.novoPedido(cliente);
        marketplace.receberPedido(pedido);
    }
}
