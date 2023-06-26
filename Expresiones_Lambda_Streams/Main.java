import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        Ciudades c1 = new Ciudades("Madrid", "Madrid", 1456987);
        Ciudades c2 = new Ciudades("Sevilla", "Sevilla", 567987);
        Ciudades c3 = new Ciudades("Jaca", "Huesca", 50365);
        Ciudades c4 = new Ciudades("Mojacar", "Almería", 26754);
        Ciudades c5 = new Ciudades("Mostoles", "Madrid", 20765);

        List<Ciudades> ciudades = new ArrayList<>();
        ciudades.add(c1);
        ciudades.add(c2);
        ciudades.add(c3);
        ciudades.add(c4);
        ciudades.add(c5);

        //Cuantas ciudades hay
        System.out.println(ciudades.size());

        //Lista con todos los vehículos
        List<Ciudades> madridMas1000 = ciudades.stream()
                .filter(ciudad -> ciudad.getProvincia().equals("Madrid"))
                .filter(ciudad -> ciudad.getHabitantes() > 1000)
                .collect(Collectors.toList());
        System.out.println(madridMas1000);

        //De qué provincias son las ciudades
        ciudades.stream()
                .map(Ciudades::getProvincia)
                .distinct()
                .forEach(System.out::println);

        //Cuantas provincias diferentes hay en la lista
        long provincias = ciudades.stream()
                .map(Ciudades:: getProvincia)
                .distinct()
                .count();
        System.out.println("Provincias diferentes de la lista: " + provincias);

        //Ciudad de Madrid con más de 50.000 habitantes
        List<Ciudades> ciudadMadrid = ciudades.stream()
                .filter(ciudad -> ciudad.getProvincia().equals("Madrid"))
                .filter(ciudad -> ciudad.getHabitantes() > 50000)
                .collect(Collectors.toList());
        System.out.println("Ciudad de madrid con más de 50000 habitantes \n" + ciudadMadrid);
    }
}
