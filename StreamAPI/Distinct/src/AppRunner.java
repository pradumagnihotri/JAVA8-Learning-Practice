import java.util.Arrays;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
//        Let us learn the distinct intermediate operation which helps to remove duplicate objects from the list

        List<Integer> numbers = Arrays.asList(12,15,17,19,13,12,15,12,14,15,43,13,12,15,17,19,18,156);


        numbers.stream().distinct().sorted().forEach(System.out::println);
    }
}
