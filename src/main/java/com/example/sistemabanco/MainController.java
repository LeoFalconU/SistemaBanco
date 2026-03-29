package com.example.sistemabanco;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController extends Application {
    public static Cuenta cuentaActual = new Cuenta("admin", "1234", 5000.0);
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(loader.load(), 400, 300);
        stage.setTitle("Banco - Iniciar Sesión");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
