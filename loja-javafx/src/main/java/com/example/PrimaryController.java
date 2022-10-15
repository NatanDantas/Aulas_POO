package com.example;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.MODEL.Pedido;
import com.example.MODEL.TipoImposto;
import com.example.SERVICE.PedidoService;
import com.example.impostos.Icms;
import com.example.impostos.Imposto;
import com.example.impostos.Ipi;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField textFieldNome;
    @FXML
    private TextField textFieldValor;
    @FXML
    private TextField textFieldItens;
    @FXML
    private Label labelTotal;
    @FXML
    private Label labelDesconto;
    @FXML
    private ChoiceBox<Imposto> choiceBoxTributacao;

    private PedidoService service = new PedidoService();

    public void calcularImposto() {
        String nome = textFieldNome.getText();
        BigDecimal valor = new BigDecimal(textFieldValor.getText());
        Imposto imposto = choiceBoxTributacao.getValue();
        int qtdeDeItens = Integer.valueOf(textFieldItens.getText());
        var pedido = new Pedido(nome, valor, qtdeDeItens);
        var valorComImposto = service.calcularValorComImposto(pedido, imposto);
        labelTotal.setText(valorComImposto.toString());

        var desconto = service.calcularDesconto(pedido);
        labelDesconto.setText(desconto.toString());

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        choiceBoxTributacao.getItems().addAll(new Icms(), new Ipi());

    }
}
