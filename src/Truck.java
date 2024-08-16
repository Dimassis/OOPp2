public class Truck extends Transport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        arrived(getModelName());
        field();
    }
    public Truck(int wheelsCount) {
        super("Трак", wheelsCount);
        arrived(getModelName());
        field();
}
    public Truck(String modelName) {
        super(modelName, 0);
        arrived(getModelName());
        field();
}
    @Override
    public void check() {
        super.check();
        updateTyre();
        checkEngine();
        checkTrailer();
        field();
    }
    public void arrived(String modelName) {
        System.out.println("Приехал трак " + modelName + " на диагностику");
    }
}