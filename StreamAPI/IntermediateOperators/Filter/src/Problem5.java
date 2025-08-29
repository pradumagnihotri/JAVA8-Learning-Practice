import java.util.Arrays;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
//        using filter and using multiple conditions

        List<Integer> numbers = Arrays.asList(25,65,75,20,15,46,78);

//        number divisible by 5 and greater than 14

        System.out.println("Printing the numbers which are greater than 14 and also divisible by 5");
        numbers.stream()
                .filter(number -> number%5 ==0 && number>14)
                .forEach(System.out::println);
    }
}
