import java.util.Arrays;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,11,12,13,14,15,16,17,18,19,20);

        numbers.stream().forEach(System.out::println);
    }
}
