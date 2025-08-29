import java.util.Arrays;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Raheem","Shyam","Shivang");

//        filtering names starts with s

        System.out.println("Filterig the name starts with S");
        names.stream()
                .filter(name -> name.startsWith("S"))
                .forEach(System.out::println);

        System.out.println("Now filtering the name starts with R");
        names.stream()
                .filter(name-> name.startsWith("R"))
                .forEach(System.out::println);
    }
}
