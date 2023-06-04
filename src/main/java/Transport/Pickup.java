package Transport;

public class Pickup extends Transport {

    private String model;

    public Pickup(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " заведена");
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "model='" + model + '\'' +
                '}';
    }

}
