package homework.dynamicarray;

public class DynamicArray {

    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = value;
    }

    private void increaseArray() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getByIndex(int i) {
        return i >= 0 && array[i] != 0 ? array[i] : 0;
    }

    int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    void set(int index, int value) {
        if (index >= 0) {
            array[index] = value;
        }
    }

    void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("inv");
        } else {
            if (size == array.length) {
                increaseArray();
            }
            for (int i = size; i >= index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            size++;
        }
    }
}


