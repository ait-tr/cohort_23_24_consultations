public class Truck extends Car{

     /*
    создать класс Car, содержащий поля model,manufacturer, year,colour и поведение
    -  drive, stop
    а также классы PassengerCar and Truck, расширяющие Car.
    Класс Truck должен иметь следующие характеристики и поведение важные для грузовиков.
    А именно: макс. грузоподьемность и обьем топливного бака.
    Поведение: 1. должен уметь загружаться (load) и при этом сообщать если превышена его грузоподьемность а также
    сообщать сколько еще можно загрузить груза.
               2. разгружаться и при этом сообщать в случае если пытаются разгрузить больше чем его имеющийся груз
               или число отрицательно а также сообщать о весе остающегося на борту груза
               3. в случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать
               4. уметь дозаправляться
    */
    private int currentWeight = 0;
    private int maxWeight;
    private int currentFuel = 0;
    private int maxFuel;

    public Truck(String model,
                 String manufacturer,
                 int year,
                 String colour,
                 int maxWeight,
                 int maxFuel){
        super(model,manufacturer,year,colour);
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
    }

    public void load(int weight){
        if(weight > getRemainingCapacity()){
            System.out.println("This is too heavy for me!");
            printRemainingCapacity();
            return;
        }
        currentWeight += weight;

        System.out.println("Loading "+weight+" tons...");
        System.out.println("Loaded "+weight+" tons");
        printRemainingCapacity();
    }

    public void unload(int unloadingWeight){
        if(unloadingWeight>currentWeight){
            System.out.println("Not enough cargo!");
            printRemainingCargo();
            return;
        }
        if(unloadingWeight < 0){
            System.out.println("Can't unload negative weight!");
            return;
        }
        currentWeight -=unloadingWeight;
        System.out.println("Unloading "+unloadingWeight+" tons...");
        System.out.println("Unloaded "+unloadingWeight+" tons.");
        printRemainingCargo();
    }
    private void printRemainingCargo(){

        System.out.println("Remaining cargo weight is "+currentWeight+" tons");
    }

    public void drive(){
        if (currentFuel == 0){
            System.out.println("Not enough fuel, can't drive");
            return;
        }

        if ( currentWeight == 0){
            System.out.println("Please load the truck before driving!");
            return;
        }

        System.out.println("Trying...");
        System.out.println("Trying...");
        System.out.println("Trying...");
        System.out.println("Trying...");
        System.out.println("Driving!");
    }

    public void stop(){
        System.out.println("Stopping...");
        System.out.println("Stopping...");
        System.out.println("Yeah!");
    }

    public void setCurrentFuel(int currentFuel){
        this.currentFuel = currentFuel;
    }

    private void printRemainingCapacity(){
        System.out.println("Remaining capacity "+getRemainingCapacity()+" tons");
    }

    private int getRemainingCapacity(){
        return maxWeight - currentWeight;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Truck{" +
                "currentWeight=" + currentWeight +
                '}';
    }
}
