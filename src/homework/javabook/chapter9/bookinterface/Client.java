package homework.javabook.chapter9.bookinterface;

public class Client implements Callback {

    public void callback(int p) {
        System.out.println("callback() մեթոդը կանչվում է " + p + " արժեքով:");
    }

    void nonIFaceMeth() {
        System.out.println("ինտերֆեյսի իրականացնող կլասները կարող են ունենալ նաև սեփական մեթոդները:");
    }

}
