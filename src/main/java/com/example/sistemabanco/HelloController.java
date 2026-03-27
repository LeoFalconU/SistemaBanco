package com.example.sistemabanco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {
    @FXML
    private TextField usuario;
    @FXML
    private TextField cont;
    @FXML
    private Label errorr;

    @FXML
    public void validarAcceso(ActionEvent event) {
        String user = usuario.getText();
        String passwd = cont.getText();

        if (user.equals("admin") && passwd.equals("admin123") ) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setTitle("Segunda Ventana");
                stage.setScene(new Scene(root));
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {errorr.setVisible(true);}
    }


}

