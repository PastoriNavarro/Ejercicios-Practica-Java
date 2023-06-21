
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Carta carta = new Carta(Carta.Palo.COPAS, Carta.Numero.CINCO);
        System.out.println(carta.toString());
    }
}
