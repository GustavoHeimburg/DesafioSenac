module com.example.compra_comida {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.DesafiosSenac to javafx.fxml;
    exports com.example.DesafiosSenac;
    exports compra_comida;
    opens compra_comida to javafx.fxml;
    exports desaio;
    opens desaio to javafx.fxml;
    exports desaifiosSenac;
    opens desaifiosSenac to javafx.fxml;
    exports DesafioSenac;
    opens DesafioSenac to javafx.fxml;
}