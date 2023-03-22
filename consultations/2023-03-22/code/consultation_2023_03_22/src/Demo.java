import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

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
   public static void main(String[] args) {
       Truck truck = new Truck("Super Truck",
                            "Volvo",
                                   2020,
                                 "yellow",
                               5000,
                                  500);

       System.out.println(truck);
       truck.load(2000);
     //  truck.load(10000);
       truck.load(3000);

       truck.drive();
       truck.setCurrentFuel(300);
       truck.drive();


       truck.stop();

     //  truck.unload(100000);
       truck.unload(2000);
       truck.unload(-5000);
       truck.unload(3000);

       Truck truck1 = new Truck("Super Truck",
                            "Man",
                                    2010,
                                    "black",
                                 5000,
                                    500);

       Truck truck2 = new Truck("Super Truck",
               "Man",
               2023,
               "green",
               4000,
               500);

       Car passengerCar = new PassengerCar("AAAA","AlfaRomeo",1997,"red");

       Car[] cars = {truck,truck1,truck2,passengerCar};

       System.out.println("List of cars:");
       List<Car> carsList = Arrays.asList(truck,truck1,truck2,passengerCar);
       Collections.sort(carsList);
       System.out.println(carsList);

   }
}
