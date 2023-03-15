public class Demo {

    public static void main(String[] args) {


   //     Person jack = new Person();
   //     jack.name ="Jack";
   //     jack.age = 10;
     Person jack = new Person("Jack",20);

     jack.canWalk();

     // создать класс Cat.  Создать несколько экземпляров класса и вывести на экран
        // количество созданных кошек. Каждая кошка должна иметь имя.
     //   Затем добавить геттеры и сеттеры для того чтобы показать и изменить количество
        // созданных кошек

        Cat cat1 = new Cat("Barsik");

        Cat cat2 = new Cat("Becon");

        System.out.println(Cat.getCatCount());
        Cat.setCatCount(100);
        System.out.println(Cat.getCatCount());


        System.out.println(Calculator.plus(1,2));
        System.out.println(Calculator.minus(3,2));
        System.out.println(Calculator.multiply(2,2));
        System.out.println(Calculator.divide(5,2));
        System.out.println(Calculator.percent(100,10));




    }
}
