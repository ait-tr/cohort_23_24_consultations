public class Girl extends Pupil{

    public Girl(String firstName, String secondName, int age){
        super(firstName,secondName,age);
    }

    public void work(){
        System.out.println(firstName+" cooks soup");
    }

    public String toString(){
        return super.toString()+" .She is a girl";
    }
}
