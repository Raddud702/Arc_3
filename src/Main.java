import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<Vehicle> garage = new ArrayList<>();
        garage.add(new Truck("Ford", "F-150", 125, 1500));
        garage.add(new Car("Toyota", "Camery", 150, 5));
        garage.add(new Truck("Kenworth", "W900", 80, 25000));

        for (Vehicle c : garage) {
            System.out.println(c);
        }
        System.out.println();

        ArrayList<Purchasable> PurchaseVehicles = new ArrayList<>();

        PurchaseVehicles.add(new Truck("Ford", "F-150", 125, 1500));
        PurchaseVehicles.add(new Car("Toyota", "Camry", 150, 5));

        for (Purchasable p : PurchaseVehicles) {
            p.purchase();
        }
    }
}