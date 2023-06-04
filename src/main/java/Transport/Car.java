package Transport;

public class Car extends Transport{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println(model + " заведена");
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
