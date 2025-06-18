public class Ejercicio9 {
    public static void main(String[] args) {
        int jugador1 = 1;
        int jugador2 = 2;
        if ((jugador1 == 0 && jugador2 == 2) && !(jugador2 == 0 && jugador1 == 2))
            System.out.println("Jugador 1 gana");
        else if (jugador1 == jugador2)
            System.out.println("Empate");
        else
            System.out.println("Jugador 2 gana");
    }
}

