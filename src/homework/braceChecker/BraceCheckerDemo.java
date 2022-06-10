package homework.braceChecker;

public class BraceCheckerDemo {

    public static void main(String[] args) {

        String text = "Hello (Java}(my book";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }
}
