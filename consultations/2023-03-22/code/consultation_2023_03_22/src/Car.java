public abstract class Car implements Comparable<Car> {

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

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public int compareTo( Car o){
        if(getManufacturer().equals(o.getManufacturer()))
            return getYear()-o.getYear();
        return getManufacturer().compareTo(o.getManufacturer());
    }

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
