import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,11,12,13,14,15,16);

        numbers.stream().skip(4).limit(3).forEach(System.out::println);
    }
}
