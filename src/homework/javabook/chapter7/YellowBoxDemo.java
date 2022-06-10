package homework.javabook.chapter7;

import homework.javabook.chapter6.Box;

public class YellowBoxDemo {

    public static void main(String[] args) {

        System.out.println(YellowBox.color);
        YellowBox.color = "yellow";
        System.out.println(YellowBox.color);

        YellowBox.meth();

    }
}
