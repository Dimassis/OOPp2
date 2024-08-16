public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        arrived(getModelName());
        field();
    }
    public Car(int wheelsCount) {
        super("Автомобиль", wheelsCount);
        arrived(getModelName());
        field();
    }
    public Car(String modelName) {
        super(modelName, 0);
        arrived(getModelName());
        field();
    }
    @Override
    public void check() {
        super.check();
        updateTyre();
        checkEngine();
        field();
    }
    public void arrived(String modelName) {
        System.out.println("Приехал автомобиль " + modelName + " на диагностику");
    }
}