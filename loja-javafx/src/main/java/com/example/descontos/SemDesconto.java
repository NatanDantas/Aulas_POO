package com.example.descontos;

import java.math.BigDecimal;

import com.example.MODEL.Pedido;

public class SemDesconto extends Desconto{
    
    public SemDesconto(){
        super(null);
    }

    @Override
    BigDecimal calcularDesconto(Pedido pedido){
        return BigDecimal.ZERO;
    }
}
