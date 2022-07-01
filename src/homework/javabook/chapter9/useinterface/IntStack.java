package homework.javabook.chapter9.useinterface;

public interface IntStack {

    void push(int item);

    int pop();

    default void clear() {
        System.out.println("clear() մեթոդը իրականացված չէ:");
    }

}
