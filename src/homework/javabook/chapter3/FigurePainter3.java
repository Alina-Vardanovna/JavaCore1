package homework.javabook.chapter3;

public class FigurePainter3 {

    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {

            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("  ❤");
            }
            System.out.print(" ");
            for (int j = 3; j > i; j--) {
                System.out.print("   ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("❤  ");
            }
            System.out.println();
        }

        System.out.print("    ❤  ❤  ❤  ❤  IT SPACE  ❤");

        System.out.println();

        for (int j = 6; j >= 0; j--) {
            for (int k = 8; k >= j; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= j; k++) {
                System.out.print("  ❤");
            }
            System.out.println();
        }

    }
}
