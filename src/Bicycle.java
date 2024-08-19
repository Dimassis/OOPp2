public class Bicycle extends Transport{
    public Bicycle(String modelName, int wheelsCount) {
       super(modelName, wheelsCount);
       arrived(getModelName());
       field();
    }
    public Bicycle(int wheelsCount) {
        super("Велосипед", wheelsCount);
        arrived(getModelName());
        field();
    }
    public Bicycle(String modelName) {
        super(modelName, 0);
        arrived(getModelName());
        field();
    }
    @Override
    public void check() {
        super.check();
        updateTyre();
        field();
    }
    public void arrived(String modelName) {
        System.out.println("Приехал велосипед " + modelName + " на диагностику");
    }
}