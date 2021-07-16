
package pratice_algoritimo;

/**
 *
 * @author Deise Kinsk
 */
import java.util.Scanner;

public class floatNumber {
    
    public static void main (String[] args){
        
        float a,b,c;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a float number: ");
        a = scan.nextFloat();
        System.out.println("Second float number: ");
        b = scan.nextFloat();
        
        c = a;
        a = b;
        b = c;
        
        //divide with the > number
        
        if (a>b){
        System.out.println(a/b);
        }else {
        System.out.println(b/a);
        }
    
        }
    
}
