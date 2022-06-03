package homework.javabook.chapter6.figure;

public class FigurePainter {

    char c = '❤';

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    void figure1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }


    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    void figure2(int m) {
        for (int i = m; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }


    /*
              *
            * *
          * * *
        * * * *
      * * * * *
     */
    void figure3() {
        for (int i = 0; i < 5; i++) {

            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }


}

