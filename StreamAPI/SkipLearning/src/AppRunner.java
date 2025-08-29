import java.util.Arrays;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
//        let us learn the skip()

//        skip() is the intermediate operation which skips the number of the date from the starting of the list as per the value given

        List<Integer> numbers = Arrays.asList(12,13,14,15,16,17,18);

        numbers.stream().skip(2).forEach(System.out::println);
    }
}
