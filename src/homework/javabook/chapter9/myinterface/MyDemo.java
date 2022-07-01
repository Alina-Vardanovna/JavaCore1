package homework.javabook.chapter9.myinterface;

public class MyDemo {

    public static void main(String[] args) {

        System.out.println(MyInterface.NAME);

        A a = new A();
        a.printAName();
        B b = new B();
        C c = new C();
        printHello5Times(a);
        printHello5Times(b);
        c.printKuKu();

    }

    static void printHello5Times(MyInterface myInterface) {
        for (int i = 0; i < 5; i++) {
            myInterface.printHello();
        }
    }
}
