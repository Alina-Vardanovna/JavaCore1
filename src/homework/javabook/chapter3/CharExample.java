package homework.javabook.chapter3;

public class CharExample {
    public static void main(String[] args) {
        char a, b;
        a = '(';
        b = ')';
        System.out.println(a + "Բարև Ալինա" + b);

        int c = '*';
        System.out.println(c);

        System.out.println(a + 3 + 5 + b);

        /*
        Գումարումը մեր char-ը դարձրեց int, այդ պատճառով run անելուց
        հետո ստացանք a-ի թվային արժեք + 8 + b-ի թվային արժեք
         */
    }
}
