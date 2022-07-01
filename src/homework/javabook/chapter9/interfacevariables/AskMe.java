package homework.javabook.chapter9.interfacevariables;

public class AskMe implements SharedConstants {

    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("Ոչ");
                break;
            case YES:
                System.out.println("Այո");
                break;
            case MAYBE:
                System.out.println("Հնարավոր է");
                break;
            case LATER:
                System.out.println("Ավելի ուշ");
                break;
            case SOON:
                System.out.println("Շուտով");
                break;
            case NEVER:
                System.out.println("Երբեք");
                break;
        }
    }

    public static void main(String[] args) {

        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

    }

}