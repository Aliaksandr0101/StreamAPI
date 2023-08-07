public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {System.out.println("Hello word");};
        runnable.run();

        Operation operation = (int x, int y) -> {
            System.out.println(x + y);
        };
        operation.calculate(10,20);
    }
}
