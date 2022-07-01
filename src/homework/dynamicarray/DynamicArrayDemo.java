package homework.dynamicarray;

import classwork.dynamicarray.DynamicArray;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        homework.dynamicarray.DynamicArray array = new homework.dynamicarray.DynamicArray();
        array.add(8);
        array.add(8);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(55);
        array.add(78);
        array.add(99);
        array.add(0);
        array.add(12);
        array.add(32);
        array.add(4);
        array.print();
        array.set(1,96);
        array.print();
        array.add(1,999);
        array.print();

    }
}
