package com.example.santanacop3330assignment4;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Derek Santana
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class App extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainwindow.fxml")));
        // I am thinking about making a  few more windows in my final product to make things easier and not so
        // crammed in one window that's why I have it named  "mainwindow.fxml"
        Scene scene = new Scene(root);
        stage.setTitle("Things-To-Do");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args)
    {
        // just launch here
        launch();
    }
}