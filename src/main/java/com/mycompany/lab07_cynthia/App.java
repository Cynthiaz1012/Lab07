package com.mycompany.lab07_cynthia;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;


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
        
        Circle objectA = new Circle(100, 100, 15);
        objectA.setFill(Color.RED);
        topPane.getChildren().add(objectA);
              
        Polygon path = new Polygon(100, 100, 600, 100, 600, 450, 100, 450);
        path.setFill(Color.WHITE);
        path.setStroke(Color.BLACK);
        topPane.getChildren().add(path);
       
        PathTransition pathTransition = new PathTransition(new Duration(12000), path, objectA);
        
        Ellipse objectB = new Ellipse( 350, 275, 70, 40);
        objectB.setFill(Color.BLUE);
        objectB.setStroke(Color.BLACK);
        topPane.getChildren().add(objectB);
        
        FadeTransition fade = new FadeTransition(new Duration(3000), objectB);
        fade.setFromValue(1.0);
        fade.setToValue(0.2);
             
        ScaleTransition scale = new ScaleTransition(new Duration(3000), objectB);
        scale.setToX(2.0);
        scale.setToY(2.0);
        
        RotateTransition rotate = new RotateTransition(new Duration(3000), objectB);
        rotate.setFromAngle(0.0);
        rotate.setByAngle(360.0);
        
        TranslateTransition translate = new TranslateTransition(new Duration(3000), objectB);
        translate.setToY(-100);
        
        SequentialTransition sequential = new SequentialTransition(fade, scale, rotate, translate);

    }

    public static void main(String[] args) {
        launch();
    }

}   