package homework.javabook.chapter3.array;

public class ArrayExample2 {

    public static void main(String[] args) {

        // for-ի միջոցով կարող ենք և՛ արժեք տալ, և՛ տպել

        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            int x = i + 1;
            numbers[i] = x;
        }

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");

        }

    }
}
