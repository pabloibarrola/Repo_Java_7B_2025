public class Ejercicio17a {
    public static void main(String[] args) {
        int nota1 = 8, nota2 = 8, nota3 = 6;
        int sumaPares = 0;

        if (nota1 % 2 == 0) sumaPares += nota1;
        if (nota2 % 2 == 0) sumaPares += nota2;
        if (nota3 % 2 == 0) sumaPares += nota3;

        System.out.println("Suma de notas pares: " + sumaPares);
    }
}
