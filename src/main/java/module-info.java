module com.example.hello_application {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.hello_application to javafx.fxml;
    exports com.example.hello_application;
}