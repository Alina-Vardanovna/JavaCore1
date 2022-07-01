package homework.javabook.chapter8.objectExample.clone;

public class C extends A {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new C();
    }
}
