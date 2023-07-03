import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dogs y funciones");

        Dog boi = new Dog("boi", 30, 6);
        Dog tyri = new Dog("tyri", 40, 12);
        Dog charis = new Dog("charis", 120, 7);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(boi);
        dogs.add(tyri);
        dogs.add(charis);

        Function<Dog, String> getName = dogs1 -> dogs1.getName();
        Function<String, Character> inicial = n -> n.charAt(0);
        dogs.forEach(n -> System.out.println(getName.apply(n)));

        dogs.forEach(n -> System.out.println(getName.andThen(inicial).apply(n)));
        dogs.forEach(n -> System.out.println(inicial.compose(getName).apply(n)));



    }
}
