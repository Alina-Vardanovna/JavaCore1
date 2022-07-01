package homework.javabook.chapter8;

public class ABTest {

    public static void main(String[] args) {

//        A a = new B();  Կարող ենք գրել նաև այսպես

        B b = new B(5);
        b.showB();
        A a = b;
        b.a = 6;
        System.out.println(a.a);

    }
}
