import java.util.function.BiFunction;

public class Problem4 {
    public static void main(String[] args) {
//        Write a BiFunction that takes a Double and a Double and returns the larger of the two.


        BiFunction<Double,Double,Double> checkGreatest = (num1, num2) -> (num1>num2)?num1:num2;

        System.out.println("Larger number is : "+checkGreatest.apply(445.25,65.25));
    }
}
