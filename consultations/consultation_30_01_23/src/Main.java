import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        // Homework for Monday consultation- Task 0 is not compulsory
        //0- есть строка  в которой нужно поменять местами две заданные буквы.
        // Известно, что эти буквы в строке есть.
        //пример: String str = "asDfghjklRre";  поменять D и R

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word ");
        String str1 = sc.nextLine();

        System.out.println("Enter the first letter ");
        char ch1 =(char)System.in.read();

        int garbage = System.in.read();
        System.out.println("the garbage symbol is "+garbage);

        System.out.println("Enter the second letter ");
        char ch2 =(char)System.in.read();

        int ch1Index = str1.indexOf(ch1);
        int ch2Index = str1.indexOf(ch2);

        if(ch1Index ==-1 || ch2Index ==-1)
            System.out.println("There is no such letter in the word");

        else {

            // abcfde
            int i, j;

            if(ch1Index<ch2Index) {
                i = ch1Index; //b
                j = ch2Index; //d
            } else{
                i = ch2Index;
                j = ch1Index;
            }


            System.out.println(str1.substring(0, i) + str1.charAt(j) + str1.substring(i + 1, j) + str1.charAt(i)
                    + str1.substring(j + 1));

        }

        //1- есть строка четной длины и нужно вывести на экран эту строку но при этом первая половина
        // букв будет в нижнем регистре а вторая в верхнем
        // Helloh -> helLOH

        String evenStr = "Helloh";
        String firstHalf = evenStr.substring(0,evenStr.length()/2);
        String secondHalf = evenStr.substring(evenStr.length()/2);
        System.out.println(firstHalf.toLowerCase()+secondHalf.toUpperCase());


        //2- Имеется строка. Нужно вывести на экран эту строку без символа, находящегося по индексу index
        // int index =3
        // String str = "Hello"
        // -> Helo

        int index = 3;
        String s = "Hello";

        String result = s.substring(0,index)+s.substring(index+1);
        System.out.println(result);

       


    }
}