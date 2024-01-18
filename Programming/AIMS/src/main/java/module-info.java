module com.example.aims {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.aims to javafx.fxml;
    exports com.example.aims;
    exports com.example.aims.screenhandler;
    opens com.example.aims.screenhandler to javafx.fxml;
}