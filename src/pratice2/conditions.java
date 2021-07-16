/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice2;

import java.util.Scanner;

/**
 *
 * @author Deise Kinsk
 */
public class conditions {
    
    public static void main (String [] args){
        int studentGrade = 0;
        
        Scanner inputA = new Scanner(System.in);
        System.out.println("Enter your data number: ");
        
        studentGrade = inputA.nextInt();
        
        if (studentGrade >= 60){
            
            System.out.println("Passed");
        
        } else if (studentGrade <= 59 && studentGrade >= 40) {
        
         System.out.println("Try again.");
       
        } else{
            System.out.println("You don't conclude in this time.");
        }
    
    }
    
}
