import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        int hour=21;
        boolean singing=false;
        boolean vasiaInTrouble = singing&&(hour<7 || hour >20);
        System.out.println(vasiaInTrouble);

        // 1.Найти и вывести на экран сумму двух целых чисел, значения
        // которых вводятся с клавиатуры
        Scanner scanner = new Scanner(System.in);
    //    System.out.println("Enter first number");
   //     int num1 = scanner.nextInt();

   //     System.out.println("Enter second number");
   //     int num2 = scanner.nextInt();

   //     System.out.println("the sum of two numbers is "+(num1+num2));

        // 2. написать программу, которая находит площадь и периметр круга,
        // радиус вводится с клавиатуры
        // perimetr = 2*PI*radius
        // area = pi radius^2
     //   System.out.println("enter radius");
     //   int radius = scanner.nextInt();

    //    double perimetr = 2*Math.PI*radius;
    //    double area = Math.PI * Math.pow(radius,2);

   //     System.out.println("for radius "+radius+" perimeter is "+perimetr+
   //             " and area is "+area);

        // 3.найти минимальное из двух чисел, введенных с клавиатуры  без учета знака
        // (использовать методы  класса Math)
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        int min = Math.min(absA,absB);
        System.out.println(min);








        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int value;
   //     while((value = bufferedReader.read()) !=-1){
   //         System.out.println((char) value);
        }





    }
