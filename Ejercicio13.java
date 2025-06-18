public class Ejercicio13 {
    public static void main(String[] args) {
        String mes = "febrero";
        switch (mes) {
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("30 días");
                break;
            case "febrero":
                System.out.println("28 días");
                break;
            default:
                System.out.println("31 días");
        }
    }
}

