package com.example.sistemabanco;

import javafx.fxml.FXML;
import com.example.sistemabanco.MainController;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RetiroController {

    @FXML
    private Label nuevoSaldo;
    @FXML
    private Label mensajeSaldo;
    @FXML
    private Label saldoLabel;
    @FXML
    Label saldoNo;
    @FXML
    private TextField monto;
    @FXML
    private Label errorr;

    @FXML
    private void Confirmar(){
        saldoLabel.setText(String.format("%.2f", MainController.cuentaActual.getSaldo()));
        try{

            double montoIngresado = Double.parseDouble(monto.getText());
            if (montoIngresado<=0){
                errorr.setVisible(true);
                return;
                }
                boolean valido = MainController.cuentaActual.retirar(montoIngresado);
            if (valido) {
                mensajeSaldo.setVisible(true);
                nuevoSaldo.setVisible(true);
                nuevoSaldo.setText(String.format("%.2f", MainController.cuentaActual.getSaldo()));
            } else{
                saldoNo.setVisible(true);
            }


        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    public void aMenu() {
        Stage stage = (Stage) saldoLabel.getScene().getWindow();
        stage.close();
    }

}
