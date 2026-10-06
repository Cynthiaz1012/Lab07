package com.mycompany.lab07_cynthia;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) { 
        Pane topPane = new Pane();
        Button startButton = new Button("Start");
        Button resetButton = new Button("Reset");
        Button exitButton = new Button("Exit");
        HBox bottomPane = new HBox(20);
        bottomPane.getChildren().addAll(startButton, resetButton, exitButton);
        
        BorderPane root = new BorderPane();
        root.setCenter(topPane);
        root.setBottom(bottomPane);
        
    }

    public static void main(String[] args) {
        launch();
    }

}   