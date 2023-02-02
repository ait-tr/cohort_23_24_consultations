public class Main {
    public static void main(String[] args) {
      //  0,1,1,2,3,5,8,13,21,...

        int count = 7;
        int number1 = 0;
        int number2 = 1;

        int i = 1;

        while (i<=count)
        {
            System.out.print(number1+" ");

            int sum = number1+number2;
            number1 = number2;
            number2 = sum;
            i++;


        }
        System.out.println();

        //Задача1

        // n! = 1*2*3*......(n-1)*n
        //3! = 1*2*3
        //5! = 1*2*3*4*5

        // Найти факториал числа n используя цикл while.

        int number = 5;
        number= 3;
        long factorial = 1;

        int y = 1;
        while (y<=number){

            factorial = factorial * y;
            y++;


        }

        System.out.println("Factorial of "+number+" is: "+factorial);


        /*
        Есть целое число. Используя цикл while написать программу, проверяющую равна ли в этом числе сумма
        его цифр их произведению
        123
        1+2+3=1*2*3

        1124
        1+1+2+4=1*1*2*4


        658
         */

       int temp,productDigit=1,sumDigit=0;
       int  num =123;
       num=1234;

       int myNum = num;

       while(myNum>0)
       {
          temp = myNum%10;
          sumDigit = sumDigit + temp;
          productDigit = productDigit*temp;
          myNum = myNum/10;
       }
       if(sumDigit==productDigit)
           System.out.println(num +" is the number");
       else
           System.out.println(num+ " is not the number");





    }
}