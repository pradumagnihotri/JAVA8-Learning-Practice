import java.util.Arrays;
import java.util.List;

// filtering integer

public class Project3 {
    public static void main(String[] args) {
//        filter the element using filter()
        List<Integer> numbers = Arrays.asList(10,15,9,45,55,13);

//        Filter even numbers
        System.out.println("Printing even numbers.");
        numbers.stream()
                .filter(number -> number%2 ==0)
                .forEach(System.out::println);
        System.out.println("Printing Odd numbers.");

        numbers.stream()
                .filter(number -> number%2!=0)
                .forEach(System.out::println);
    }
}
