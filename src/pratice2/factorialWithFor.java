import java.util.*; 
import java.io.*;

class Main {

  public static int FirstFactorial(int num) {
    // code goes here
   
    int mult = 1;

    for (int i = num; i > 1 ; i--){

      mult = mult * i;
    }

    return mult;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine()));

     
  }

}
