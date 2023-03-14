public class Tester extends Human {

    int numberOfTests;
    public Tester(String name, String surname,int numberOfTests) {
        super(name, surname);
        this.numberOfTests=numberOfTests;
    }

   public void work(){
       System.out.println("Tester likes to write tests");
   }
}
