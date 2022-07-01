package homework.javabook.chapter8;

public class B extends A {

    public int k;

    B(int b) {
        super(b);
    }

    public void showVar() {
        System.out.println(a);
        showB();
        System.out.println(k);
    }

}
