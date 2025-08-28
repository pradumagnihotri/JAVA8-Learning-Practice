import java.util.Scanner;
import java.util.function.Function;

public class Problem1 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double num1 = sc.nextDouble();

        Function <Double , Double> findingSquare = number -> number*number;

        System.out.println(findingSquare.apply(num1));

    }
}
