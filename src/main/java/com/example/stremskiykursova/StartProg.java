package com.example.stremskiykursova;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartProg extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(""));
        Scene scene = new Scene(fxmlLoader.load(), 1050, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

}
