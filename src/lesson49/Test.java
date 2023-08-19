package lesson49;

public class Test {
    public static void main(String[] args) {
        counter(3);
        System.out.println(factorial(3));
    }

    private static void counter(int n) {
        if (n == 0)
            return;

        System.out.println(n);

        counter(n - 1);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
