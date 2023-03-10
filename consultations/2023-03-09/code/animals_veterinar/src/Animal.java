public abstract class Animal {
    String name; // это будет кошка, собака, медведь и т.д.

    // конструктор для создания животного
    public Animal(String name) {
        this.name = name;
    }

    // сеттер для наименования животного
    public void setName(String name) {
        this.name = name;
    }

    // метод для звуков
    public void makeNoise() {
    }

    // метод для еды
    public void eat() {
    }

    // метод для описания
    public void getDescription() {
    }

}
