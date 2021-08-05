//ERRO OUTPUT! Study this sequence:https://www.baeldung.com/java-palindrome

import java.util.*; 
import java.io.*;

class Main {

  public static String Palindrome(String str) {
    // code goes here 

    int len = str.length();

    String invertW = " ";

    for(int i = len-1; i >= 0; i-- ){

      invertW = invertW + str.charAt(i);
      System.out.println(invertW);

    }

    

    if(str.equals(invertW)){
      return "false";
    }else{
      return "true";
    
    }

  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(Palindrome(s.nextLine())); 
  }

}
