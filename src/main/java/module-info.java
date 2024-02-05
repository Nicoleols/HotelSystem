module com.example.projetohotel2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetohotel2 to javafx.fxml;
    exports com.example.projetohotel2;
}