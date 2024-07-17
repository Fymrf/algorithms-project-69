module hexlet.code {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens hexlet.code to javafx.fxml;
    exports hexlet.code;
}