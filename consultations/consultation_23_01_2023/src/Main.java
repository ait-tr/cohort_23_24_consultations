public class Main {
    public static void main(String[] args) {

        /*
         1. a | (b&c) = (a|b)&(a|c)
        2. a & (b|c) = (a&b)|(a&c)
        3. !(a|b) = !a & !b
        4. !(a&b) = !a | !b
         */
        boolean a = false;
        boolean b = false;
        boolean c = false;
   /*     System.out.println((a | (b & c)) == ((a | b) & (a | c)));
        System.out.println((a & (b | c)) == ((a & b) | (a & c)));
        System.out.println(!(a | b) == (!a & !b));
        System.out.println(!(a & b) == (!a | !b));
    */
        /*1.Воспитательница в детском саду знает, что если Петя и Вася оба смеются
        или оба очень серьезные, то они что-то затевают и надо быть внимательной.
        Помогите воспитательнице и напишите
        логическое выражение,дающее true когда оба мальчика смеются или ходят мрачные.
        petyaSmile and  vasyaSmile равны  true  если петя улыбается и Вася смеются

        petyaSmile  vasyaSmile  trouble
        true        true        true
        true        false       false
        false       true        false
        false       false       true

        boolean trouble = petyaSmile || vasyaSmile && petyaSmile*/
        boolean petyaSmile = false;
        boolean vasyaSmile = false;
        boolean trouble = (petyaSmile && vasyaSmile) || (!petyaSmile && !vasyaSmile);
     //   System.out.println(trouble);

        trouble=!(petyaSmile^vasyaSmile);



                // a       b      OR(a||b)
                // true    true     true
                // true    false    true
                // false   true     true
                // false   false    false

        //trouble=(!petyaSmile^vasyaSmile);
        // a       b      XOR(a^b)
        // true    true     false
        // true    false    true
        // false   true     true
        // false   false    false

        petyaSmile = false;
        vasyaSmile = false;

        trouble=(!petyaSmile^vasyaSmile);
        System.out.println(trouble);

        trouble=petyaSmile==vasyaSmile;



      /*  2.Вася рано встает на работу и поэтому рано ложится спать. Сосед Васи любит слушать
        громкую музыку. У Васи проблемы  если сосед слушает музыку и еще нет семи утра или уже
        позже 20 часов.
        Написать выражение, принимающее значение true если у Васи проблемы.
        int hour- это время в диапазоне от 0 до 23
        boolean singing
        singing   hour    vasiaInTrouble
         true       6       true
         true       7       false
         false      6       false

        */

    //    true==true
    //    false==false

        int x,y;
        x=10;
        y=9;
        boolean res = x==y;
   //     System.out.println(x==y);


    }

}