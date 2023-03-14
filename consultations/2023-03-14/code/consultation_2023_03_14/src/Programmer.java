public class Programmer extends Human{
    public Programmer(String name, String surname) {
        super(name, surname);
    }

    public void work() {
        System.out.println("Программист любит писать код");

    }

    public void doCode(){
        System.out.println("Он сидит за ноутбуком и печатает код");
    }

    public void doGoogle(){
        System.out.println("A programmer can google");
    }
}
