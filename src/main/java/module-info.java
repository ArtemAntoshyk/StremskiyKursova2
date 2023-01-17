module com.example.stremskiykursova {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stremskiykursova to javafx.fxml;
    exports com.example.stremskiykursova;
}