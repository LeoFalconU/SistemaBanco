package com.example.sistemabanco;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ConsultarController {


    @FXML
    private Label usuarioLabel;
    @FXML
    private Label saldoLabel;

    @FXML
    public void initialize() {
        usuarioLabel.setText(MainController.cuentaActual.getUsuario());
        saldoLabel.setText(String.format("%.2f", MainController.cuentaActual.getSaldo()));
    }
    @FXML
    public void aMenu() {
        Stage stage = (Stage) saldoLabel.getScene().getWindow();
        stage.close();
    }
}
