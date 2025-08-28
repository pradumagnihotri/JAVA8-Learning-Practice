import java.util.function.Function;

public class Problem5 {
    public static void main(String[] args) {
//        Create a Function that takes a String and returns the String with all whitespace removed.

        Function<String, String> toRemoveSpace = yourString -> yourString.replaceAll("\\s+","");

        System.out.println(toRemoveSpace.apply("hey there i am here"));
    }
}
