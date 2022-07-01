package homework.javabook.chapter9.embeddedinterface;

public class NestedIFDemo {

    public static void main(String[] args) {

        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("10-ը բացասական թիվ չէ:");
        if (nif.isNotNegative(-12))
            System.out.println("Սա չի տպվի::");

    }

}
