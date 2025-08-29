import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {

        List<Integer> prices = Arrays.asList(241,259,399,459,659,152,9945,987,159);

        prices.stream()
                .filter(price -> price>300)
                .sorted()
                .forEach(System.out::println);
    }
}
