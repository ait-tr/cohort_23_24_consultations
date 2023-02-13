public class Main {
    public static void main(String[] args) {

        // Дан массив целых чисел, состоящий не менее чем из двух элементов. Написать
        // метод, выводящий на экран  второй минимальный элемент массива если он существует
        // {3,1,9,4,0}
        //{1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        int[]arr={3,1,9,4,0};
        //    findSecondMin(arr);

        String[] cars =  {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};
        findCar(cars,"opel");


    }

    public static void findSecondMin(int[] arr){

        int firstMin;
        int secondMin;

        firstMin =arr[0];//3
        secondMin = Integer.MAX_VALUE;//214700000

        for(int i=1;i<arr.length;i++){
            if (arr[i]<firstMin){
                firstMin = arr[i];
            }
        }// int[]arr={3,1,9,4,0}; min=0
        for (int i = 0;i<arr.length; i++){
            if (arr[i] < secondMin && arr[i] != firstMin){
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE){
            System.out.println("No second min");
        }
        else{
            System.out.println("min is "+firstMin+" and second min is "+secondMin);
        }


    }

    // Написать метод, который проверяет есть ли заказаная машина в салоне.
    // пример:String [] salon =
    // {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};
    //название машины для поиска получаем с клавиатуры ( через Scanner)

    //1. создать метод public static  void findCar(String[]cars,String carToFind)
    //2.результат работы метода вывести на экран: carToFind is found  or not found
    //3. Алгоритм работы метода :
    // завести переменную хранящую длину массива
    // в цикле for  сравнивать (через if) каждый элемент массива с машиной, которую ищем
    // если нашли выводим на экран соответствующее уведомление если нет то пишет что такой машины нет.
    //4. Учесть правила сравнения стрингов ( через equals) и учесть возможность использования как больших  так
    // и маленьких букв
    // Arrays.toString(cars)
    //string.equals(string2)
//{"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"}
    public static  void findCar(String[]cars,String carToFind){
        int length = cars.length;

        for(int i=0;i<length;i++){

            if(cars[i].equalsIgnoreCase(carToFind)) {
                System.out.println("this car is available");
                return;
            }
            //     System.out.println("this car is not available. Take ");
        }
        System.out.println("this car is not available. Take ");

        for(String car: cars)
            System.out.print(car+" ");


        // 6 :3 =2
        // 21 :3 = 7
        // ->
        //20 -> 5
        // 15-> 5
        // Написать метод, находящий наибольший общий делитель двух целых чисел и в процессе
        // отдадки протестировать этот метод дебаггером
        // public static int ( int num1, int num2)
    }
}