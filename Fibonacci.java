package fibonacci;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner esotilin = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea ver ");
        int nm = esotilin.nextInt();
        esotilin.close();
        
        int pr = 0;
        int se = 1; 
        
        for (int i = 1; i <= nm; i++) {
            System.out.println(pr + "");
            int sig = pr + se;
            pr = se;
            se = sig;
        }

    }
}