import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] ints =new int[5];
        //  ints.charAt

        String str = "Hello";
        String[] strings = {"Hello","World"};
        for(int i=0;i<strings.length;i++){

            strings[0].charAt(i);
            strings[1].charAt(i);
        }

        char[] strToChar = str.toCharArray();
        System.out.println(Arrays.toString(strToChar));

        System.out.println(strToChar[1]);

        for (int i=0;i<strToChar.length;i++){
            System.out.println(strToChar[i]);
        }

        String string = "Hello";
        String[] oneString ={"Hello"};

        System.out.println(oneString[0]);



//)Есть лист положительных целых чисел нечетной длины >=3.
// Известно, что существует индекс элемента этого листа такой, что сумма всех элементов слева от
// него равняется сумме всех елементов справа от него. Написать метод, находящий этот индекс.
// 3,2,1,1,4
// 2,1,3,1,1,1
        // leftSum =2+1
        //rightSum = sum -leftSum - pivotEl
        //------------------
        // 1,2,3,4,5,6,
        // sum =21
        // leftSum = 6
        //rightSum = 15
        //sum =leftSum+rightSum
        //leftSum = sum -rightSum


        List<Integer>numbers = List.of(3,3,1,1,1);
        System.out.println(balancedSum(numbers));

        List<String>names = List.of("John","John","Jim");
        System.out.println(nameToNumberOccurence(names,"Kate"));

    }
    public static int balancedSum (List<Integer> ints){
        int sum = 0;
        for(int i = 0;i<ints.size();i++){
            sum = sum + ints.get(i);
        }

        int leftSum = ints.get(0);
        int lastPossiblePivotIndex = ints.size()-2;
        int pivotIndex = 0;
        // 3,2,1,1,4
        for(int i = 1;i<=lastPossiblePivotIndex;i++){

            int currentNum = ints.get(i);//1
            if(leftSum == sum-leftSum-currentNum){ //5 == 11-5-1
                pivotIndex=i;
            }
            leftSum += currentNum;       //3+2=5

        }
        return pivotIndex;

    }
    //Есть лист имен, некоторые из которых повторяются. Написать метод, который по имени вернет количество вхождений
    // этого имени в список.
    // [john, jack, mary,john,jack,kate]  john  -> 2
    //                                     mary-> 1


    // {john=2, jack=2, mary=1, kate=1}
    // map.get(name)
    public static int nameToNumberOccurence(List<String>list, String name){
        Map<String,Integer> nameToNumber = new HashMap<>();

        for (String s:list){
            if (nameToNumber.containsKey(s)){
                nameToNumber.put(s,nameToNumber.get(s)+1);
            }else nameToNumber.put(s,1);
        }
        return nameToNumber.getOrDefault(name,0);
    }
}