package homework.javabook.chapter8.abstractExample2;

public class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Քառանկյան համար:");
        return dim1 * dim2;
    }

}
