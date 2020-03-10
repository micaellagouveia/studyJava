import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static double Tabela(int valor, int qtd) {
        double soma = 0;
        switch(valor){
        
            case 1:
                soma = 4;
                break;
            case 2:
                soma = 4.5;
                break;
            case 3:
                soma = 5;
                break;
            case 4:
                soma = 2;
                break;
            case 5:
                soma = 1.5;
                break;
        }
        
        return soma * qtd;
        }


    public static void main(String[] args) {
           
       Scanner input = new Scanner(System.in);
       
       int a = input.nextInt();
       int b = input.nextInt();

        System.out.printf("Total: R$ %.2f\n", Tabela(a, b));
       
       
    }
    
}
