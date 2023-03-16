public abstract class Car {

    private String model;
    private String manufacturer;
    private int year;
    private String colour;

    public Car(String model, String manufacturer, int year, String colour){
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = colour;
    }

    public abstract void drive();

    public abstract void stop();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }
}
