
package pratice2;

/**
 *
 * @author Deise Kinsk
 */

import java.util.Scanner;


public class swapNumbers {
    //class
    public static void main (String [] args){
    //variables
    float numA, numB,numEmpty;
    
    //Input
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your 1º number | with decimal (ex: 2.0): ");
     numA = input.nextFloat();
    //Scanner inputB = new Scanner(System.in);
    System.out.print("Enter your 2º number | with decimal: ");
    numB = input.nextFloat();
    
    //logical
    numEmpty = numA;
    numA = numB;
    numB = numEmpty;
    
    float mathA = numB/numA;
    float mathB = numA/numB;
    
    //print
    System.out.println("First divide in your sequence: " + numB + " % "+numA+" = "+mathA);
    System.out.println("When you inverte the numbers: " + numA + " % "+numB+" = "+mathB);
    } 
    
    
}
