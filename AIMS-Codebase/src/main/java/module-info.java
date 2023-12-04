module com.example.aimscodebase {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens example.aimscodebase to javafx.fxml;
    exports example.aimscodebase;
}