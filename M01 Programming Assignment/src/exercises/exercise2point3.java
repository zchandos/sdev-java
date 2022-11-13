package exercises;

/**
 * Module 01: Programming Assignment
 * Chapter 2: Exercise 2.3
 * Write a program that reads a number in feet, converts it to meters, and displays the result.
 * @author Zachary Chandos
 */
import java.util.Scanner;

public class exercise2point3 {
    public static void main(String[] args) {
        //Creates scanner object
        Scanner input = new Scanner(System.in);
        //Prompts user to input value for feet
        System.out.print("Enter a number for feet to convert to meters: ");
        double feet = input.nextDouble();
        //Converts feet to meters
        double meters = feet * 0.304;
        //Outputs meters
        System.out.println(feet + " feet " + "converted to meters is: " + meters + " meters!");
    }
}