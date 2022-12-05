package exercises;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * Module 06: Programming Assignment
 * Chapter 15: Exercise 15.4
 * (CREATE AN INVESTMENT-VALUE CALCULATOR) Write a program that calculates the
 * future value of an investment at a given interest rate for a specified number
 * of years.  
 * @author Zachary Chandos
 */
public class exercise15point4 extends Application {
    
    //create fields
    final private TextField tfInvestmentAmount = new TextField();
    final private TextField tfNumberOfYears = new TextField();
    final private TextField tfAnnualInterestRate = new TextField();
    final private TextField tfFutureValue = new TextField();
    final private Button btCalculate = new Button("Calculate");
    
    @Override
    public void start(Stage primaryStage) {
        
        //create ui
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        
        gridPane.add(new Label("Investment Amount:"), 0, 0);
        gridPane.add(tfInvestmentAmount, 1, 0);
        
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(tfNumberOfYears, 1, 1);

        gridPane.add(new Label("Annual Interest Rate:"), 0, 2);
        gridPane.add(tfAnnualInterestRate, 1, 2);
        
        gridPane.add(new Label("Future value:"), 0, 3);
        gridPane.add(tfFutureValue, 1, 3);
        
        gridPane.add(btCalculate, 1, 4);
        
        //set properties for ui
        gridPane.setAlignment(Pos.CENTER);
        tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
        tfFutureValue.setEditable(false);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);
        
        //process event
        btCalculate.setOnAction(e -> calculateFutureInvestment());
        
        //create scene
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("Exercise15_05");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //calculates investment
    private void calculateFutureInvestment(){
        
        double investAmount = Double.parseDouble(tfInvestmentAmount.getText());
        int numOfYears = Integer.parseInt(tfNumberOfYears.getText());
        double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText());
        double monthlyInterestRate;
        double futureValue;
        
        monthlyInterestRate = annualInterestRate / 1200;
        
        futureValue = investAmount * Math.pow(1 + monthlyInterestRate, numOfYears * 12);
        
        tfFutureValue.setText(String.format("$%.2f", futureValue));
    } 
    
    //launches program in ide
    public static void main(String[] args){
        launch(args);
    }
}
