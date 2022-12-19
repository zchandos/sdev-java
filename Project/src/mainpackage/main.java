package mainpackage;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class main extends Application {

    //first scene
    public void start(Stage primaryStage){
        
        //creates gridpane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);
        
        //text fields and buttons for first scene
        final TextField tfFname = new TextField();
        final Button btFname = new Button("Enter");

        final TextField tfLname = new TextField();
        final Button btLname = new Button("Enter");
        
        final TextField tfPhoneNum = new TextField();
        final Button btPhoneNum = new Button("Enter");
        
        final TextField tfCity = new TextField();
        final Button btCity = new Button("Enter");
        
        final TextField tfState = new TextField();
        final Button btState = new Button("Enter");
        
        final Button btNextPage = new Button("Next Page");
        
      
        //adds text fields, buttons, and labels to the gridpane
        gridPane.add(new Label("Please Enter Traveler Details: "), 0, 0);

        gridPane.add(new Label("First Name:"), 0, 1);
        gridPane.add(tfFname, 1, 1);
        gridPane.add(btFname, 2, 1);

        gridPane.add(new Label("Last Name:"), 0, 2);
        gridPane.add(tfLname, 1, 2);
        gridPane.add(btLname, 2, 2);
        
        gridPane.add(new Label("Phone Number: "), 0, 3);
        gridPane.add(tfPhoneNum, 1, 3);
        gridPane.add(btPhoneNum, 2, 3);
        
        gridPane.add(new Label("City: "), 0, 4);
        gridPane.add(tfCity, 1, 4);
        gridPane.add(btCity, 2, 4);
        
        gridPane.add(new Label("State: "), 0, 5);
        gridPane.add(tfState, 1, 5);
        gridPane.add(btState, 2, 5);
             
        gridPane.add(btNextPage, 2, 6);
        btNextPage.setOnAction(event -> scene2(primaryStage)); //switches to scene2

        //creates the scene
        Scene scene = new Scene(gridPane, 800, 500);
        primaryStage.setTitle("Project");
        primaryStage.setScene(scene);
        primaryStage.show();
}
    
    //second scene
    public void scene2(Stage primaryStage) {
        
        //creates gridpane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);
        
        //text fields and buttons for second scene
        final TextField tfDestination = new TextField();
        final Button btDestination = new Button("Enter");

        final TextField tfFrom = new TextField();
        final TextField tfTill = new TextField();
        final Button btDates = new Button("Enter");
        
        final Button btSubmit = new Button("Submit");

        //adds text fields, buttons, and labels to the gridpane
        gridPane.add(new Label("Please Enter your Travel Details: "),0 , 0);
        
        gridPane.add(new Label("Destination: "), 0, 1);
        gridPane.add(tfDestination, 1, 1);
        gridPane.add(btDestination, 4, 1);
        
        gridPane.add(new Label("Dates From:"), 0, 2);
        gridPane.add(tfFrom, 1, 2);
        
        gridPane.add(new Label("Dates Till:"), 2, 2);
        gridPane.add(tfTill, 3, 2);
        gridPane.add(btDates, 4, 2);
        gridPane.add(btSubmit, 4, 3);
        
        btSubmit.setOnAction(event -> scene3(primaryStage)); //switches to scene3
        
        //creates the scene
        Scene scene = new Scene(gridPane, 800, 500);
        primaryStage.setTitle("Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //scene 3
    public void scene3(Stage primaaryStage) {

    }
    
    //main function to launch the program
    public static void main(String[] args){
        launch(args);
        
        
    }
}
