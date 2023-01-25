import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int defis = '-';
        int minus = '-';


        System.out.println("defis is "+defis+ " and minus is "+minus);

 // написать программу, принимающую с клавиатуры 2 числа и выводящую их на экран
 // c переставленными местами значениями
        //int  num1 = 20
        // int num2 = 7
        //.........
       // num1 =7
        //num2 =20
        //  на выходе должно быть : num1=5  num2 = 10

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = scanner.nextInt();
        System.out.println("you entered num1 as "+num1);

        System.out.println("Enter num2 ");
        int num2 = scanner.nextInt();
        System.out.println("you entered num2 as "+num2);

      //  num1=num2;
      //  num2=num1;
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("and now num1 is "+num1+" and num2 is "+num2);

        num1=num2=temp+1;

     //   x,y
        num1=num1 +num2 -(num2=num1);







    }
}