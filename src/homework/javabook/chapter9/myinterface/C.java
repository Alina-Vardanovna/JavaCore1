package homework.javabook.chapter9.myinterface;

public class C implements MyInterface {

    C() {
        printHello();
    }

    @Override
    public void printHello() {
        System.out.println("Hello");
    }

}
