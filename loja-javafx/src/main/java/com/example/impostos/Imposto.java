package com.example.impostos;

import java.math.BigDecimal;

import com.example.MODEL.Pedido;

public interface Imposto {

    public BigDecimal calcular(Pedido pedido);

}
