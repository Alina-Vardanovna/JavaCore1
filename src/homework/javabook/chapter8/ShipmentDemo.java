package homework.javabook.chapter8;

public class ShipmentDemo {

    public static void main(String[] args) {

        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.43);
        Shipment shipment2 = new Shipment(2, 3, 4, 1.3, 4.8);
        double vol;
        vol = shipment1.volume();
        System.out.println("shipment1-ի ծավալը " + vol + " է:");
        System.out.println("shipment1-ի քաշը " + shipment1.weight + " է:");
        System.out.println("Առաքման վճարը " + shipment1.cost + " է:");

        vol = shipment2.volume();
        System.out.println("shipment2-ի ծավալը " + vol + " է:");
        System.out.println("shipment2-ի քաշը " + shipment2.weight + " է:");
        System.out.println("Առաքման վճարը " + shipment2.cost + " է:");

    }
}
