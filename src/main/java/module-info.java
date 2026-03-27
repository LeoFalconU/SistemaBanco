module com.example.sistemabanco {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.sistemabanco to javafx.fxml;
    exports com.example.sistemabanco;
}