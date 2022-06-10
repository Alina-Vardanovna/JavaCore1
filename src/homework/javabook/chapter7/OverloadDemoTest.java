package homework.javabook.chapter7;

public class OverloadDemoTest {

    public static void main(String[] args) {

        OverloadDemo overloadDemo = new OverloadDemo();

        overloadDemo.test("Hello");
        overloadDemo.test("hi", 5);

    }
}
