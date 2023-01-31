public class Main {
    public static void main(String[] args) {

        // 1.Написать программу, определяющую является ли целое число положительным,
        // отрицательным или нулем и выводящую соответствующее сообщение на экран.

        int n = 0;
        //number is zero
        n = 34;
        //number is positive
        if (n > 0) {
            System.out.println("number is positive");
        } else if (n < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is zero");

        }

        if (n > 0) System.out.println("number is positive");
        if (n < 0) System.out.println("number is negative");
        if (n == 0) System.out.println("number is zero");

        // 2.Напишите программу, которая принимает три числа и выводит на экран "All numbers are equal",
        // "All numbers are different", "Some numbers are equal"  в соответствующих случаях

        int x1 = 8;
        int y1 = 8;
        int z1 = 8;

        if (x1 == y1 && x1 == z1) {
            System.out.println("All numbers are equal");
        } else if ((x1 == y1) || (x1 == z1) || (z1 == y1)) {
            System.out.println("Some numbers are equal");
        }else {
            System.out.println("All numbers are different");
        }


        // 3. Напишите программу, которая определяет в каком порядке введены  числа . Выодит на экран increasing если
        // числа возрастают (1,2,3) ,  decreasing если убывают (3,2,1)   и "neither decreasing no increasing"
        // в остальных случаях
        // int a=1
        // int b=2
        // int c=3


        int i = -5;
        i = 5;

        int abs = i >= 0 ? i : -i;

        int x = 2;
        int y = 1;
        boolean flag = false;

        String ternString = flag ? "yes" : "no";

        //   System.out.println("for number "+i+" its absolute value is "+abs);
        // |-5|=5
    }
}
