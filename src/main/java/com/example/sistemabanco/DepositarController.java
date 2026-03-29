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

    @FXML private TextField txtMonto;
    @FXML private Label lblMensaje;

    @FXML
    private void DepositoConfirmar() {
        try {
            double monto = Double.parseDouble(CantidadDeposito.getText().trim());
            if (monto <= 0) { AvisoDeposito.setText(" Ingresa una cantidad válida.");
                return;
            }
            MainApp.cuentaActual.depositar(monto);
            AvisoDeposito.setStyle("-fx-text-fill: green;");
            AvisoDeposito.setText("✅ Depósito exitoso. Saldo: $" +
                    String.format("%.2f", MainApp.cuentaActual.getSaldo()));
            CantidadDeposito.clear();
        } catch (NumberFormatException e) {
            AvisoDeposito.setStyle("-fx-text-fill: red;");
            AvisoDeposito.setText("⚠ Ingresa un número válido.");
        }
    }
}
