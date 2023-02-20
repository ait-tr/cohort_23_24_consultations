import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>ints =List.of(4,1,8,9);
        //    System.out.println("List size is "+ints.size());


        System.out.println(withoutElementsMoreThanN(ints,7));

        //Пусть есть список из чисел, а именно из 0 и 1 случайным образом в нем заданных.
        // Написать метод, возвращающий лист с  разделенными  нулями  и единицами
        //  List<Integer> zeroOne = List.of(0,1,1,0,0,0,1,1,0,1);
        //[0000011111]

        List<Integer> zeroOne = new ArrayList<>(List.of(0,1,1,0,0,0,1,1,0,1));
//[0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
        //   System.out.println(separate0and1(zeroOne));


        /* 2**
        Есть лист положительных целых чисел нечетной длины >=3.
        Известно, что существует индекс элемента этого листа такой, что сумма всех элементов слева от
        него равняется сумме всех елементов справа от него. Написать метод, находящий этот индекс.
        //3 2 3
        //3,2,1,1,4
        //3,3,1,1,1
         */

        List<Integer> numbers =new ArrayList<>(Arrays.asList(0,0,0,0,0));

        for (int i = 0;i<numbers.size();i++){
            numbers.add(5);
        }
        System.out.println(numbers);



    }

    //Пусть есть список из чисел, а именно из 0 и 1 случайным образом в нем заданных.
    // Написать метод, возвращающий лист с  разделенными  нулями  и единицами
    //   List<Integer> zeroOne = List.of(0,1,1,0,0,0,1,1,0,1);
    //[0000011111]

    // List.of(0,1,1,0,0,0,1,1,0,1))
    //  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
    public static List<Integer> separate0and1(List<Integer>list){
        int counter = 0;

        for (int i=0;i<list.size();i++){
            if(list.get(i)==0){
                counter++;
            }
        }
        for (int i = 0;i < counter;i++){
            list.set(i,0);
        }
        for (int i = counter; i<list.size();i++){
            list.set(i,1);
        }
        return list;

    }


    //1.Есть список целых чисел. Написать метод , который вернет список без элементов больше заданного числа
    // [4,1,8,9] если заданное число 8, то результат [4,1,8]
    //public static List<Integer> withoutElementsMoreThanN(List<Integer>input,int n)
    //алгоритм метода:
    //1. Создать новый лист целых чисел
    //2.Цикл For. В нем сравнить  через  if значение каждого элемента листа с числом n.
    //3.Если оно меньше либо равно n то добавить этот элемент в новый лист
    //После окончания цикла возврашаем новый лист
    public static List<Integer> withoutElementsMoreThanN(List<Integer>input, int n){
        List<Integer> withoutMoreThan = new ArrayList<>();

        for(int i=0;i<input.size();i++){

            if (input.get(i) <= n) {
                withoutMoreThan.add(input.get(i));
            }
        }
        return withoutMoreThan;
    }

    /*
for (int i=0; i< input.size(); i++){
    if(i<= n){

        neu.add(i);
    }
}
return neu;
     */

}