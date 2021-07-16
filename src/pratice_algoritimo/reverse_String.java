package pratice_algoritimo;

/**
 *
 * @author Deise Kinsk
 */
public class reverse_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// first mode = CONCATANATION
        
        String str = "AMOR";
        String rev = ""; //empty variable
        int len = str.length(); 
        
 //start || end  || operation
    
        for (int i=len-1; i >=0; i--){
            
            rev=rev+str.charAt(i);        

        }
        
        
         //seconde way = ARRAY
         
        String str2 = "AMOR";
        String rev2 = ""; //empty variable
        
        char array[]=str2.toCharArray();
        int len2=array.length; 
         
         
         
         for (int i = len2-1; i>=0; i--){
             rev2 = rev2 + array[i];
         }
         
         //3. Buffer class
         
         StringBuilder str3 = new StringBuilder(str2);
        
    
        System.out.println("Reverse with concatenation: " + str +" ==> "+ rev);
        System.out.println("Reverse with ARRAY: " + str2+" ==> "+rev2);
        System.out.println("Reverse with StringBuilder/ reverse(): " +str2+" ==> "+str3.reverse());
    }
    
}
