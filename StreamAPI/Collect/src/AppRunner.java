import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppRunner {
    public static void main(String[] args) {
//        Let us learn the collect()

        List<String> names = Arrays.asList("Ram","Aman","Shiva","Shreya");

        List<String> result = names.stream()
                                    .filter(name-> name.startsWith("S"))
                                    .collect(Collectors.toList());
        System.out.println(result);
    }
}
