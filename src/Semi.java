public class Semi extends Vehicle implements Purchasable {
    private double cargoTons;
    public Semi(String make, String model, int topSpeed, double cargoTons) {
        super(topSpeed, make);
        this.cargoTons = cargoTons;

    }
    @Override
    public String Wheels(){
        return getMake() + " has 10 wheels. ";

    }
    @Override
    public void purchase(){
        System.out.println(getMake() + " is not purchasable.");
    }

}
