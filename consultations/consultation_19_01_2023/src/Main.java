public class Main {
    public static void main(String[] args) {

        /*Написать программу, выводящую на экран значение переменной типа инт в квадрате.
        Предварительно обьявите эту переменную и задайте ее значение*/

        int x = 8;
        int a,b;

        /*1.Пусть цена товара А обычно составляет 1000 евро и товара B 500 евро.
        Если клиент покупает товары вместе, то на них действует скидка 100 евро
        на всю покупку. Вывести на экран переменную , которая соответствует стоимости
        суммы А+В со скидкой. Отдельно вывести на экран сумму скидки от этой покупки*/
        int aPrice =1000;
        int bPrice = 500;
        int discount = 100;
        int result = aPrice + bPrice -discount;
        System.out.println("Price of A +B - discount= "+result);
        System.out.println("Discount is "+discount);

        /*2. написать программу, выводящую на экран
        -площадь круга     пи radius в квадрате  3.14
        -периметр круга    2 пи radius
        Math.PI*/

        double pi = 3.14;
        double raduis = 7.5;
        double perimeter = 2*Math.PI*raduis;
        double area = Math.PI*raduis*raduis;

        System.out.println( "for radius of "+raduis+" Perimeter is "+perimeter+ " and Area is "+area);

        /*3. Написать программу, конвертирующую температуру из градусов
        фаренгейта в градусы цельсия
        F = 43
        С = (F − 32) × 5/9
        temperature of F is ___ in Celcius*/
        double farenheit = 432;

        double celsius = (farenheit - 32.0)*5/9.0;
        System.out.println("For temperature in Farenheit of "+farenheit + "Temperature in celsius is "+ celsius);



      //  System.out.println(x*x);

      //  System.out.println("Hello world!");
        /*
        1.Пусть цена товара А обычно составляет 1000 евро и товара B 500 евро.
        Если клиент покупает товары вместе, то на них действует скидка 100 евро
        на всю покупку. Вывести на экран переменную , которая соответствует стоимости
        суммы А+В со скидкой. Отдельно вывести на экран сумму скидки от этой покупки


        2. написать программу, выводящую на экран
        -площадь круга     пи radius в квадрате  3.14
        -периметр круга    2 пи radius
        Math.PI



        3. Написать программу, конвертирующую температуру из градусов
        фаренгейта в градусы цельсия
        F = 43
        С = (F − 32) × 5/9
        temperature of F is ___ in Celcius


        4*. В банкомате есть банкноты 1,5,10 долларов. Посчитать минимальное количество банкнот,
            необходимых для выдачи суммы денег n
            int n=
         */



    }
}