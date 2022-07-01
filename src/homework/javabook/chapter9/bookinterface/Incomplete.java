package homework.javabook.chapter9.bookinterface;

public abstract class Incomplete implements Callback {

    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }

}
