package homework.javabook.chapter3;

public class CharDemo {
    public static void main(String[] args) {
        char ch1, ch2;
        ch1 = 88;
        ch2 = 'Y';
        System.out.println(ch1 + " " + ch2);

        ch2++;
        System.out.println("Այս անգամ ունենք" + " " + ch2);

        char f = '\'';
        System.out.println(f);
        // Մի հատ չակերթ է դնում

        char d = '\"';
        System.out.println(d);
        // Երկու չակերթ է դնում
        System.out.println(d + "Սա չակերթի մեջ է" + d);
        // Կարող ենք գրել այսպես, կամ ներքևի գրածս տարբերակով
        System.out.println("\"Սա չակերթի մեջ է\"");

        char s = '\\';
        System.out.println(s);
        // Մի հատ \ է դնում

        char h = '\r';
        System.out.println(h);
        // Նոր տող տանելու համար է

        char n = '\n';
        System.out.println(n);
        // Նոր տող է տանում

    }
}
