public class Pupil {

    String firstName;
    String secondName;
    int age;

    public Pupil(String firstName, String secondName, int age ){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public void work(){
        System.out.println("Pupils like to work");
    }

    public String toString(){
        return "first name = "+firstName+ " ,second name = "+secondName+
                " ,age = "+age;
    }
}
