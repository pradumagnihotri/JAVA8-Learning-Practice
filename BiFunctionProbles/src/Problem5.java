import java.util.Scanner;
import java.util.function.BiFunction;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Taking character input
        System.out.print("Enter a character to count: ");
        char ch = sc.next().charAt(0);

        // BiFunction to count occurrences
        BiFunction<String, Character, Integer> countChar = (str, c) -> {
            int count = 0;
            for (char x : str.toCharArray()) {
                if (x == c) {
                    count++;
                }
            }
            return count;
        };

        // Directly calling apply()
        System.out.println("Count of '" + ch + "' in the string: " + countChar.apply(input, ch));
    }
}
