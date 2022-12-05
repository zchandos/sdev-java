package exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;

/*
 * Module 06: Programming Assignment
 * Chapter 14: Exercise 14.1
 * (DISPLAY IMAGES) Write a program that displays four images in a grid pane, 
 * as shown in Figure 14.43a.
 * @author Zachary Chandos
 */

public class exercise14point1 extends Application{
    @Override
    public void start(Stage primaryStage){
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        
       
        
        Image image = new Image("image/us.gif");
        ImageView imageView1 = new ImageView(image);
        pane.add(imageView1, 0, 0);
        
        
        Image image2 = new Image("image/ca.gif");
        ImageView imageView2 = new ImageView(image2);
        pane.add(imageView2, 1, 0);
        
        Image image3 = new Image("image/uk.gif");
        ImageView imageView3 = new ImageView(image3);
        pane.add(imageView3, 0, 1);
        
        Image image4 = new Image("image/china.gif");
        ImageView imageView4 = new ImageView(image4);
        pane.add(imageView4, 1, 1);
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_01");
        primaryStage.setScene(scene);
        primaryStage.show();      
    }
    
public static void main(String[] args) {
        launch(args);
    }
}