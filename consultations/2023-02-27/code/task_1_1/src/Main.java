public class Main {
    public static void main(String[] args) {

        String hundred = "155";
        System.out.println(hundred+1); // напечатали смесь символов и числа 1
        System.out.println(Integer.parseInt(hundred)); // находим число внутри строки
        int hundredNumber = Integer.parseInt(hundred); // присвоили найденное в строке число в переменную
        System.out.println(hundredNumber + 5); //число складывается с числом


        // Перевод из двоичной системы в десятичную
        System.out.println("Перевод из двоичной системы в десятичную");

        String string_num = "1000"; // двоичное число задано строкой
        System.out.println("Двоичное число: " + string_num);
        System.out.println("В десятичной системе это: " + Integer.parseInt(string_num,2));
        System.out.println();

        System.out.println( Integer.parseInt("100",8));
        System.out.println(Integer.parseInt("100",16));

        // перевод в  десятичную из 8,16 и 2
        int num = 12345;
        System.out.println("Десятичное число: " + num);

        // Это запись двоичного числа: 0100 , его надо перевести в десятичное число
        // шаг 1 - выделить только "100" из имеющейся строки -> в строку
        // шаг 2 - исапользовать Integer.parseInt("строка", 2) - это нам даст десятичное значение

        /*
 64
256
4
         */
        // перевод  из десятичной в 8,16 и 2
        System.out.println(Integer.toOctalString(64));
        System.out.println(Integer.toHexString(256));

        System.out.println("Перевод в двоичное число (будет выведено строкой)");
        String bi = "";
        bi = Integer.toBinaryString(16);
        System.out.println(bi);

        // System.out.println(Integer.toBinaryString(16));

        // запись двоичного, 8 и 16 ричных чисел в джаве
        int binary=  0b1100;
        int oct = 011;
        int hex = 0XFF;
    }

}


