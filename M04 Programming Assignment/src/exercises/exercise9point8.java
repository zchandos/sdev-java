
package exercises;

/*
 * Module 04: Programming Assignment
 * Chapter 9: Exercise 9.8
 * (THE FAN CLASS) Design a class named Fan to represent a fan.
 * @author Zachary Chandos
 */

class Fan{
    
    //data fields
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
            
    private int speed = slow;
    private boolean power;
    private double radius = 5;
    private String color = "Blue"; 
    
    //Speed getter and setter 
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    
    //Power getter and setter
    public boolean getPower(){
        return power;
    }
    public void setPower(boolean newPower){
        power = newPower;
    }
   
    //Radius getter and setter
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    
    //Color getter and setter
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    
    //no-arg constructor
    Fan(){}   
    
    //method to output description of fan
    public String toString(){
       if(power == true){
            String string = "The fans speed is " + speed + ", it's color is " + color + ", and it's radius is " + radius;
            return string;
    }
       else{
           String string = "The fan is off, " + "it's color is " + color + ", and it's radius is " + radius;
           return string;
       }
}
}

public class exercise9point8 {
    
    public static void main(String[] args){
       
       //creates fan1 and fan2 objects
       Fan fan1 = new Fan();
       Fan fan2 = new Fan();
       
       //sets data fields for fan1
       fan1.setSpeed(3);
       fan1.setRadius(10);
       fan1.setColor("yellow");
       fan1.setPower(true);
       
       //sets data fields for fan2
       fan2.setSpeed(2);
       fan2.setRadius(5);
       fan2.setColor("blue");
       fan2.setPower(false);
       
       //class toString method in Fan class
       System.out.println(fan1.toString());
       System.out.println(fan2.toString());
    }
}

