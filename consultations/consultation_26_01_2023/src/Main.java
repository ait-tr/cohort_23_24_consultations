import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int defis = '-';
        int minus = '-';


    //    System.out.println("defis is "+defis+ " and minus is "+minus);

 // написать программу, принимающую с клавиатуры 2 числа и выводящую их на экран
 // c переставленными местами значениями
        //int  num1 = 20
        // int num2 = 7
        //.........
       // num1 =7
        //num2 =20
        //  на выходе должно быть : num1=5  num2 = 10

        Scanner scanner = new Scanner(System.in);
    //    System.out.println("Enter num1 ");
    //    int num1 = scanner.nextInt();
    //    System.out.println("you entered num1 as "+num1);

    //    System.out.println("Enter num2 ");
    //    int num2 = scanner.nextInt();
    //    System.out.println("you entered num2 as "+num2);

      //  num1=num2;
      //  num2=num1;

        //num1 = 7
        //num2 = 20
    //    int temp = num1;//temp=7
    //    num1=num2;//num1 =20
    //    num2=temp;//num2 = 7
    //    System.out.println("and now num1 is "+num1+" and num2 is "+num2);

     //   num1=num2=temp+1;



    //    num1=num1 +num2 -(num2=num1);

        //   x,y

        int x = 10;
        int y = 5;

        x = x + y;
        y = x -y;
        x = x-y;

       // x = x+y;
      //  y = (x+y)-y=x;
      //  x = (x+y)-x=y;

        System.out.println("now x is "+x + " and y is "+y);

        //1.Есть строка .Написать программу , выводящую на экран целое число, равное двойной длине этой строки
        //"Hello" -> 10
        //H-0
        //e-1
        //l-2
        //l-3
        //o-4
       // length =5
        String str = "Hello";
        int doubleLength =str.length()*2;
        System.out.println("String "+"\""+str+"\""+" has length="+doubleLength);


        //2. Дана строка четной длины. Написать программу, выводящую на экран половину строки
        // Hell -> He


        //3. Написать программу, переставляющую первую букву в конец строки и вывести получившуюся строку на экран
        // abcd -> bcda

        //4. Написать программу, переставляющую последнюю букву в начало строки и вывести получившуюся строку на экран
        //        // abcd -> dabc











    }
}