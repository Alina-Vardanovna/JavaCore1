package classwork.calculator;

public class CalculatorDemo {

    public static void main(String[] args) {


        Calculator calc = new Calculator();


        double sum = calc.plus(30, 3);
        System.out.println(sum);
        double dec = calc.minus(30, 3);
        System.out.println(dec);

        System.out.println(calc.multiple(30, 3));
        System.out.println(calc.divide(30, 3));


    }
}
