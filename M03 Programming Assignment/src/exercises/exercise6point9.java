
package exercises;

/*
 * Module 03: Programming Assignment
 * Chapter 6: Exercise 6.9
 * (CONVERSIONS BETWEEN FEET AND METERS) Write a class that contains the following two methods:
 * @author Zachary Chandos
 */
public class exercise6point9 {
    
    //method defintions
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    }
    
    //method defintions
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
    
    public static void main(String[] args){
        //table header
        System.out.println(" Feet   Meters      |     Meters      Feet");
        System.out.println("------------------------------------------");
        
        //for loop to output the table
        for (double foot = 1.0, meter = 20.0; foot <= 10.0 && meter <= 65.0; foot += 1.0, meter += 5.0){
           //formatting for table
           System.out.printf("%4.1f     ", foot);
	   System.out.printf("%6.3f", footToMeter(foot)); //method calls
	   System.out.print("     |     ");
	   System.out.printf("%-11.1f", meter);
	   System.out.printf("%7.3f\n", meterToFoot(meter)); //method calls 
        }
    }
    
}
