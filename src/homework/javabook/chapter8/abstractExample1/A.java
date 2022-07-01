package homework.javabook.chapter8.abstractExample1;

public abstract class A {

    abstract void callMe();

    void callMeToo() {
        System.out.println("Սա կոնկրետ մեթոդ է, աբստրակտ չէ:");
    }

}
