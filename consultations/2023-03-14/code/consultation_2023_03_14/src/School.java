public class School {

    public static void main(String[] args) {
        Boy boy1 = new Boy("Kolya","Nikolayev",13);
        Boy boy2 = new Boy("Petya","Petrov",14);
        Girl girl1 = new Girl("Lena","Lenina",15);
        Girl girl2 = new Girl("Masha","Mashina",12);

        Pupil[] pupils = {boy1,boy2,girl1,girl2};

        for(int i=0;i<pupils.length;i++){
            System.out.println(pupils[i]);
            pupils[i].work();
            System.out.println("_________________________");
        }
    }
}
