package homework.javabook.chapter8;

public class DemoSuper {

    public static void main(String[] args) {

        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube =  new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("myBox1-ի ծավաը " + vol + " է:");
        System.out.println("myBox1-ի քաշը " + myBox1.weight + " է:");
        System.out.println();

        vol = myBox2.volume();
        System.out.println("myBox2-ի ծավաը " + vol + " է:");
        System.out.println("myBox2-ի քաշը " + myBox2.weight + " է:");
        System.out.println();

        vol = myBox3.volume();
        System.out.println("myBox3-ի ծավաը " + vol + " է:");
        System.out.println("myBox3-ի քաշը " + myBox3.weight + " է:");
        System.out.println();

        vol = myCube.volume();
        System.out.println("myCube-ի ծավաը " + vol + " է:");
        System.out.println("myCube-ի քաշը " + myCube.weight + " է:");
        System.out.println();

        vol = myClone.volume();
        System.out.println("myClone-ի ծավաը " + vol + " է:");
        System.out.println("myClone-ի քաշը " + myClone.weight + " է:");
        System.out.println();


    }
}
