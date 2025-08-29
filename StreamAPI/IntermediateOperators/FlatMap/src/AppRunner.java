import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppRunner {
    public static void main(String[] args) {
//        flatmap is used to apply operation in nested array or nested list

        List<List<Integer>> salaryInThousands = Arrays.asList(
                Arrays.asList(10,11,12),
                Arrays.asList(13,14,15),
                Arrays.asList(17,18,19)
                );


        List<Integer> newSalary= salaryInThousands.stream()
                .flatMap(List::stream)
                .map(salary-> salary*2)
                .collect(Collectors.toList());


        System.out.println(newSalary);
    }
}
