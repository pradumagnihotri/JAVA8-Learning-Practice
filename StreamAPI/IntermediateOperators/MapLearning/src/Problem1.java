import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
//        Let us create a list of string where we store the name

        List<String> names = Arrays.asList("Mohan","Naman","Sabita","Pransu");
        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }
}
