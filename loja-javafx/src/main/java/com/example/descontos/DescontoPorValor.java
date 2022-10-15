package com.example.descontos;

import java.math.BigDecimal;
import com.example.MODEL.Pedido;

public class DescontoPorValor extends Desconto {

    public DescontoPorValor(Desconto proximo) {
        super(proximo);
        //TODO Auto-generated constructor stub
    }

    public BigDecimal calcularDesconto(Pedido pedido) {
        if (pedido.getValor().compareTo(new BigDecimal(500)) > 0)
            return pedido.getValor().multiply(new BigDecimal(0.05));

        return proximo.calcularDesconto(pedido);
    }
}
