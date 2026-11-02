public class Truck extends Vehicle implements Purchasable {
    private double cargoTons;
    public Truck(String make, String model, int topSpeed, double cargoTons) {
        super(topSpeed, make);
        this.cargoTons = cargoTons;

    }
    @Override
    public String Wheels(){
        return getMake() + " has 6 wheels.";

    }
    @Override
    public void purchase() {
        System.out.println(getMake() + " is purchasable.");
    }
}
