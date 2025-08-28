import java.util.Scanner;
import java.util.function.Function;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String name = sc.nextLine();

        Function<String, Integer> stringLength = yourName -> yourName.length();

        System.out.println(stringLength.apply(name));
    }
}
