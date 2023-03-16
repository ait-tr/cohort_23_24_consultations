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
    //    if(weight > getRemainingCapacity()){
    //        System.out.println("This is too heavy for me!");
    //        printRemainingCapacity();
            return;
        }
    //    currentWeight += weight;

   //     System.out.println("Loading "+weight+" tons...");
   //     System.out.println("Loaded "+weight+" tons");
   //     printRemainingCapacity();
  //  }

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

    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }
}
