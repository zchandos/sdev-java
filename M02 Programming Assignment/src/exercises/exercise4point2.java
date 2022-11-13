package exercises;
import java.util.Scanner; //imports scanner method
/**
 * Module 02: Programming Assignment
 * Chapter 4: Exercise 4.2
 * Calculate the distance between two points
 * @author Zachary Chandos
 */
public class exercise4point2 {
  public static void main(String[] args) {
    
    double radius = 6371.01;
    
    //Creates scanner object
    Scanner input = new Scanner(System.in);
    
    //Prompts user to input point 1 degrees
    System.out.print("Enter point 1 (latitude and logitude) in degrees: ");
    
    //Recieves point1 degrees and converts to radians
    double x1 = Math.toRadians(input.nextDouble());
    double x2 = Math.toRadians(input.nextDouble());
    
    //Prompts user to input point 2 degrees
    System.out.print("Enter point 2 (latitude and logitude) in degrees: ");
    
    //Recieves point1 degrees and converts to radians
    double y1 = Math.toRadians(input.nextDouble());
    double y2 = Math.toRadians(input.nextDouble());
    
    //Calculates distance between the two points
    double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
   
    //Outputs distance
    System.out.print("The distance between the two points is: " + distance);
}
}