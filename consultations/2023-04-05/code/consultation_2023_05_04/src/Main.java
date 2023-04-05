import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.err.println("Error printing");
    }

    // O(1)
    public int getLength(List<Integer>ints){

        return ints.size();
    }

    // O(n)

    public int sum(List<Integer>ints){
        for(int i=0;i<ints.size();i++){
            //body
        }
        return 2;

        //0(log n)

        //O(nLogn)

        //O(n^2)
    }

    // есть массив целых положительных чисел. Найти элемент, который встречается  в
    // массиве больше > length/2 (доминантный). Если такого нет, вернуть -1
    //[5,6,6,5,6,5] 5:3  6:3
    //[1,1,1,0,0,0,0] 1:3   0:4
    public int findDominant(int[] ints){
        Map<Integer,Integer> occToNumber = new HashMap<>();

        for ( int i = 0;i<ints.length;i++){
            if(occToNumber.containsKey(ints[i]))
                occToNumber.put(ints[i],occToNumber.get(ints[i])+1);
            else occToNumber.put(ints[i],1);
        }
        int counter = 0;
        int dominant = 0;

        for (int key: occToNumber.keySet()){
            if(occToNumber.get(key)>counter){
                counter = occToNumber.get(key);
                dominant = key;
            }
        }
        if(counter>ints.length/2)
            return dominant;
        return -1;
    }

    /*
    1.Есть лист имен, в котором некоторые имена повторяются. С помощью сета  написать метод, который вернет лист
    без повторяющихся элементов. List<String> withoutDuplicates (List<String> names)
    [Jack, Mary, Peter, Ann, Mary, Jack] ->[ Jack, Mary, Peter, Ann]
    */
    public List<String> withoutDuplicates (List<String> names){

        Set<String> set = new HashSet<>(names);

        return new ArrayList<>(set);
    }


    /*2. Есть список имен, в котором некоторые имена повторяются. С помощью сета написать метод, который вернет
    повторяющиеся элементы из этого листа  List<String> duplicates (List<String> names)
    [Jack, Mary, Peter, Ann, Mary, Jack]-> [Jack, Mary]

     */
    List<String> duplicates (List<String> names){
        Set<String> set = new HashSet<>();
        List<String> getDuplicates = new ArrayList<>();

        for (String s:names){
            if ( !set.add(s) && !getDuplicates.contains(s)) {
                getDuplicates.add(s);
            }
        }
        return getDuplicates;
    }
}
