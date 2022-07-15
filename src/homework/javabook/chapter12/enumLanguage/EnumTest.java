package homework.javabook.chapter12.enumLanguage;

import homework.books.ourEnum.Gender;
import sun.security.rsa.RSAUtil;

public class EnumTest {

    public static void main(String[] args) {

        Language language = Language.CH;
        System.out.println(language);

        switch (language) {
            case EN:
                System.out.println("Hello");
                break;
            case RU:
                System.out.println("Привет");
                break;
            case HY:
                System.out.println("Բարև");
                break;
            default:
                System.out.println("Hola");
        }

        System.out.println("Please input language!");
        Language values [] = Language.values();
        for (Language value : values) {
            System.out.print(value + " ");
        }
        
    }

}
