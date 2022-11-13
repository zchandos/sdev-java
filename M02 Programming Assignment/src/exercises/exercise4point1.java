
package exercises;
import java.util.Scanner; //imports scanner method
/*
 * Module 02: Programming Assignment
 * Chapter 4: Exercise 4.1
 * Calculate the area of a pentagon by inputting the radius
 * @author Zachary Chandos
 */
public class exercise4point1 {
 public static void main(String[] args) {
    
    //Creates scanner object
    Scanner input = new Scanner(System.in);
    
    //Prompts user to input a number for radius
    System.out.print("Enter the radius of the pentagon: "); 
    
    //recieves radius input
    double radius = input.nextDouble();
    
    //Calculates side of pentagon
    double side = (2 * radius * Math.sin(Math.PI / 5));
    
    //Calculates area of pentagon
    double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    
    //Outputs area of pentagon
    System.out.print("The area of the pentagon is: " + Math.round(area*100.00)/100.00);
  }   
}
