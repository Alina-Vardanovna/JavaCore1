package homework.javabook.chapter9.bookinterface;

public class AnotherClient implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("callback() մեթոդի ևս մեկ տարբերակ");
        System.out.println("p-ի քառակուսին կլինի " + (p * p));
    }

}
