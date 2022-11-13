
package exercises;

/*
 * Module 02: Programming Assignment
 * Chapter 5: Exercise 5.5
 * Write a program that displays the following two table side by side
 * @author Zachary Chandos
 */
public class exercise5point5 {
    public static void main(String[] args) {
 
	double poundPerKilogram = 2.2;
        
	System.out.println("Kilograms    Pounds     |     Pounds      Kilograms");
            //Loops for the max given kilograms and pounds
        for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
            //Formatting for table
            System.out.printf("%-12d%7.1f", k, (k * poundPerKilogram));
            System.out.print("     |     ");
            //Formatting for table
            System.out.printf("%-9d%12.2f\n",p, (p / poundPerKilogram));
	}
    }   
}
