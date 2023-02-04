public class  Main {
    public static void main(String[] args) {

        int i = 1 ;

        do{

            System.out.println(i);
            i--;

        }while(i>1);


        //1- написать метод выводящий на экран таблицу умножения для числа n.
      //  multiply()
        // Example:
       // при n=5
        // n*1   -> 5*1=5
        //n*2 =10
        //......
        //n*10 =50


        //2. Используя цикл while написать метод, возвращающий сумму цифр от 1 до n
        // Какой тип переменных  принимает этот метод  и какой возвращает?
        // sumN()

        // 3*- написать метод, выводящий на экран таблицу умножения

    multiply(3);
        System.out.println(sumN(3));

    }


    //1- написать метод выводящий на экран таблицу умножения для числа n.
    //  multiply()
    // Example:
    // при n=5
    // n*1   -> 5*1=5
    //n*2 =10
    //......
    //n*10 =50
    public static void multiply(int n){

        int i = 1;
        while(i<=10){
            System.out.println(n+"*"+i+"="+(n*i));
            i++;
        }
    }

    public static int sumN (int n){
        int i =1;
        int sum = 0;

        while(i<=n){
            sum = sum+i;
            i++;
          //  sum+=i++;
        }
        return sum;
    }
}