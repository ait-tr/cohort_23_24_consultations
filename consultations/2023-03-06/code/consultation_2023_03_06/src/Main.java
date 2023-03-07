import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Dog vasia = new Dog();
        //  vasia.age =3;
        //  vasia.name = "Vasia";
        System.out.println("Vasia's age is " + vasia.age);
        System.out.println("Vasia's name is " + vasia.name);

        vasia.age = 3;
        vasia.name = "Vasia";

        System.out.println("Vasia's age is " + vasia.age);
        System.out.println("Vasia's name is " + vasia.name);

        Scanner sc = new Scanner(System.in);


        Dog petya = new Dog();
        petya.age = 14;
        petya.name = "Petya";

        System.out.println("Petya's age is " + petya.age);
        System.out.println("Petya's name is " + petya.name);

        petya.sayGuv();
        vasia.run();


        Dog newVasia = new Dog("Vasia1", 6);

        Dog sharik = new Dog("Sharik", 2);
        Dog druzhok = new Dog("Druzhok", 4);

        sharik.askName();
        System.out.println("------------------------------");
        druzhok.askName();

        Employee employee = new Employee("John", "Manager", 1000000);


//создать класс Employee c полями name, job, salary . Создать конструктор, принимающий эти поля
        //      Создать несколько обьектов этого класса и вывести в консоль


    }

}