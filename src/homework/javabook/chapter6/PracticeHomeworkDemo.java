package homework.javabook.chapter6;

public class PracticeHomeworkDemo {

    public static void main(String[] args) {

        PracticeHomework practiceHomework = new PracticeHomework();

        long convert = practiceHomework.convert(7);
        System.out.println(convert);

        System.out.println(practiceHomework.calcAge(4));

        System.out.println(practiceHomework.nextNumber(12));

        System.out.println(practiceHomework.isSameNum(6, 6));

        System.out.println(practiceHomework.lessThanOrEqualToZero(98));

        System.out.println(practiceHomework.reverseBool(true));

        int[] array1 = {4, 6, 25, 78};
        int[] array2 = {12, 4, 11, 4, 76, 14};
        System.out.println(practiceHomework.maxLength(array1, array2));

    }
}
