package part01.chapter03;

/*
 * Promotion
 * byte, short, char values are promoted to int
 * One of operands if long, float, double -> Promoted to long, float, double
 */
public class Promote {

    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }

}
