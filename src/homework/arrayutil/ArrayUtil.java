package homework.arrayutil;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {8, 12, 34, 55, 2, 5, 9, 7, 6, 22};

        System.out.print("Մասիվի բոլոր էլեմենտներն են՝ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //-----------------------------------------------------------------------------------------------

        int max = array[3];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("max արժեքը " + max + " է:");

        //-----------------------------------------------------------------------------------------------

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min արժեքը " + min + " է:");

        //-----------------------------------------------------------------------------------------------

        System.out.println();
        System.out.print("Զույգ թվերն են՝ ");

        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }

        //-----------------------------------------------------------------------------------------------

        System.out.println();
        System.out.print("Կենտ թվերն են՝ ");
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        //-----------------------------------------------------------------------------------------------

        int n, m;
        n = m = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                n = n + 1;
            }
            if (array[i] % 2 != 0) {
                m = m + 1;
            }
        }
        System.out.println();
        System.out.println("Զույգ թվերի քանակն է՝ " + n);
        System.out.println("Կենտ թվերի քանակն է՝ " + m);

        //-----------------------------------------------------------------------------------------------

        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i] / array.length;
        }
        System.out.println();
        System.out.println("Մեր շարքի միջին թվաբանականը " + average + " է:");

        //-----------------------------------------------------------------------------------------------

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println();
        System.out.println("Մեր շարքի էլեմենտների գումարը " + sum + " է:");

    }
}




