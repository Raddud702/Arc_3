import java.util.ArrayList;
public class Main{

public static void main(String[] args) {

    ArrayList<Vehicle> garage = new ArrayList<>();
    garage.add(new Truck("Ford", "F-150", 125, 1500));
    garage.add(new Car("Toyota", "Camry", 150, 5));

    for (Vehicle c : garage) {
        System.out.println(c.Wheels());
    }

    System.out.println("Test");
    System.out.println();
    }
}