
package exercises;
import java.util.Scanner;
/*
 * Module 04: Programming Assignment
 * Chapter 11: Exercise 11.1
 *  Design a class named Triangle that extends ­GeometricObject. 
 * @author Zachary Chandos
 */

//class declaration
class Triangle{
    
    //data fields
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private boolean filled;
    private String color;
    
    //no args constructor
    Triangle(){}
    
    //args constructor
    Triangle(double side1, double side2, double side3){
        
    }
    
    //side1 getter and setter
    public void setSide1(double newSide1){
        side1 = newSide1;
    }
    public double getSide1(){
        return side1;
    }
    
    //side2 getter and setter
    public void setSide2(double newSide2){
        side2 = newSide2;
    }
    public double getSide2(){
        return side2;
    }
    
    //side3 getter and setter
    public void setSide3(double newSide3){
        side3 = newSide3;
    }
    public double getSide3(){
        return side3;
    }
    
    //filled getter and setter
    public void setFilled(int newFilled){
        if(newFilled == 1){
            filled = true;
        }
    }
    public boolean getFilled(){
        return filled;
    }
  
    //color getter and setter
    public void setColor(String newColor){
        color = newColor;
    }
    public String getColor(){
        return color;
    }

    //calculates area of triangle
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }
    
    //calculates perimeter of triangle
    public double getPerimeter(){
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
    
    //to string method for description
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
    
    //to string method for if triangle is filled or not
    public String filled(){
        
        String filledStatus;
                
        if(filled == true){
            filledStatus = "filled";
        }
        else{
            filledStatus = "not filled";
        }
        return filledStatus;
    }
}

public class exercise11point1 {
    
  public static void main(String[] args){
    
    //creates object
    Triangle myTriangle = new Triangle();
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the 3 sides of the triangle: ");
    
    //has user set objects sides
    myTriangle.setSide1(input.nextDouble());
    myTriangle.setSide2(input.nextDouble());
    myTriangle.setSide3(input.nextDouble());
    
    System.out.println("Please enter the color of the triangle: ");
    
    //has user set objects color
    myTriangle.setColor(input.next());
    
    System.out.println("Enter 1 if the triangle is filled, 0 if it is not: ");
    
    //has user set if it is filled or not
    myTriangle.setFilled(input.nextInt());
    
    //outputs complete description of triangle.
    System.out.println("The area of the triangle is " + myTriangle.getArea() +
            ", the perimeter is " + myTriangle.getPerimeter() + ", the color is"
            + " " + myTriangle.getColor() + ", and it is " + myTriangle.filled());
    }
}
