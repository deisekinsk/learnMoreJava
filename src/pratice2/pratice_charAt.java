/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice2;

/**
 *
 * @author Deise Kinsk
 */
public class pratice_charAt {
    
    public static void main(String[] args){
        
        String str = "ROMA";
        String result = " ";
               
        
        for (int i=str.length()-1; i >= 0; i--){
            
            result = result + str.charAt(i);
        }
    
        System.out.println(result);
    }
}
