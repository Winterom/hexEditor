module alex.grizly.hex_editor {
    requires javafx.controls;
    requires javafx.fxml;


    opens alex.grizly.hex_editor to javafx.fxml;
    exports alex.grizly.hex_editor;
}