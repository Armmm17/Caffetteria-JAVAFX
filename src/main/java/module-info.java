module com.caffetteria.caffetteriajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.caffetteria.caffetteriajavafx to javafx.fxml;
    exports com.caffetteria.caffetteriajavafx;
}