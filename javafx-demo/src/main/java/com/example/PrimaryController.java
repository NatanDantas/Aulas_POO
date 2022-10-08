package com.example;

import javafx.fxml.FXML;

import com.example.Model.Jogador;

import javafx.fxml.*;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField textFieldNome;
    @FXML
    private TextField textFieldxp;
    @FXML
    private TextField textFieldhp;
    @FXML
    private CheckBox checkBoxEnvenenado;

    public void salvar() {

        System.out.println("Salvando Jogador " + textFieldNome.getText());

        var jogador = new Jogador(textFieldNome.getText(),
                Integer.valueOf(textFieldxp.getText()),
                Integer.valueOf(textFieldhp.getText()),
                checkBoxEnvenenado.isSelected());

        System.out.println(jogador);
    }

}
