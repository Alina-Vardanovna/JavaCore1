package homework.arrayutil;

public class ArraySort {

    public static void main(String[] args) {

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};

        System.out.print("Մասիվը նվազման կարգով՝ ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int a = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = a;
                }
            }
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.print("Մասիվը աճման կարգով՝ ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (numbers[j] < numbers[j + 1]) {
                    int a = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = a;
                }
            }
            System.out.print(numbers[i] + " ");
        }

    }

}



