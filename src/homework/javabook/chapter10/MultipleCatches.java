package homework.javabook.chapter10;

public class MultipleCatches {

    public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Թիվը 0-ի չի բաժանվում: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ինդեքսավորման սխալ մասիվի սահմաններից դուրս: " + e);
        }

        System.out.println("try / catch օպերատորների բլոկից հետո:");

    }

}
