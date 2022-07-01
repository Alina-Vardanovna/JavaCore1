package homework.javabook.chapter9.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("кoнcтpyктop подкласса");
        System.out.println("n = " + n);
//      System.out.println("n_pri = " + n_pri); Հասանելի է միայն կլասի համար:
        System.out.println("n_pro " + n_pro);
        System.out.println("n_pub " + n_pub);

    }
}