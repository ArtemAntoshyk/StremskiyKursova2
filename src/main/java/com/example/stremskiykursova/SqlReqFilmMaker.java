package com.example.stremskiykursova;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlReqFilmMaker {
    FilmView filmView = null;
        public List<FilmView> sql() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
            System.out.println("");
            String url = "jdbc:mysql://localhost/movielibrary";
            String username = "root";
            String password = "00001111";
            List<FilmView> ls = new ArrayList<>();

            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                System.out.println("");
                PreparedStatement pr = conn.prepareStatement("select *  from film_maker");
                ResultSet rs = pr.executeQuery();

                while (rs.next()) {//пока у ResultSet есть данные
                    filmView = new FilmView();
                    filmView.setId(rs.getInt(1));
                    filmView.setName_film(rs.getString(2));
                    filmView.setActors(rs.getString(3));
                    filmView.setFilm_maker(rs.getString(4));
                    filmView.setCountry(rs.getString(5));
                    filmView.setYear_prodaction(String.valueOf(rs.getDate(6)));
                    ls.add(filmView);

                }
                return ls;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Connection to Store DB succesfull!");
            return null;
        }


}