public class Dog {
    String name;
    int age;

    public Dog(){};

    /*public Dog(String dogName, int dogAge){
        name = dogName;
        age = dogAge;

        System.out.println("A new dog "+name+" is created");
    }*/

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("A new dog " + name + " is created");
    }

    public void sayGuv (){
        System.out.println("I am saying gav");
    }

    public void run(){
        System.out.println("I am runnung");
    }

    public void  askName(){
        System.out.println("What is your name?");
        System.out.println("My name is "+name);
    }

}
