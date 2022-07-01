package homework.javabook.chapter8;

public class RefDemo {

    public static void main(String[] args) {

        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.3);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("weightBox-ի ծավալը " + vol + " է:");
        System.out.println("weightBox-ի քաշը " + weightBox.weight + " է:");
        System.out.println();

        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("plainBox-ի ծավալը " + vol + " է:");
//      System.out.println("plainBox-ի քաշը " + plainBox.weight + " է:");
//      Այս օպերատորը չի աշխատում, քանի որ

    }
}
