module org.example.cs230game {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.cs230game to javafx.fxml;
    exports org.example.cs230game;
}