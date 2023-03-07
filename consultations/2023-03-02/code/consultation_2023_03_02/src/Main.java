import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


/*[8,23,98,112]
0   8
1   23
2   98
3   112

2    8
34   23

red   23
write  45

key :  value

 */
        int[] ints = {2,2,2,4,4,4};
        System.out.println(findDominant(ints));

        inputOutput("input.txt","inputOut.txt");
    }
    /*
    // Есть массив положительных целыж чисел. Найти элемент( если он есть), который встречается в массиве > length/2
// (доминантный). В противном случае вернуть -1
 //{5,5,9,9,5,5} - 5
 //{2,3} -> -1
 //{2,2} ->  2

 5=4
 9=2
     */

    public static int findDominant(int[] ints){
        Map<Integer,Integer> map =new HashMap<>();
        /*
        int[] ints = {7,7,6,6,7};
{7=1}
{7=2}
{6=1, 7=2}
{6=2, 7=2}
{6=2, 7=3}
         */

        for(int i=0;i<ints.length;i++){
            if(map.containsKey(ints[i])){
                int value = map.get(ints[i])+1;
                map.put(ints[i],value);}
            else map.put(ints[i],1);

            System.out.println(map);
        }

        //     {6=2, 7=3}  6,7
        for(int key: map.keySet()){
            if(map.get(key)>ints.length/2)// 3>2
                return key;
        }
        return -1;
    }

    //написать метод, который читает текст из одного файла и записывает его в другой
    public static  void inputOutput (String fileIn, String fileOut){
        try(BufferedReader br = new BufferedReader(new FileReader(fileIn));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut,true)) )
        {
            String line ="";
            while((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.getMessage();
        }

    }
}