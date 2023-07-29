public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i += 5) {       //i++ == i = i + 1
            System.out.println("Hello " + i);
        }
        System.out.println();
        for (int i = 10; i >= 0; i -= 5) {
            System.out.println("Hello " + i);
        }
    }
}