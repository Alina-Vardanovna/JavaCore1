package homework.braceChecker;


public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        int pop;
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            char[] chars = text.toCharArray();
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(text.charAt(i));
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.out.println("Error: closed " + c + " but nothing opened at " + i);
                    } else if (pop != '(') {
                        isValid = false;
                        System.out.println("Error: closed " + c + " but opened " + (char) pop + "at " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.out.println("Error: closed " + c + " but nothing opened at " + i);
                    } else if (pop != ']') {
                        isValid = false;
                        System.out.println("Error: closed " + c + " but opened " + (char) pop + "at " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.out.println("Error: closed " + c + " but nothing opened at " + i);
                    } else if (pop != '}') {
                        isValid = false;
                        System.out.println("Error: closed " + c + " but opened " + (char) pop + "at " + i);
                    }
                    break;
            }

        }
        while (!stack.isEmpty()) {
            isValid = false;
            System.out.println("Error: opened " + (char) stack.pop() + " but nothing closed");
        }
        if (isValid) {
            System.out.println("Ամեն ինչ ճիշտ է:");
        }

    }

}
