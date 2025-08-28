import java.util.Scanner;
import java.util.function.BiFunction;

public class Problem1 {
    public static void main(String[] args) {
//        Write a lambda expression for a BiFunction that takes two Integers and returns their sum.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the num1 : ");
//        int num1;
//        num1 = sc.nextInt();
//        System.out.print("Enter the num2 : ");
//        int num2 = sc.nextInt();

        BiFunction<Integer,Integer,Integer> addTwoNumbers =(number1,number2 )  -> number1+number2;

        System.out.println(addTwoNumbers.apply(125,125));
    }
}
