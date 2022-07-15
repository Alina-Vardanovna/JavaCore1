package homework.javabook.chapter12.enumGender;

public class EnumTest {

    public static void main(String[] args) {

        Gender gender = Gender.FEMALE;
        System.out.println(gender);

        Gender[] values = Gender.values();
        for (Gender value : values) {
            System.out.println(value + " ");
        }

    }

}
