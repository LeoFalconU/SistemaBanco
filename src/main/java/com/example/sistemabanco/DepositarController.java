package com.example.sistemabanco;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class DepositarController {
    @FXML
    private Label AvisoDeposito;
    @FXML
    protected Label Saldo;
    @FXML
    protected TextField CantidadDeposito;
    @FXML
    protected TextField CantidadRetiro;

    @FXML
    protected void DepositoConfirmar(){
        double deposito;
        double saldo=0;
        deposito = Double.parseDouble(CantidadDeposito.getText());
        saldo = saldo + deposito;
        CantidadDeposito.setText(String.valueOf(deposito));
        AvisoDeposito.setText(("Deposito realizado :)"));
        Saldo.setText(String.valueOf(saldo));
    }
    @FXML
    protected void CancelarDeposito(){
        CantidadDeposito.setText("");
        AvisoDeposito.setText("Deposito Cancelado");
    }
    @FXML
    protected void RetiroConfirmar(){
        double retiro;
        retiro = Double.parseDouble(CantidadRetiro.getText());
        CantidadRetiro.setText(String.valueOf(retiro));
    }
}
