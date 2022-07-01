package homework.javabook.chapter9.p2;

import homework.javabook.chapter9.p1.Protection;

public class Protection2 extends Protection {

    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета");

//      System.out.println("п = " + n);
//      System.out.println("n_pri "+ n_pri);

        System.out.println("n_pro " + n_pro);
        System.out.println("n_pub " + n_pub);
    }
}
