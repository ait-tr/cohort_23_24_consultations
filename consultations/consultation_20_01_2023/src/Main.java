public class Main {
    public static void main(String[] args) {

   /*     int x = 10;
        x=x+1;
        int y = x;
        System.out.println(x);
        System.out.println(y);*/

        int x = 10;
        int y = ++x;

   //     System.out.println(x);
   //     System.out.println(y);



   //     int x1 =10;
   //     int y1 = x1;
   //     x1 = x1 + 1;
    //    System.out.println(x1);
    //    System.out.println(y1);

        int x1 = 10;
        int y1 = x1 ++;

        System.out.println(x1);
        System.out.println(y1);
 // 365 =3*100  +6*10 +5
        /*
        hundreds = 3
        tens = 6
        ones = 5

        563 = 5*100 + 6*10 +3
        563 = ones*100 +tens*10 + hundreds = 5*100 + 6*10 + 3 = 563
         */

        /*
        Вася спит днем если у него выходной или у него отпуск. Переменная weekday ( рабочий день)
        = true  если это рабочий день. Переменная vacation = true  если у него отпуск.
        Напишите выражение возвращающее true  если Вася спит.
        Задача на использование логических операторов &&,||, !, ^

         */
        boolean weekday =false;
        boolean vacation = false;
        boolean sleep = !weekday || vacation;
        System.out.println(sleep);//true

        weekday =true;
        vacation = false;
        // boolean sleep =weekday  vacation
        System.out.println(!weekday || vacation);// false or false

        weekday = false;
        vacation = true;
        System.out.println(!weekday || vacation); 


        //weekday  vacation  sleep
        // false    false -> true
        // true     false -> false
        //false     true  -> true







    //    System.out.println("Hello world!");
    }
}