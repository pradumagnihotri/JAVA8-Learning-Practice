import java.util.function.BiFunction;

public class Problem2 {
    public static void main(String[] args) {
//        Create a BiFunction that takes two Strings and returns a new String that is the concatenation of the two.

        BiFunction<String, String, String> concatinate = (str1, str2) -> str1 + str2;

        System.out.println(concatinate.apply("lanos","institute"));
    }
}
