import java.util.*; 
import java.io.*;

class Main {

  public static String LetterCapitalize(String str) {
    // code goes here

  String arr[] = str.split(" ");//str in array
  String phrase = "";
  int len = arr.length;

  //iteration | for-each loop | ???? AQUI LEO!
  for (String i:arr){

    //catch the 1º letter
    String upOne = i.substring(0,1);
    
    //catch remain letters | ???? AQUI LEO!
    String remain = i.substring(1);
    
    String toUpper = upOne.toUpperCase();

    phrase = phrase + toUpper + remain + " ";

    //phrase = phrase + toUpper + " ";

  }

  return phrase;

  }




  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }

}
