import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("is anagram " + isAnagram("hello", "eholl"));
        System.out.println("is anagram " + isAnagram("hello", "holl"));
        //2*. Написать метод, проверяющий повторяются ли две подстроки одна длиной 3 другая длиной 4 одинаковое
        // количество раз в данной строке
        //String str =blueredredredcampdfgblueghhblue
        // str3 = red
        // str4 =blue
        //public boolean checkStrings (String str,String str3, String str4)
        //Использовать цикл for  и методы класса String  substring, length, equals

        boolean isEqual = checkStrings("blueredredredcampdfgblueghh", "red", "blue");

        System.out.println(isEqual);


    }

    public static boolean checkStrings(String str, String strA, String strB) {
        int l = str.length();
        int countA = 0;
        int countB = 0;

        //blueredredredcampdfgblueghhblue
        for (int i = 0; i < l - 2; i++) {
            String tmp = str.substring(i, i + 3); //blu

            if (tmp.equals(strA))
                countA++;
        }
        //bluered   length=7,-3 =4   bluered  i=length-1=6
        for (int i = 0; i < l - 3; i++) {
            String tmp = str.substring(i, i + 4);

            if (tmp.equals(strB))
                countB++;
        }

        return countA == countB;

    }

    //1.Написать метод, проверяющий являются ли две строки анаграммами. Например : привет - рпиетв
    //public static boolean isAnagram(String str1, String str2)
    //  Arrays.sort(arrayName)

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i])
                return false;
        }
        return true;

    }

    // 8,2,5,9
    // Есть масссив целых чисел(неотсортированный),состоящий не меньше чем из двух элементов.
    // Написать метод,находящий и  выводящий на экран минимальный и
    // второй минимальный элемент маcсива если он есть
    //public static void findSecondMin(int[] arr)
}