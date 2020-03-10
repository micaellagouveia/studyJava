package firstprogram;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class FirstProgram {
    

    public static void main(String[] args) {
        
        
       Scanner input = new Scanner(System.in);
       
       int N = input.nextInt();
       
       for(int i=0;i<N;i++){
      
       Scanner entrada = new Scanner(System.in); 
       
    //   entrada1 = entrada.split("\n");
       char [] letras = null;
       String palavra = entrada.nextLine();
       
       letras = palavra.toCharArray();
       
       for(int j=0; j< letras.length; j++){   
          System.out.printf("Letra[ %d ]: %c\n", j, letras[j]);

       }
       
    }
    }
    
}
