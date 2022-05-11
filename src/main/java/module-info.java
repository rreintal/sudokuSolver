module com.example.sudokusolver {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.sudokusolver to javafx.fxml;
    exports com.example.sudokusolver;
}