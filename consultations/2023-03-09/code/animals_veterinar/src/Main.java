import java.util.ArrayList;
import  java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Звери и ветиринар");
//       Создать абстрактный класс Animal и расширяющие его классы Dog, Cat, Bear.

//      * Класс Animal содержит переменную name и абстрактные методы makeNoise, eat, getDescription.
//      * Метод makeNoise, например, может выводить на консоль звуки животных, описанных буквами.
//      * Метод  eat выводит на консоль список того, чем питается данное животное.
//      * Метод getDescription возвращает описание животного.
//        Методы Dog, Cat, Bear переопределяют методы makeNoise, eat, getDescription.

//        Создайте класс Ветеринар (Vet), в котором определите метод void treatAnimal(Animal animal).
//        Пусть этот метод распечатывает name и описание пришедшего на прием животного.
//        В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//        В цикле отправляйте их на прием к ветеринару.
//        В отдельном цикле вызовите методы  makeNoise, eat для каждого животного.

        Cat cat1 = new Cat("кошка", "британка");
        cat1.makeNoise();
        cat1.eat();
        cat1.getDescription();

        Dog dog1 = new Dog("собака", "лабрадор");
        dog1.makeNoise();
        dog1.eat();
        dog1.getDescription();

        Bear bear1 = new Bear("медведь", "панда");
        bear1.makeNoise();
        bear1.eat();
        bear1.getDescription();

        Vet vet1 = new Vet("Айболит");
        System.out.println();
        System.out.println("На прием пришла: ");
        vet1.treatAnimal(cat1);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat1);
        animalList.add(dog1);
        animalList.add(bear1);

        System.out.println(animalList);

        Scanner sc = new Scanner(System.in);
        String choice = "";
        int i = 0;

//        vet1.treatAnimal((Animal) animals.get(0));
//        vet1.treatAnimal((Animal) animals.get(1));

        while (true){
            if (i < 3) {
                vet1.treatAnimal((Animal) animalList.get(i));
                i++;
            } else {
                System.out.println("Очередь из зверей закончилась.");
                break;
            }
            System.out.println("Следующий? y/n ");
            choice = String.valueOf(sc.nextLine());
            if (choice == "n") {break;}
        }


    }
}