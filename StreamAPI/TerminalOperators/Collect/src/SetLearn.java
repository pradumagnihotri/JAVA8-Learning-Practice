import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetLearn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,25,1,25,45,15,45,15,78,87,78,87,25,24,25,24);

        Set<Integer> unique = numbers.stream().collect(Collectors.toSet());

        System.out.println(unique);
    }
}
