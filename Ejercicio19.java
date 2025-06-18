public class Ejercicio19 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            int numero = (int)(Math.random() * 100);
            suma += numero;
            System.out.println("Número: " + numero);
        }
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + (suma / 10.0));
    }
}

