module eu.cz.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens eu.cz.calculator to javafx.fxml;
    exports eu.cz.calculator;
}