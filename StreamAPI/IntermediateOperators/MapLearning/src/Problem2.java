import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
//        Let us create a list of string where we store some names and calculate the length of the string

        List<String> names = Arrays.asList("Ramu","Shreya","Sohan","Shivang");

        names.stream()
                .map(name -> name.length())
                .forEach(System.out::println);
    }
}
