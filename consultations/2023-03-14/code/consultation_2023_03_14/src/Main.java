public class Main {
    public static void main(String[] args) {

        Human human = new Human("John","Smith");
        Programmer programmer = new Programmer("Jill","Black");

        //human.
     //   Human programmer1 = programmer;
     //   programmer1.
     //   programmer.

        Human programmer3 = new Programmer("Bill","Geitz");
        Human tester = new Tester("Ann","White",50);
      //  tester.

        human.work();
        programmer.work();
        programmer.doCode();
        programmer.doGoogle();
        programmer3.work();
        tester.work();


        PlusCalculator plusCalculator = new PlusCalculator();
        plusCalculator.add(1,2);
        plusCalculator.add(1,2,4);

      //  3.14*r*r

        // Когда-то давно на уроках труда  в школе  девочки учились готовить суп, а мальчики
        //делали табуретки. Написать программу,в которой создаются классы
        // Boy and Girl, имеющие 3 поля- имя,фамилия, возраст.
        // Затем в классе Main создать по два обьекта этих классов, поместить их в массив и вывести на экран информацию
        // о них а также  результат работы метода work.
    }
}
