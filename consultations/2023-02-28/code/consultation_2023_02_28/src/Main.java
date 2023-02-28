import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) //throws IOException
    {
        //   Scanner scanner = new Scanner(System.in);

        // BufferedReader с методом read() ( чтение файла посимвольно)
        try(FileReader fileReader = new FileReader("text.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);)

        {
            //   FileReader fileReader = new FileReader("text.txt");
            //   BufferedReader bufferedReader = new BufferedReader(fileReader);
//abc


            int c;
            //  c=(char) bufferedReader.read();
            //    while(bufferedReader.read() !=-1) {
            //        c=bufferedReader.read();
            //        System.out.println(c);

            while ((c = bufferedReader.read()) != -1) {
                System.out.print((char) c);
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }catch (Exception e){

        }
        System.out.println();
        //BufferedReader с методом readLine()/ (чтение построчно)
        try(FileReader fr = new FileReader("text.txt");
            BufferedReader br = new BufferedReader(fr);)
        {
            //   FileReader fr = new FileReader("text.txt");
            //   BufferedReader br = new BufferedReader(fr);

            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        /*
aaa
bbb
ccc

         */

        //BufferedWriter  FileWriter







    }

}
