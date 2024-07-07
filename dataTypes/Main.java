package dataTypes;

public class Main {
    public static void main(String[] args) {
        int a = 49; // range: 2^-31 to 2^31, 32 bit
        short b = 33; // range: 2^-15 to 2^15, 16 bit
        long c = 999; // range: 2^-63 to 2^63, 64 bit
        System.out.println(a+" "+b+" "+c);

        float f = 1.2f; // 7 digits for float
        double g = 12.23; // 16 digits for decimals
        System.out.println(f+" "+g);

        char h = 'a';
        System.out.println(h+" "+(h+2));

        boolean t = true;
        System.out.println(t);

        byte x = 8; // range: 2^-7 to 2^7, 8 bit
        System.out.println(x);
    }
}
