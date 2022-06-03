package homework.arrayutilnew;

public class ArrayUtil {

    public void print(int[] array) {

        System.out.print("Մասիվի բոլոր էլեմենտներն են՝ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //----------------------------------------------------------------------------------------------------------

    public int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //----------------------------------------------------------------------------------------------------------

    public int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //----------------------------------------------------------------------------------------------------------

    public void even(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            if (x % 2 == 0)
                System.out.print(x + " ");
        }
    }

    //----------------------------------------------------------------------------------------------------------

    public void odd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    //----------------------------------------------------------------------------------------------------------

    public int number1(int[] array) {
        int n;
        n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                n = n + 1;
            }
        }
        return (n);
    }

    //----------------------------------------------------------------------------------------------------------

    public int number2(int[] array) {
        int m;
        m = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                m = m + 1;
            }
        }
        return (m);
    }

    //----------------------------------------------------------------------------------------------------------

    public double average(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i] / array.length;
        }
        return (average);
    }

    //----------------------------------------------------------------------------------------------------------

    public double sum(int[] array) {
        int sum = 0;
        for (int i = 0;
             i < array.length; i++) {
            sum += array[i];
        }
        return (sum);
    }

    //----------------------------------------------------------------------------------------------------------

    public void decrease(int[] numbers) {

        System.out.println();
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
    }

    //---------------------------------------------------------------------------------------------------------

    public void increase(int[] numbers) {
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

    //---------------------------------------------------------------------------------------------------------

    public void space(char[] spaceArray) {

        System.out.println();
        char c = ' ';
        int startIndex = 0;
        int lastIndex = spaceArray.length - 1;

        while (startIndex < lastIndex && spaceArray[startIndex] == c) {
            startIndex++;
        }
        while (startIndex < lastIndex && spaceArray[lastIndex] == c) {
            lastIndex--;
        }

        char[] result = new char[(lastIndex - startIndex) + 1];

        int index = 0;
        for (int i = startIndex; i <= lastIndex; i++) {

            result[index++] = spaceArray[i];
        }

        System.out.println(result);
        System.out.println();
    }

    //---------------------------------------------------------------------------------------------------

    public void chars(char[] chars) {
        char c = 'o';
        int n = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                n++;
            }
        }
        System.out.println("Մասիվում 'o'-ից ունենք " + n + " հատ");
        System.out.println();
    }

    //--------------------------------------------------------------------------------------------------

    public void chars2(char[] chars2) {
        char a = chars2[chars2.length / 2 - 1];
        char b = chars2[chars2.length / 2];
        System.out.println("Մասիվի մեջտեղի երկու էլեմենտներն են՝ " + a + "," + b);
    }

    //--------------------------------------------------------------------------------------------------

    public void chars3(char[] chars3) {
        System.out.println();

        boolean isLy = false;
        char optL = chars3[chars3.length - 2];
        char optY = chars3[chars3.length - 1];
        if (optL == 'l' && optY == 'y') {
            isLy = true;
        }
        System.out.println(isLy);
    }

    //-----------------------------------------------------------------------------------------------

    public void bobArray(char[] bobArray) {
        System.out.println();
        boolean isBob = false;
        char x = 'b';
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == x && bobArray[i] + 2 == x) ;
            isBob = true;
        }
        System.out.println(isBob);
    }

    //-----------------------------------------------------------------------------------------------

    public void bobArray2(char[] bobArray2) {
        System.out.println();
        boolean isBob2 = false;
        char y = 'b';
        for (int i = 0; i < bobArray2.length - 2; i++) {
            if (bobArray2[i] == y && bobArray2[i + 2] == y) {
                isBob2 = true;
            }
        }
        System.out.println(isBob2);
    }

    //-----------------------------------------------------------------------------------------------

    public void text(char[] text) {
        System.out.println();
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
        System.out.println();
    }


}

