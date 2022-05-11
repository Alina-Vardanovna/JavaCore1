package homework.javabook.chapter3.array;

public class ArrayExample {

    public static void main(String[] args) {

//        int[] numbers = new int[9]; Հայտարարման ձև է:

//        numbers[0] = 85;
//        numbers[3] = 53;
//        numbers[2] = 98;

        // System.out.println("numbers[3] =" + " " + numbers[3]); Այս ձևով կտպի numbers[3] = 53

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " "); Այսպես ենք անում, եթե ուզում ենք, որ բոլորը տպի

        // System.out.println(numbers.length); // Ցույց է տալիս, թե քանի դարակ ունենք

        int[] numbers = {90, 4, -34, 56, -78, 9, 6, 43, 3, 0};

//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }

        int i = numbers.length - 1;
        System.out.println(numbers[i]); //Այս ձևով տպեցինք վերջին թիվը
//        System.out.println(numbers[numbers.length - 1]);  Կարող ենք գրել նաև այսպես


    }
}
