import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сравниваем компьютеры");

        // Создать 5 компьютеров (объекты нашего класса Computer)
        // Создать TreeSet - класс, структура для хранения данных
        // положим в TreeSet эти 5 объектов
        // распечатать TreeSet
        // убедиться, что объекты в нем отсортированы в порядке возрастания по полю hard_disk_size

        Computer comp1 = new Computer("desktop", 8, 512, "Win 10 Home");
        Computer comp2 = new Computer("notebook", 16, 1024, "Win 10 Pro");
        Computer comp3 = new Computer("server", 64, 2048, "Win Serwer");
        Computer comp4 = new Computer("notebook", 32, 256, "MacOS");
        Computer comp5 = new Computer("desktop", 32, 128, "Linux");

        TreeSet computers = new TreeSet();
        computers.add(comp1);
        computers.add(comp2);
        computers.add(comp3);
        computers.add(comp4);
        computers.add(comp5);

        System.out.println("Наши компьютеры:");
        System.out.println(computers);
    }
}