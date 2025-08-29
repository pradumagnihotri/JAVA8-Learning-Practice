import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {

        List<Integer> idNumbers = Arrays.asList(9857,5468,2459,9585,3125);

        idNumbers.stream()
                .filter(idNumber -> idNumber>3500)
                .count();

        System.out.println();
    }
}
