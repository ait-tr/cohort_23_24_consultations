import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean flag;
        do {
            flag = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = 0;
            try {
                //           number = scanner.nextInt();
            } catch (InputMismatchException e) {

                System.out.println("you can enter only numbers");
                flag = true;

            }
        }while (flag);



        int i = 10;

        while(i>1){

            //         System.out.print(i);

            i--;

        }

        for(int j = 1;j>1;i--){
            //         System.out.print(i);
        }

        flag=false;
        while (flag){

        }
        int dayOfWeek = 8;
        switch (dayOfWeek){

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                //    System.out.println("Saturday");

            case 7:
                System.out.println("This is a day off!");
                break;

            default:
                System.out.println("Such day does not exist");

        }
        int[]ints ={5,5,9,9,5,5,7,1};
        findDominant(ints);
    }
// Есть массив положительных целыж чисел. Найти элемент( если он есть), который встречается в массиве > length/2
//    (доминантный). В противном случае вернуть -1

    // {5,5,9,9,5,5,7,1}   -> 5
    //{2,3}   -> -1
    //{2,2}  -> 2

    public static int findDominant(int[] ints){
        Map<Integer,Integer> occurencesToNumber = new HashMap<>();
        //{5,5,9,9,5,5,7,1}
        for(int i=0;i<ints.length;i++){
            if(occurencesToNumber.containsKey(ints[i])){
                int value = occurencesToNumber.get(ints[i]);
                occurencesToNumber.put(ints[i],value+1);
            } else{
                occurencesToNumber.put(ints[i],1);
            }

            System.out.println(occurencesToNumber);
        }
        return -1;
    }





}