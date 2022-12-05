
package exercises;
import java.util.Scanner;

/*
 * Module 05: Programming Assignment
 * Chapter 12: Exercise 12.7
 * (BINARYFORMATEXCEPTION) Exercise 12.7 implements the bin2Dec method to throw 
 * a BinaryFormatException if the string is not a binary string. Define a custom
 * exception called BinaryFormatException. Implement the bin2Dec method to throw 
 * a BinaryFormatException if the string is not a binary string.
 * @author Zachary Chandos
 */


//defines custom exception 
class BinaryFormatException extends IllegalArgumentException{
    
    BinaryFormatException(String binary){
    }
}

public class exercise12point9 {
    
    //main, allows user to input a binary to convert to decimal
    public static void main(String[] args){
       
       Scanner input = new Scanner(System.in);
        
       System.out.println("Please enter a binary to convert to decimal: ");
       
       String binary = input.next();
        
       System.out.println(bin2Dec(binary));
        
    }

//method to convert binary to decimal, throws the exception 
//"BinaryFormatException" if isBinary() returns false
//elsewise the function will continue as normal
public static int bin2Dec(String binary) throws BinaryFormatException{
    if (!isBinary(binary)){
        throw new BinaryFormatException(binary +  " is not a binary.");
}
    int decimal = 0;
    int power = 0;
    for (int i = binary.length() - 1; i >= 0; i--){
        if (binary.charAt(i) == '1'){
            decimal += Math.pow(2, power);
        }
        power++;
    }
    return decimal;
}

//method to check that the user inputed a binary number
public static boolean isBinary(String binary){

    for(char ch : binary.toCharArray()){
        if (ch != '1' && ch != '0') return false;
    }
    return true;
}

}

