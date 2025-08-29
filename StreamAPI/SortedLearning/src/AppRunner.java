import java.util.Arrays;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
//        Let us create a list of random numbers and use the sort() to write the numbers in increasing order

        List<Integer> numbers = Arrays.asList(12,11,15,16,13,14,17);

        numbers.stream().sorted().forEach(System.out::println);


    }
}
