public class Bear extends Animal { // класс Bear расширяет / наследуется от Animal
    String breed; // это поле для породы

    // конструктор
    public Bear(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    // метод для звуков
    public void makeNoise() {
        System.out.println("Медведь издает звуки: Ррр - ррр... ");
    }
    // метод для еды
    public void eat() {
        System.out.println("Мёд...");
    }
    // метод для описания
    public void getDescription() {
        System.out.println("Это подробное описание семейства медвежьих...");
    }

    @Override
    public String toString() {
        return "Bear{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

