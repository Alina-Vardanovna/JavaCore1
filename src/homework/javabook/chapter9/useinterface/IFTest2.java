package homework.javabook.chapter9.useinterface;

public class IFTest2 {

    public static void main(String args[]) {
        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        for (int i = 0; i < 12; i++) myStack1.push(i);
        for (int i = 0; i < 20; i++) myStack2.push(i);

        System.out.print("myStack1-ի stack-ը՝ ");
        for (int i = 0; i < 12; i++) {
            System.out.print(myStack1.pop() + " ");
        }

        System.out.println();
        System.out.print("myStack2-ի stack-ը՝ ");
        for (int i = 0; i < 20; i++) {
            System.out.print(myStack2.pop() + " ");
        }
    }

}