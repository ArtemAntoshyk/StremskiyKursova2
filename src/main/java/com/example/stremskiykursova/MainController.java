package com.example.stremskiykursova;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController  {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button actors;

        @FXML
        private GridPane filmGrid;

        @FXML
        private Button newFilm;

        @FXML
        private Button removeFilm;

        @FXML
        private TextField searchField;

        @FXML
        private Button searchFilmButton;
        public void sql() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
                String url = "jdbc:mysql://localhost/movielibrary";
                String username = "root";
                String password = "00001111";
                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();



        }


        @FXML
        void OpenPegeForActors(ActionEvent event) {

        }

        @FXML
        void RemoveFilm(ActionEvent event) {

        }

        @FXML
        void SerchFilm(ActionEvent event) {

        }

        @FXML
        void SortedOnYear(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert actors != null : "fx:id=\"actors\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert filmGrid != null : "fx:id=\"filmGrid\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert newFilm != null : "fx:id=\"newFilm\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert removeFilm != null : "fx:id=\"removeFilm\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert searchField != null : "fx:id=\"searchField\" was not injected: check your FXML file 'hello-view.fxml'.";
            assert searchFilmButton != null : "fx:id=\"searchFilmButton\" was not injected: check your FXML file 'hello-view.fxml'.";

        }

    }
