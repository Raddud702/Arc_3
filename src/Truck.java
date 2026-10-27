public class Truck extends Vehicle {
    private double cargoTons;
    public Truck(String make, String model, int topSpeed, double cargoTons) {
        super(make, topSpeed);
        this.cargoTons = cargoTons;

    }
    @Override
    public String Wheels(){
        return make() + "4";

    }
}
