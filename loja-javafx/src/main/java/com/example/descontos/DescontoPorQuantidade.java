package com.example.descontos;

import java.math.BigDecimal;

public class DescontoPorQuantidade extends Desconto {

    public DescontoPorQuantidade(Desconto proximo) {
        super(proximo);
        //TODO Auto-generated constructor stub
    }

    public BigDecimal calcularDesconto(Pedido pedido) {
        if (pedido.getQtdeDeItens() > 5)
            return pedido.getValor().multiply(new BigDecimal(0.1));

        return proximo.calcularDesconto(pedido);
    }
}
