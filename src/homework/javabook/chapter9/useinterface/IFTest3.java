package homework.javabook.chapter9.useinterface;

import sun.font.FontRunIterator;

public class IFTest3 {

    public static void main(String[] args) {

        IntStack myStack;

        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;
        for (int i = 0; i < 12; i++) {
            myStack.push(i);
        }

        myStack = fs;
        for (int i = 0; i < 8; i++) {
            myStack.push(i);
        }

        myStack = ds;
        System.out.print("Արժեքը դինամիկ stack-ում՝ ");
        for (int i = 0; i < 12; i++) {
            System.out.print(myStack.pop());
        }

        System.out.println();
        myStack = fs;
        System.out.print("Արժեքը ֆիքսված stack-ում՝ ");
        for (int i = 0; i < 8; i++) {
            System.out.print(myStack.pop() + " ");
        }

    }
}
