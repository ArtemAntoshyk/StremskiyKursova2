module com.example.stremskiykursova {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;


    opens com.example.stremskiykursova to javafx.fxml;
    exports com.example.stremskiykursova;
}