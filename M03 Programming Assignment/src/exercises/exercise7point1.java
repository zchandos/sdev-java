
package exercises;
import java.util.Scanner; //imports scanner method

/*
 * Module 03: Programming Assignment
 * Chapter 7: Exercise 7.1
 * 7.1 (ASSIGN GRADES) Write a program that reads student scores, 
 * gets the best score, and then assigns grades based on the following scheme:
 * @author Zachary Chandos
 */

public class exercise7point1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //Has user input how many students there is.
        int numStudents;
        System.out.println("Enter the number of students: ");
        numStudents = input.nextInt();
        
        //Creates arrays for both scores and grades. Size determined by amount of students.
        int[] scores = new int[numStudents];
        String[] grades = new String[numStudents];
        
        //Allows user to input scores based on how many students there is.
        System.out.println("Enter " + numStudents + " scores: ");
        for(int i = 0; i < scores.length; i++ ){
            scores[i] = input.nextInt();
        }
        
        //Determines best score
        int best = scores[0];
        for(int i = 0; i < scores.length; i++){
            if( scores[i] > best){
                best = scores[i];
            }
        }
        
        //Assigns grades based on best score
        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= best - 10){
                grades[i] = "A";
            }
            else if(scores[i] >= best - 20){
                grades[i] = "B";
        }
            else if(scores[i] >= best - 30){
                grades[i] = "C";
            }
            else if(scores[i] >= best - 40){
                grades[i] = "D";
            }
            else{
                grades[i] = "F";
            }
        }
        
        //Outputs students scores and grades.
        for(int i = 0; i < scores.length; i++){
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
        }
    }
}
