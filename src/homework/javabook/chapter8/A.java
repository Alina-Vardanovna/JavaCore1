package homework.javabook.chapter8;

public class A {
    public int a;
    private int b;

    A(int b) {
        this.b = b;
    }

    void meth1() {
        System.out.println("I'm meth1() from A");
    }

    void showB() {
        System.out.println(b);
    }

}
