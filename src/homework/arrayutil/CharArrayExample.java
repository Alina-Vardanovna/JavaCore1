package homework.arrayutil;

import sun.security.rsa.RSAUtil;

public class CharArrayExample {

    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int n = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                n++;
            }
        }
        System.out.println("Մասիվում 'o'-ից ունենք " + n + " հատ");

        //-----------------------------------------------------------------------------------------------

        System.out.println();
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char a = chars2[chars2.length / 2 - 1];
        char b = chars2[chars2.length / 2];
        System.out.println("Մասիվի մեջտեղի երկու էլեմենտներն են՝ " + a + "," + b);

        //-----------------------------------------------------------------------------------------------

        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};

        boolean isLy = false;
        char optL = chars3[chars3.length - 2];
        char optY = chars3[chars3.length - 1];
        if (optL == 'l' && optY == 'y') {
            isLy = true;
        }
        System.out.println(isLy);

        //-----------------------------------------------------------------------------------------------

        System.out.println();
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean isBob = false;
        char x = 'b';
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == x && bobArray[i] + 2 == x) ;
            isBob = true;
        }
        System.out.println(isBob);

        //-----------------------------------------------------------------------------------------------

        System.out.println();
        char[] bobArray2 = {'b', 'a', 'զ', 'o', 'b', 'a'};
        boolean isBob2 = false;
        char y = 'b';
        for (int i = 0; i < bobArray2.length - 2; i++) {
            if (bobArray2[i] == y && bobArray2[i + 2] == y) {
                isBob2 = true;
            }
        }
        System.out.println(isBob2);


        //-----------------------------------------------------------------------------------------------

        System.out.println();
        char[] text = {' ', ' ', 'Բ', 'ա', 'ր', 'և', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
        System.out.println();
    }
}
