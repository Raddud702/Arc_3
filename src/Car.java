public class Car extends Vehicle implements Purchasable{
    private int compasity;
    public Car(String make, String model, int topSpeed, int compasity) {
        super(topSpeed, make);
        this.compasity = compasity;

    }
    @Override
    public String Wheels() {
        return getMake() + " has 4 wheels.";
    }
    @Override
    public void purchase(){
        System.out.println(getMake() + " is purchasable.");
    }

}
