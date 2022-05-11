package homework.javabook.chapter3.array;

public class Average {

    public static void main(String[] args) {

        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double x = 0;
        // Գրքի մեջ x-ի փոխարեն result էր գրված
        for (int i = 0; i < numbers.length; i++) {
        x = x + numbers[i];
        }

        System.out.println("Տրված շարքի միջին թվաբանականը" + " " + x/5 + " " + "է");

    }

}
