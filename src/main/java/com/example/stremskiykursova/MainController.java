package com.example.stremskiykursova;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
//import java.sql.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button actors;

        @FXML
        public GridPane filmGrid;

        @FXML
        private Button newFilm;

        @FXML
        private Button removeFilm;

        @FXML
        private TextField searchField;

        @FXML
        private Button searchFilmButton;
        int size = 3;

        private List<FilmView> films = new SqlReq().sql();

        public MainController() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        }
        @FXML
        void OpenPegeForActors(ActionEvent event) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        }

        @FXML
        void RemoveFilm(ActionEvent event) throws IOException {
                StartProg startProg = new StartProg();
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("FilmPage.fxml"));

        }

        @FXML
        void SerchFilm(ActionEvent event) {

        }

        @FXML
        void SortedOnYear(ActionEvent event) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        }

        public void initialize(URL location, ResourceBundle resources) {
                try {
                        films = new SqlReq().sql();
                } catch (Exception e) {
                        throw new RuntimeException(e);
                }


                int colums = 0;
                int row = 1;
                try {
                        for (int i = 0; i < films.size(); i++) {
                                FXMLLoader fxmlLoader = new FXMLLoader();
                                fxmlLoader.setLocation(getClass().getResource("FilmPage.fxml"));
                                System.out.println();
                                VBox box = fxmlLoader.load();
                                FilmPageController filmPageController = fxmlLoader.getController();
                                filmPageController.setData(films.get(i));
                                if (size == 3) {
                                        if (colums == 2) {
                                                colums = 0;
                                                ++row;
                                        }
                                } else if (size == 3) {
                                        if (colums == 2) {
                                                colums = 0;
                                                ++row;
                                        }
                                }
                                filmGrid.add(box, colums++, row);
                                filmGrid.setPrefWidth(1300);
                                GridPane.setMargin(box, new Insets(17));
                        }
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }
}
