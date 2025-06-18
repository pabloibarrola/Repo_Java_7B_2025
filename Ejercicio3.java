public class Ejercicio3 {
    public static void main(String[] args) {
        String mes = "mayo";
        if (mes.equals("noviembre") || mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre"))
            System.out.println(mes + " tiene 30 días.");
        else if (mes.equals("febrero"))
            System.out.println(mes + " tiene 28 días.");
        else
            System.out.println(mes + " tiene 31 días.");
    }
}
