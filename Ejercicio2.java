import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");
    }
}