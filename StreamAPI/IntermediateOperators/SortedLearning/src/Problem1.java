import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
//        Learning the sort() to print the values in proper order

        List<String> names = Arrays.asList("Sohan","Aman","Babita","Chaman");

        names.stream().sorted().forEach(System.out::println);

    }
}
