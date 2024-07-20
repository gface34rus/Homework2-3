public class Truck extends Vehicle implements Service {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public  void check(){
        super.check();
        checkEngine();
        checkTrailer();
    }
}
