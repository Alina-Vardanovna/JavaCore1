package homework.javabook.chapter9.embeddedinterface;

public class B implements A.NestedIF {

    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }

}
