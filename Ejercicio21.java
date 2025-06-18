public class Ejercicio21 {
    public static void main(String[] args) {
        char categoria = 'b';
        int antiguedad = 7;
        double sueldo = 10000;
        double aumento = 0;
        if (antiguedad >= 1 && antiguedad <= 5) aumento = 0.05;
        else if (antiguedad <= 10) aumento = 0.10;
        else aumento = 0.30;

        int plus = 0;
        if (categoria == 'a') plus = 1000;
        else if (categoria == 'b') plus = 2000;
        else if (categoria == 'c') plus = 3000;

        double sueldoNeto = sueldo + (sueldo * aumento) + plus;
        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}


