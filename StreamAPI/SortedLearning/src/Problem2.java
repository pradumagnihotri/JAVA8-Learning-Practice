import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
//        Let us create a list of integers and sort it
//        in reverse order to show that lambda expression are how helpful to do the various tasks in java

        List<Integer> numbers = Arrays.asList(12,15,17,18,19,21,54,65,45,25,154,74);

        numbers.stream().sorted((num1,num2)-> num2-num1).forEach(System.out::println);
    }
}