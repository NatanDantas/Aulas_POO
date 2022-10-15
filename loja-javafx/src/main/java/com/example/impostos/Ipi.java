package com.example.impostos;

import java.math.BigDecimal;

import com.example.MODEL.Pedido;

public class Ipi {

    public BigDecimal calcular(Pedido pedido) {

        return pedido.getValor().multiply(new BigDecimal(1.03));
    }

    @Override
    public String toString() {
        return "Ipi []";
    }

}
