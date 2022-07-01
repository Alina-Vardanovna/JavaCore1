package homework.javabook.chapter8.objectExample.box;

public class BoxDemo {

    public static void main(String[] args) {

        Box myBox1 = new Box(4, 5, 6);
        Box myBox3 = myBox1;
        Box myBox2 = new Box(4, 5, 6);
        boolean result = myBox1.equals(myBox2);
        boolean result2 = myBox1.equals(myBox3);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(myBox1);
    }
}
