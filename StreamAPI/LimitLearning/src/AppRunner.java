import java.util.Arrays;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
//        Let us learn the limits() which is used to put a limit while
//        operating the integer or any other types of data collection

        List<String> employee = Arrays.asList("Amit","Rahul","Ravi");

        employee.stream().limit(3).forEach(System.out::println);
    }
}
