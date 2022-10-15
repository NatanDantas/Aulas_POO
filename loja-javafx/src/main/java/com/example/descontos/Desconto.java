package com.example.descontos;

import java.math.BigDecimal;

import com.example.MODEL.Pedido;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    public abstract BigDecimal calcularDesconto(Pedido pedido){
        if(podeCalcularDesconto(pedido)) return calcularDesconto(pedido);
    }

}
