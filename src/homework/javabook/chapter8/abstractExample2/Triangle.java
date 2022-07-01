package homework.javabook.chapter8.abstractExample2;

public class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Եռանկյան համար:");
        return dim1 * dim2 / 2;
    }

}
