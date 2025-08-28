public class FIrstApp {
    public static void main(String[] args) {
//        stream API in java 8
        Runnable homework = () -> System.out.println("Doing homework.....");
        new Thread(homework).start();

    }
}
