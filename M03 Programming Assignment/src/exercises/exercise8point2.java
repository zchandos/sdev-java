package exercises;
import java.util.Scanner;
/*
 * Module 03: Programming Assignment
 * Chapter 8: Exercise 8.2
 * 8.2 (SUM THE MAJOR DIAGONAL IN A MATRIX) Write a method that sums all the
 * numbers in the major diagonal in an n×n matrix of double values using the
 * following header: 
 * @author Zachary Chandos
 */
public class exercise8point2 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double[][] sumMajorDiagonal = new double[4][4];
        
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        
        for (int i = 0; i < sumMajorDiagonal.length; i++){
            for (int j = 0; j < sumMajorDiagonal[0].length; j++){
                sumMajorDiagonal[i][j] = input.nextDouble();
            }
        }
        
        System.out.print("Sum of the elements in the major diagonal is " + sum(sumMajorDiagonal));
    }
    
    public static double sum(double[][] sumMajorDiagonal){
        double sum = 0.0;
        for (int i = 0; i < sumMajorDiagonal.length; i++){
            sum += sumMajorDiagonal[i][i];
        }
        return sum;
    }
}
