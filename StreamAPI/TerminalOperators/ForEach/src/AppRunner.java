import java.util.Arrays;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
//      let us learn all the terminal operations

        List<String> names = Arrays.asList("Hello","Hi","Namaste");

        names.stream()
                .forEach(name -> System.out.println("Name: "+name));



    }
}
