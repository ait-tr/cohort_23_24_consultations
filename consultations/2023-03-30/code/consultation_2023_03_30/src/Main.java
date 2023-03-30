import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1- Есть список с целыми числами. Нужно написать метод, который вернет список
        // без элементов которые больше заданного числа n/
       // [3,1,6,8] 3 -> [3,1]

      //  2. Есть лист строк. Написать метод, возвращающий строку, которая встречается
     // в листе раньше - самую короткую или самую длинную. Лист не пустой и строки все разные.
     // bb a ff ddd  -> a
        //


    }

  // 1- Есть список с целыми числами. Нужно написать метод, который вернет список
    // без элементов которые больше заданного числа n/
    // [3,1,6,8] ,n=3 -> [3,1]

    public List<Integer> isWithoutMoreThanRequired (List<Integer>ints,int n){
        List<Integer> result = new ArrayList<>();

        for(int i:ints){
            if (i <= n)
                result.add(i);
        }
        return result;


    }

    /*
     //  2. Есть лист строк. Написать метод, возвращающий строку, которая встречается
     // в листе раньше - самую короткую или самую длинную. Лист не пустой и строки все разные.
     // bb a ff ddd  -> a
        //
     */
    public String findMinOrMax (List<String> strings){
        String shortest = strings.get(0);
        int indexShortest =0;
        String longest = strings.get(0);
        int indexLongest = 0;

        for (int i = 0;i < strings.size() ; i++){
            if(strings.get(i).length()<shortest.length()){
                shortest = strings.get(i);
                indexShortest = i;
            } else if (strings.get(i).length()>longest.length()){
                longest = strings.get(i);
                indexLongest = i;
            }
        }
        if(indexShortest<indexLongest) {
            return shortest;
        }

        return longest;
    }
}
