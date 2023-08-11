module com.example.itemdecoratorpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.itemdecoratorpattern to javafx.fxml;
    exports com.example.itemdecoratorpattern;
}