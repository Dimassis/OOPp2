public abstract class Transport implements check {
    private final String modelName;
    private final int wheelsCount;
    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
    }
    public void updateTyre() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку " + (i + 1));
        }
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public String getModelName() {
        return modelName;
    }
    public void field() {
        System.out.println("**************************");
    }
}


