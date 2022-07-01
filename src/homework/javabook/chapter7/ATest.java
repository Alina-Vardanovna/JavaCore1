package homework.javabook.chapter7;

public class ATest {
    public static void main(String[] args) {

        A.B b = new A.B(); // այսպես կարող ենք անել միայն եթե B static ենք դրել:
        System.out.println(b.x);

    }
}
