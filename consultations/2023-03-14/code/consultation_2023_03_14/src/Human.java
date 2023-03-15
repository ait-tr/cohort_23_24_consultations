public class Human {

    String name;
    String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void work() {
        System.out.println("Человек пошел на работу");

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
