package homework.arrayutilnew;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        ArrayUtil au = new ArrayUtil();

        int[] result1 = {8, 12, 34, 55, 2, 5, 9, 7, 6, 22};

        au.print(result1);

//----------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("max արժեքը " + au.max(result1) + " է:");

//----------------------------------------------------------------------------------------------------------

        System.out.println("min արժեքը " + au.min(result1) + " է:");

//----------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.print("Զույգ թվերն են՝ ");
        au.even(result1);

//----------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.print("Կենտ թվերն են՝ ");
        au.odd(result1);

//----------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Զույգ թվերի քանակն է՝ " + au.number1(result1));
        System.out.println("Կենտ թվերի քանակն է՝ " + au.number2(result1));

//----------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Մասիվի միջին թվաբանականը " + au.average(result1) + " է:");

//----------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Մասիվի էլեմենտների գումարը " + au.sum(result1) + " է:");

//----------------------------------------------------------------------------------------------------------

        int[] result2 = {43, 55, 5, -9, 0, 12, 5, 65};

        au.decrease(result2);
        au.increase(result2);

//---------------------------------------------------------------------------------------------------------

        char[] result3 = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        au.space(result3);

//---------------------------------------------------------------------------------------------------------

        char[] result4 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        au.chars(result4);
        au.chars2(result4);

//---------------------------------------------------------------------------------------------------------

        char[] result5 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};

        au.chars3(result5);

//---------------------------------------------------------------------------------------------------------

        char[] result6 = {'b', 'a', 'b', 'o', 'l', 'a'};

        au.bobArray(result6);

//---------------------------------------------------------------------------------------------------------

        char[] result7 = {'b', 'a', 'զ', 'o', 'b', 'a'};

        au.bobArray2(result7);

//------------------------------------------------------------------------------------------------------

        char[] result8 = {' ', ' ', 'Բ', 'ա', 'ր', 'և', ' ', ' '};

        au.text(result8);

    }
}
