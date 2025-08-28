import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        List<String> names = List.of("Pradum","Raja","Harsh","Shiva");
        List<String> finalName = names.stream()
                .map(name -> name.toUpperCase())
                .toList();

        System.out.println(finalName);
    }
}
