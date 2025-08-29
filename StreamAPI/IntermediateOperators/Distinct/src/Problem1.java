import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
//        Let us create a list of names and use the distinct() to neglect multiple values

        List<String> namesOfStudents = Arrays.asList("Aman","Rakesh","Sunita","Anupam","Aman","Anupam","Rohit","Suresh");

        namesOfStudents.stream().distinct().sorted().forEach(System.out::println);
    }
}
