import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {
       
        double Ax,Ay, Bx, By, distancia;
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        Ax = input.nextDouble();
        Ay = input.nextDouble();
        
        Bx = input.nextDouble();
        By = input.nextDouble();
        
        double X = (Bx - Ax) * (Bx - Ax);
        double Y = (By - Ay) * (By - Ay);
        
        distancia = Math.sqrt(X + Y);

        
      /*  System.out.printf("Ax = %.4f\n"
                + "Ay = %.4f\n"
                + "Bx = %.4f\n"
                + "By = %.4f\n", Ax, Ay, Bx, By);*/
        
        System.out.printf("%.4f\n", distancia);
        
    }
    
}
