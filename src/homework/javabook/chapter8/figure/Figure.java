package homework.javabook.chapter8.figure;

public class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Պատկերի մակերեսը որոշված չէ:");
        return 0;
    }
}
