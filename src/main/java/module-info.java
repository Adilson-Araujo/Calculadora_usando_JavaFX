module lp3.calculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires exp4j;

    opens lp3.calculadora to javafx.fxml;
    exports lp3.calculadora;
    
}
