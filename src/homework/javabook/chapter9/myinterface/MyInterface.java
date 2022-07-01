package homework.javabook.chapter9.myinterface;

public interface MyInterface {

    String NAME = "Alina";

    void printHello();

    default void printKuKu() {
        System.out.println("k u k u");
    }

}
