public class PassengerCar extends Car{

    public PassengerCar (String model, String manufacturer,int year,String colour){
        super(model,manufacturer,year,colour);
    }
    @Override
    public void drive() {
        System.out.println("I am driving");
    }

    @Override
    public void stop() {
        System.out.println("I am stopping");
    }
}
