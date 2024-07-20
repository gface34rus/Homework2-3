public class Car extends Vehicle implements Service {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}
