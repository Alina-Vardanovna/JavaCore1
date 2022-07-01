package homework.javabook.chapter8.abstractExample2;

public class AbstractAreas {

    public static void main(String[] args) {

//      Figure f = new Figure(10, 10); Նման բան արդեն չենք կարող անել
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Մակերեսը = է " + figref.area());
        figref = t;
        System.out.println("Մակերեսը = է " + figref.area());

    }
}
