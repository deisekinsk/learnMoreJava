package pratice2;

/**
 *
 * @author Deise Kinsk
 */
public class findCharacters {
    
public static void main (String [ ] args){
    
    
    //char str2 = str.charAt(0);
    String str = "a$h4n1I";
    int letter=0, space=0, num=0, other=0;
    int len = str.length();
    char[] ch = str.toCharArray();

    for (int i=0; i<len; i++){
        if(Character.isLowerCase(ch[i])){
            letter++;
        }else if (Character.isUpperCase(ch[i])){
            other++;
        } else if (Character.isDigit(ch[i])){
            num++;
        }
    }
   
     System.out.println("Number of letters lower case: "+ letter + " \n"+ "Number of number: "+ num);
     
     
    }    
}
