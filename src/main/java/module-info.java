module com.example.gameoverjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gameoverjavafx to javafx.fxml;
    exports com.example.gameoverjavafx;
    exports com.example.gameoverjavafx.Controller;
    opens com.example.gameoverjavafx.Controller to javafx.fxml;
}