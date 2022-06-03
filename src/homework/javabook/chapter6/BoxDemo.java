package homework.javabook.chapter6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BoxDemo {

    public static void main(String[] args) {
        Box box1 = new Box(10,20,40);

        double vol = box1.volume();
        System.out.println(vol * 2);

        Box box2 = new Box (4,2,3);

        System.out.println(box2.volume());

    }
}
