package homework.javabook.chapter8;

public class BoxWeightDemo {
    public static void main(String[] args) {

        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 32.4);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.067);
        double vol;

        vol = myBox1.volume();
        System.out.println("myBox1-ի ծավալը " + myBox1.volume() + " է:");
        System.out.println("myBox1-ի քաշը " + myBox1.weight + " է:");
        System.out.println();

        vol = myBox2.volume();
        System.out.println("myBox2-ի ծավալը " + myBox2.volume() + " է:");
        System.out.println("myBox2-ի քաշը " + myBox2.weight + " է:");

    }
}
