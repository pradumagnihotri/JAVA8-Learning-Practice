import java.util.List;

public class Problem1{
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        List<Integer> finalNumbers = numbers.stream()
                .map(number -> number*number)
                .toList();

        System.out.println(finalNumbers);
    }
}