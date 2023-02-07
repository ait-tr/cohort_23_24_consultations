public class Main {
    public static void main(String[] args) {

        //
        // 1.Написать метод, который с помощью цикла for реализует метод substring для варианта с двумя индексами
        //public static String ourSubstring (String str, int begin, int end)
        //H=charAt(0)
        //Hello
        //  "Hello".substring(1,3);

        String string = "Evgeny";
        System.out.println(ourSubstring(string,0,-2));







        //2*. Написать метод, проверяющий повторяются ли две подстроки одна длиной 3 другая длиной 4 одинаковое
        // количество раз в данной строке
        //String str =blueredredredcampdfgblueghhblue
        // str3 = red
        // str4 =blue
        //public boolean checkStrings (String str,String str3, String str4)
        //Использовать цикл for  и методы класса String  substring, length, equals




    }
    // 1.Написать метод, который с помощью цикла for реализует метод substring для варианта с двумя индексами
    //public static String ourSubstring (String str, int begin, int end)
    //H=charAt(0)
    //Hello

    public static String ourSubstring (String str, int begin, int end){
        if(begin<0 || begin>end )
            return "Invalid index" ;

        String substr ="";

        for(int i =begin; i<end && i<str.length();i++){
            substr = substr +str.charAt(i);
        }
        return substr;
    }
}