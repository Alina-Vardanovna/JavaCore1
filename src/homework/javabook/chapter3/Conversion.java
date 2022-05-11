package homework.javabook.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i;
        i = 257;
        double d;
        d = 323.142;

        System.out.println("int-ը վերածում ենք byte-ի");
        b = (byte) i;
        System.out.println("Ստացվում է" + " " + b);

        System.out.println('\n');

        System.out.println("double-ը դարձնում ենք int");
        i = (int) d;
        System.out.println("Ստացվում է" + " " + i);

        System.out.println('\n');

        System.out.println("double-ը դարձնում ենք byte");
        b = (byte) d;
        System.out.println("Ստացվում է" + " " + b);

        System.out.println('\n');

        byte m = 40;
        byte n = 50;
        byte h = 100;
        int k = m * n / h;
        System.out.println("k =" + " " + k);
        // Երբ թվային գործողություններ ենք անում byte-երի հետ, ստանում ենք int

    }
}
