import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Equipo equipo = new Equipo();
        System.out.println("Introduce el nombre del programador 1");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el apellido del programador 1:");
        String apellido = teclado.nextLine();
        equipo.añadirProgramador(new Programadores(nombre, apellido));

        System.out.println("Introduce el nombre del programador 2");
        String nombre2 = teclado.nextLine();
        System.out.println("Introduce el apellido del programador 2:");
        String apellido2 = teclado.nextLine();
        equipo.añadirProgramador(new Programadores(nombre, apellido));

        System.out.println("Introduce el nombre del programador 3");
        String nombre3 = teclado.nextLine();
        System.out.println("Introduce el apellido del programador 3:");
        String apellido3 = teclado.nextLine();
        equipo.añadirProgramador(new Programadores(nombre, apellido));

        System.out.println(equipo.getTamaño());
        equipo.completo();
        System.out.println(equipo.toString());
    }
}
