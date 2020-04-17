package main.java.com.delivery.marketplace.domain;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MarketPlace {
    private Map<Long, Pedido> pedidosAbertos;
    private Map<Long, Pedido> pedidosFechados;
    private static long identificador = 1l;

    public MarketPlace(){
        this.pedidosAbertos = new HashMap<>();
    }

    public void receberPedido(Pedido pedido) {
        long numero = MarketPlace.identificador++;
        pedido.setNumero(numero);
        this.pedidosAbertos.put(numero, pedido);
    }

    public Pedido obterPedido(long numero){
        Pedido pedido = this.pedidosAbertos.get(numero);
        if (pedido == null)
            return new Pedido(null, null);
        return pedido;
    }

    public void gerarEntrega(long numeroPedido, Entregador entregador){
        Pedido pedido = this.pedidosAbertos.get(numeroPedido);
        pedido.setEntrega(new Entrega());
        pedido.setEntregador(entregador);
        this.pedidosAbertos.put(numeroPedido, pedido);
    }

    public void pedidoRealizado(long numero){
        Pedido pedido = this.pedidosAbertos.get(numero);
        Entrega entrega = pedido.getEntrega();
        Calendar hoje = Calendar.getInstance();
        hoje.setTimeInMillis(Calendar.getInstance().getTimeInMillis());
        entrega.setDataHora(hoje);
        this.pedidosAbertos.remove(numero);
        this.pedidosFechados.put(numero, pedido);
    }
}
