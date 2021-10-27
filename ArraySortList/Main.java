import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        int[] arr = {18, 02, 88, 31, 03, 85, 07, 01, 17};
        
        // System.out.print("Array: "); 
        // //for-each
        // for(int i: arr ){
        //     System.out.print(i + " ");
        // }
        
        System.out.print( "Array: "+ Arrays.toString(arr)); 
       
        System.out.println("\nArray posição 3: " + arr[3]);
        
        int comprimento = arr.length;
        System.out.println("Tamanho do Array: " + comprimento);
        
        int reorganiza = 0;
        for(int i = 0; i < comprimento - 1; i++){
            for(int j = 0; j < comprimento - i - 1; j++){
                if(arr[j] < arr[j + 1]){ //crescente/decrescente | compara
                    reorganiza = arr[j]; //troca/swap
                    arr[j] = arr[j + 1];
                    arr[j + 1] = reorganiza;
                    
                }
            }
        }
       
        System.out.println( "Array ordem crescente: "+ Arrays.toString(arr)); 
    }
}
