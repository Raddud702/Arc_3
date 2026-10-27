public class Car extends Vehicle{
    private int compasity;
    public Car(String make, String model, int topSpeed, int compasity) {
        super(make, topSpeed);
        this.compasity = compasity;

    }
    @Override
    public String Wheels() {
        return make() + "4";
    }
}
