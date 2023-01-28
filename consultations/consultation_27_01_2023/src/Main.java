public class Main {
    public static void main(String[] args) {

        String string = "abc";
        //a-0
        //b-1
        //c-2
        //length=3
        int length = string.length();
        string.charAt(length-1);

        String hello = "H ello";
        //H -0
        //e-1
        //l -2
        //l -3
        //o- 4
        hello.substring(1,4);

        String str1 = "abcd";
        String substr1 =str1.substring(1);
        char end = str1.charAt(0);
        String result = substr1+end;
        System.out.println("string "+str1+" - first symbol to end: "+result);

        String substr2 = str1.substring(0,str1.length()-1);
        char begin = str1.charAt(str1.length()-1);
        String result1 = begin+substr2;
        System.out.println("string "+str1+" - last symbol to begin: "+result1);


        // Homework for Monday consultation- Task 0 is not compulsory
        //0- есть строка  в которой нужно поменять местами две заданные буквы.
        // Известно, что эти буквы в строке есть.
        //пример: String str = "asDfghjklRre";  поменять D и R

        //1- есть строка четной длины и нужно вывести на экран эту строку но при этом первая половина
        // букв будет в нижнем регистре а вторая в верхнем
        // Helloh -> helLOH


        //2- Имеется строка. Нужно вывести на экран эту строку без символа, находящегося по индексу index
        // int index =3
        // String str = "Hello"
        // -> Helo








    }
}