public class Break_Continue {
    public static void main(String[] args) {
        int j = 0;
        while (true) {
            if (j == 15) {
                break;
            }
            System.out.println(j);
            j++;
        }
        System.out.println();
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Это нечетное число " + i);
        }
    }
}