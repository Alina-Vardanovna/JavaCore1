package homework.javabook.chapter10;

public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException {
        System.out.println("throwOne() մեթոդի մարմնում:");
        throw new IllegalAccessException("Դեմոնստրացա");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Բռնված է բացառությունը");
        }
    }

}
