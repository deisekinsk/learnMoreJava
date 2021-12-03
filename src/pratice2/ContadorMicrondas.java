import java.util.Scanner;

public class ContadorMicrondas {
    
    public static void main (String [] args){
        System.out.println("***Contador de Microondas 🍲 ***");
        
        Scanner scann = new Scanner(System.in);
        System.out.print("Insira o minuto: ");
        int mm = scann.nextInt();
        System.out.print("Insira o segundo: ");
        int ss = scann.nextInt();
        
    
        System.out.println(" ⏲️ TIMER ON "+ mm + ":"+ss);
       
            while(mm>=0){
                if(ss<=60){
                    for(int j = ss; j>=0; j--){
                        System.out.println(mm+":"+j);
                    }    
                }
                mm-=1;
                ss = 60;
            }
        System.out.println("FOOD READY 🍛");
        }
    }
