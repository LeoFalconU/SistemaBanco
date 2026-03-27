package com.example.sistemabanco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    protected void Retirar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Retiro.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Retirar");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void Depositar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Deposito.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Retirar");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void Consultar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Consultar.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Retirar");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void Salir(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Salir.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Retirar");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
