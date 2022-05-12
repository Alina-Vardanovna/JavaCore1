package homework.javabook.chapter3;

public class FigurePainter2 {

    public static void main(String[] args) {


        /**
         *  Գրել կոդ, որը կպատկերի այս եռանկյունը:
         *
         *       * * * *
         *         * * *
         *           * *
         *             *
         *
         * */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 3; k >= i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }

        /**
         *  Գրել կոդ, որը կպատկերի այս շեղանկյունը:
         *
         *             *
         *            * *
         *           * * *
         *          * * * *
         *           * * *
         *            * *
         *             *
         *
         * */

        for (int i = 0; i < 5; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int j = 3; j >= 0; j--) {
            for (int k = 4; k >= j; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= j; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
