import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

//        Created a list for storing some integer values
        List<Integer> numbers = Arrays.asList(2,45,7,87,45,84,57,65,25,10);

//        now implemented the logic of adding 10 in all numbers using the map()

        numbers.stream()
                .map(number-> number+=10)
                .forEach(System.out::println);

    }
}
