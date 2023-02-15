import java.util.*;

public class Main {
    public static void main(String[] args) {

        //  15  -> 1, 3, 5 ,15
        //  10 -> 1,  2, 5 ,10
        //     System.out.println(findGCD(15,10));

        List<Integer> ints = List.of(7,2,1,56,9);
        List<Integer>numbers =new ArrayList<>( Arrays.asList(1,1));

        //   findSecondMin(numbers);
        ruletka();

        //1,1,1,1,1,1

    }

    public static  int findGCD ( int number1, int number2){
        int gcd = 1;

        for (int i=1; i<=number1 && i<=number2;i++){
            if(number1 % i ==0 && number2 % i ==0){
                gcd = i;
            }
        }
        return gcd;
    }

    //найти второе во величине мин число в Arraylist  целых чисел
    //6,3,9,1
    //1,3,6,9
    //1,1,3,6,9
    //1,1,1,1,1,1,1,1,1,1,3
    //1,1,1,1,1,1,1
    public static void findSecondMin(List<Integer>ints){

        Collections.sort(ints);
        int min = ints.get(0);

        for(int index = 1;index<ints.size();index++){

            if (ints.get(index) != min){
                System.out.println("second min is "+ints.get(index));
                return;
            }
        }
        System.out.println("There is no second min elt");

    }

    public static void ruletka(){
        Random random = new Random();
        List<String> listRuletka = new ArrayList<>();

        for(int i=0;i<36;i++){
            listRuletka.add(null);
        }

        for(int i = 0;i<36;i+=2){
            listRuletka.set(i,"Red");
        }

        for(int i = 1;i<36;i+=2){
            listRuletka.set(i,"Black");
        }
        listRuletka.set(0,"ZERO");
        System.out.println(listRuletka);

        for(int i=0;i<20;i++){
            int index = random.nextInt(36);
            int number = index;
            String even = index%2 == 0 ? "even":"odd";
            String colour = listRuletka.get(index);

            System.out.println("And the winner is "+number+" "+even+" "+colour);

        }
    }
}