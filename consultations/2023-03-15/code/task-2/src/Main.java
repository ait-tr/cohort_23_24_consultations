public class Main {
    public static void main(String[] args) {
        System.out.println("Hash code объекта");

        Person tom = new Person("Tom");
        Person jack = new Person("Piter");
        System.out.println(tom.hashCode());
        System.out.println(jack.hashCode());

//        Person tom = new Person("Tom");
//        System.out.println(tom.hashCode()); // 2036368507

    }
}