package homework.javabook.chapter3;

public class FigureExample {

    public static void main(String[] args) {

        /*
         *-ով սարքել այս տեսքի եռանկյուն
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        /*
         *-ով սարքել այս տեսքի եռանկյուն
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /*
         *-ով սարքել այս տեսքի եռանկյուն
                 *
               * *
             * * *
           * * * *
         * * * * *
         */

        for (int i = 0; i < 5; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

