package com.example.SERVICE;

import java.math.BigDecimal;

import com.example.MODEL.Pedido;
import com.example.MODEL.TipoImposto;
import com.example.descontos.Desconto;
import com.example.descontos.DescontoPorQuantidade;
import com.example.descontos.DescontoPorValor;
import com.example.descontos.SemDesconto;
import com.example.impostos.Imposto;

public class PedidoService {

    public BigDecimal calcularValorComImposto(Pedido pedido, Imposto imposto) {
        return imposto.calcular(pedido);
    }

    public BigDecimal calcularDesconto(Pedido pedido) {
        Desconto cadeiaDeDesconto = 
        new DescontoPorQuantidade(
        new DescontoPorValor(
        new SemDesconto()
        ));

        return cadeiaDeDesconto.calcularDesconto(pedido);
    }
}
