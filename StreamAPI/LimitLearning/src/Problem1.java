import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
//        use of filter and limit

        List<Integer> numbers = Arrays.asList(12,15,45,14,12,15,45,78,45,95);

        numbers.stream().filter(number->number%5==0 && number>25).sorted().limit(5).forEach(System.out::println);
    }
}
