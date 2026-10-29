public class Car extends Vehicle{
    private int compasity;
    public Car(String make, String model, int topSpeed, int compasity) {
        super(topSpeed, make);
        this.compasity = compasity;

    }
    @Override
    public String Wheels() {
        return getMake() + " has 6 Wheels";
    }
}
