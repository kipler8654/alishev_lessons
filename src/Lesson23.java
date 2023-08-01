public class Lesson23 {
    public static void main(String[] args) {
        String x = "hello";
        x = x.toUpperCase();
        System.out.println(x);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());

        System.out.printf("This is a string, %d, %S", 2, "nice");

        System.out.printf("String %10d \n", 15);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 1222);
        System.out.printf("String %10d \n", 1111111111);
        System.out.printf("String %10d \n", 1);

        System.out.println();

        System.out.printf("String %.2f \n", 5.2352454);
        System.out.printf("String %.2f \n", 5.24367876);
        System.out.printf("String %.2f \n", 5.24);
        System.out.printf("String %.2f \n", 5.2568);
        System.out.printf("String %.2f \n", 5.289);
    }
}
