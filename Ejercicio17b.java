public class Ejercicio17b {
    public static void main(String[] args) {
        int nota1 = 8, nota2 = 8, nota3 = 6;
        int sumaPares = 0;

        sumaPares += (nota1 % 2 == 0) ? nota1 : 0;
        sumaPares += (nota2 % 2 == 0) ? nota2 : 0;
        sumaPares += (nota3 % 2 == 0) ? nota3 : 0;

        System.out.println("Suma de notas pares: " + sumaPares);
    }
}
