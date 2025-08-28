import java.util.function.BiFunction;

public class Problem3 {
    public static void main(String[] args) {
//        Implement a BiFunction that takes a
//        String and an Integer and returns a Boolean indicating if the Integer is the length of the String.

        BiFunction<String,Integer,Boolean> checkLength = (name,lengthOfName) -> name.length()>=lengthOfName;

        boolean result = checkLength.apply("pradum",6);

        System.out.println("The length of password is greater than 6 : " +result);
    }
}
