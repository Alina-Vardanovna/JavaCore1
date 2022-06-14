package classwork.dynamicarray;

public class DynamicArray {

    int[] array = new int[10];
    int size = 0;

   public void add(int value) {
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

   public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

}