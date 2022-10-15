package com.example.impostos;

import java.math.BigDecimal;

import com.example.MODEL.Pedido;

public class Cofins implements Imposto {

    @Override
    public BigDecimal calcular(Pedido pedido) {
        // TODO Auto-generated method stub
        return pedido.getValor().multiply(new BigDecimal(1.07));
    }

}
