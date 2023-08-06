package Lesson30;

public class Test {
    public static void main(String[] args) {
        long l = 142132455L;

        int a = 123;

        long b = a; //неявное
        int x = (int) b; //явное
        System.out.println(x);

        float f = 123.2f;
        float f1 = (float) 123.1;

        double r = 123.6;
        int y = (int) r;

        System.out.println(y);

        long v = Math.round(r);
        System.out.println(v);

        byte u = (byte) 128;
        System.out.println(u);
    }
}
