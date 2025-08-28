import java.util.Scanner;
import java.util.function.Function;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String stringValue = sc.nextLine();

        Function<String,String > toUpperCaseString = yourString -> yourString.toUpperCase();

        System.out.println(toUpperCaseString.apply(stringValue));
    }
}
