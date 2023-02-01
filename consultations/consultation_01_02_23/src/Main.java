import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1.написать простой калькулятор с четырьмя действиями, используя switch.
        // num1 и num2  +,-, /,*
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word ");
        String word = sc.next();

        System.out.println("you entered a word "+word);

        char letter = word.charAt(0);
        System.out.println("the first letter in the word "+word+" is "+letter);




        /* Java Help System
         Help on:
         1.if
         2.switch
         Choose one:
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Help on");
        System.out.println("1.if");
        System.out.println("2.switch");
        System.out.println("Enter number: ");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("The IF:");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case 2:
                System.out.println("Traditional Switch:");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println(" statement sequence");
                System.out.println(" break;");
                System.out.println("}");
                break;
            default:
                System.out.println("Your selection is not found");
        }

        /*
        Напишите программу, которая определяет в каком порядке введены  числа .
        Выводит на экран increasing если  числа возрастают (1,2,3) ,
        decreasing если убывают (3,2,1)   и "neither decreasing no increasing"
        // в остальных случаях
         */

        int x = 1;
        int y = 2;
        int z = 3;

        if(x<y && y<z) {
            System.out.println("increasing");
        }else if(x>y && y>z){
            System.out.println("decreasing");
        }else {
            System.out.println("neither increasing nor decreasing");
        }

        //1.написать программу, которая принимает номер дня недели и выводит на экран название
        // этого дня.
        // через switch и через if-else-if

        int day = 1;

        if(day == 1) {
            System.out.println("Monday");
        }
        else if(day == 2){
            System.out.println("Tuesday");
        }
        else if(day == 3){
            System.out.println("Wednesday");
        }
        else if (day == 4){
            System.out.println("Thursday");
        }
        else if (day == 5){
            System.out.println("Friday");
        }

        else if (day == 6){
            System.out.println("Saturday");
        }
        else if(day == 7)
            System.out.println("Sunday");

        else{
            System.out.println("Please enter a number betwwen 1-7");
        }

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Please enter a number betwwen 1-7");
        }

        //2. Написать программу, которая определяет оценку за тест студента
        /*
        если по результатам теста решено >= 90% вопросов то тогда оценка 5
        если по результатам теста решено >=70% вопросов но < 90% вопросов то тогда оценка 4
        если по результатам теста решено >=50% вопросов но < 70% вопросов то тогда оценка 3
        если по результатам теста решено <50% вопросов  то тогда оценка 2


         */

        int testResult = 45;

        if(testResult>=90) {
            System.out.println("you get 5");
        }
        else if(testResult>=70 && testResult<90){
            System.out.println("you get 4");
        }
        else if(testResult>=50 && testResult<70){
            System.out.println("you get 3");
        }
        else if (testResult<50){
            System.out.println("you get 2");
        }
        else{
            System.out.println("invalid");
        }




    }
}