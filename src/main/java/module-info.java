module com.example.compra_comida {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.compra_comida to javafx.fxml;
    exports com.example.compra_comida;
}