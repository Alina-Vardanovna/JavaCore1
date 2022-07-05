package homework.javabook.chapter10;

public class Exc2 {

    public static void main(String[] args) {

        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Սա չի տպվի:");
        } catch (ArithmeticException e) {
            System.out.println("Թիվը չի բաժանվում 0-ի");
        }

        System.out.println("catch օպերատորից հետո:");

    }

}
