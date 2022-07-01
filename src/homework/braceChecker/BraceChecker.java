package homework.braceChecker;


public class BraceChecker {

    private String text;
    private final Stack stack = new Stack();
    private final Stack stackForIndex = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        int pop;
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            char[] chars = text.toCharArray();
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    stackForIndex.push(i);
                    break;
                case ')':
                    pop = stack.pop();
                    stackForIndex.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error: closed " + c + " but nothing opened at " + i);
                    } else if (pop != '(') {
                        isValid = false;
                        System.err.println("Error: closed " + c + " but opened " + (char) pop + " at " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    stackForIndex.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error: closed " + c + " but nothing opened at " + i);
                    } else if (pop != ']') {
                        isValid = false;
                        System.err.println("Error: closed " + c + " but opened " + (char) pop + " at " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    stackForIndex.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error: closed " + c + " but nothing opened at " + i);
                    } else if (pop != '}') {
                        isValid = false;
                        System.err.println("Error: closed " + c + " but opened " + (char) pop + " at " + i);
                    }
                    break;
            }

        }

//        int last;
//        while ((last = stack.pop()) != 0) {
//            System.err.println("Error: opened " + (char) last + " but nothing closed");
//        }
//        Կա նաև այսպիսի գրելաձև:

        while (!stack.isEmpty()) {
            isValid = false;
            System.err.println("Error: opened " + (char) stack.pop() + " but nothing closed at " + stackForIndex.pop());
        }
        if (isValid) {
            System.out.println("Ամեն ինչ ճիշտ է:");
        }

    }

}
