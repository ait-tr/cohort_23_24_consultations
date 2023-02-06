import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // определить, является ли введенное число **простым**
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29... - это простые числа
        // Что будем вводить на входе? - num одно число
        // Что надо сделать? - Определить простое num или нет
        // Что на выходе? - Число num - простое, или Число num - не простое
        // Основной алгоритм - перебрать натуральные числа от 2 до num - 1 и проверить
        // делиться ли на цело введенное num на число из тех, которые мы перебираем.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N:  ");
        int num = scanner.nextInt();
        System.out.println("Input number is: " + num);

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            double div = num % i;
            // System.out.println(div);

            if (div == 0) {
                isPrime = false;
                System.out.println("Number " + num + " is NOT prime.");
            }
        }
        if (isPrime) {
            System.out.println("Number " + num + " is prime.");
        } else {
            System.out.println("Number " + num + " is NOT prime.");
        }
    }
}
