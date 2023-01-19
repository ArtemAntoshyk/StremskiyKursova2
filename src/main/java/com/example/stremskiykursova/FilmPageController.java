package com.example.stremskiykursova;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FilmPageController {
    @FXML
    private Label name;

    @FXML
    private Label actors;
    @FXML
    private Label film_maker;

    @FXML
    private Label country;

    @FXML
    private Label year;

    public void setData(FilmView filmView){
        System.out.println(filmView.getName_film());
        name.setText(filmView.getName_film());
        year.setText(filmView.getYear_prodaction());
        country.setText(filmView.getCountry());
        film_maker.setText(filmView.getFilm_maker());
        actors.setText(filmView.getActors());
    }

}

