package numeroimpar;
import java.util.Scanner;
public class NumeroImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero entero: ");
        int numero = scanner.nextInt();

        boolean esPar = numero % 2 == 0;

        if (esPar) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
    }
    
}
}
