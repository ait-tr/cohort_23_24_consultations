public class Dog extends Animal { // класс Dog расширяет / наследуется от Animal
    String breed; // это поле для породы

    // конструктор
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    // метод для звуков
    public void makeNoise() {
        System.out.println("Собака издает звуки: Гав - гав... ");
    }
    // метод для еды
    public void eat() {
        System.out.println("Собака ест мясо и кашу...");
    }
    // метод для описания
    public void getDescription() {
        System.out.println("Это подробное описание семейства собачьих...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

