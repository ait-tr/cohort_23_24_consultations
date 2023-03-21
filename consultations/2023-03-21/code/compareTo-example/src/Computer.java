public class Computer implements Comparable<Computer> {
    String type;
    int operate_memory;
    int hard_disk_size;
    String operate_system;

    // конструктор класса
    public Computer(String type, int operate_memory, int hard_disk_size, String operate_system) {
        this.type = type;
        this.operate_memory = operate_memory;
        this.hard_disk_size = hard_disk_size;
        this.operate_system = operate_system;
    }

    @Override
    public String toString() {
        return "\n Computer{" +
                "type='" + type + '\'' +
                ", operate_memory=" + operate_memory +
                ", hard_disk_size=" + hard_disk_size +
                ", operate_system='" + operate_system + '\'' +
                '}';
    }

    @Override
    public int compareTo(Computer computer) {
        if (this.hard_disk_size == computer.hard_disk_size) { // условие сравнения по площади дома, это математическое сранение целых чисел
            return 0; // возвращаем 0, если площади равны
        } else if (this.hard_disk_size < computer.hard_disk_size) {
            return -1; // возвращаем -1, если одна площадь меньще другой
        } else {
            return 1; // возвращаем -1, если одна площадь меньще другой
        }
    }
}
