public class Truck extends Vehicle {
    private double cargoTons;
    public Truck(String make, String model, int topSpeed, double cargoTons) {
        super(topSpeed, make);
        this.cargoTons = cargoTons;

    }
    @Override
    public String Wheels(){
        return getMake() + " has 4 Wheels";

    }
}
