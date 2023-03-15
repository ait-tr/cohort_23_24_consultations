public class Boy extends Pupil {
    public Boy(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public void work(){
        System.out.println(firstName+" makes stools");
    }

    public String toString(){
        return super.toString()+ " . He is a boy";
    }
}
