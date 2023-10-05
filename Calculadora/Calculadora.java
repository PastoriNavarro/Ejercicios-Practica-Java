import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        float numero1 = teclado.nextFloat();

        System.out.println("Introduce el segundo número");
        float numero2 = teclado.nextFloat();

        System.out.println("Elige la operación que deseas realizar");
        System.out.println("1: suma");
        System.out.println("2: resta");
        System.out.println("3: multipliación");
        System.out.println("4: división");
        int operacion = teclado.nextInt();

        switch (operacion){
            case 1:
                float suma = numero1 + numero2;
                System.out.println("El resultado es: " + suma);
                break;
            case 2:
                float resta = numero1 - numero2;
                System.out.println("El resultado es: " + resta);
                break;
            case 3:
                float multiplicacion = numero1 * numero2;
                System.out.println("El resultado es: " + multiplicacion);
                break;
            case 4:
                float division = numero1 / numero2;
                System.out.println("El resultado es: " + division);
                break;
        }



    }
}
