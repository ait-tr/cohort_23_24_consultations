import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
    public static void main(String[] args) throws RuntimeException, IOException {
        System.out.println("Запись текста в файл, чтение из файла");

        String path = "/Users/leonidk/Library/Mobile Documents/com~apple~CloudDocs/Documents/Моя работа/Курс Java Core/cohort_23_24_consultations/consultations/2023-03-01/code/file_IO_example/src/";
        String fileName = "test1.txt";

        File myFile = new File ( path + fileName); // Укажите свое имя файла

        // код для создания файла, где будем хранить нужный нам текст (данные)
        try {
            if (myFile.createNewFile()) {
                System.out.println("Файл создан: " + myFile.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //______________ Запись строчек в файл вручную
        System.out.println("Пример работы с файлом - ЗАПИСЬ в ФАЙЛ");

        //try {
            FileWriter myWriter = new FileWriter(path + fileName); // используем класс и его метод
            myWriter.write("Как ныне сбирается вещий Олег" + "\n"); // Пишем то, что записываем в файл
            myWriter.write("Отмстить неразумным хазарам..." + "\n"); // Пишем то, что записываем в файл
            // myWriter.close(); // Закрываем метод
            System.out.println("Произошла успешная запись в файл."); // Сообщение об успехе
        //} catch (IOException e) {  // поймали ошибку и положили ее в переменную с именем e
        //    System.out.println("Произошла ошибка."); // Сообщение об ошибке
        //    e.printStackTrace(); // печать содержания ошибок
        //}
        //______________ Запись строчек в файл в цикле

        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("White");
        colorsList.add("Green");
        colorsList.add("Gray");
        colorsList.add("Blue");
        colorsList.add("Black");

        // System.out.println(colorsList);
        // FileWriter myWriter = new FileWriter(path + fileName); // используем класс и его метод

        for (int i = 0; i < colorsList.size(); i++) {
            //try {
                myWriter.write(colorsList.get(i)+ "\n"); // Пишем то, что записываем в файл
            //} catch (IOException e) {
            //    throw new RuntimeException(e);
            // }
        }
        myWriter.close(); // Закрываем метод

        // _____________ чтение информации из файла
        System.out.println("Пример работы с файлом - ЧТЕНИЕ из ФАЙЛА");
        System.out.println();

            File myFileReader = new File(path + fileName);
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            int i = 0;
            while (myReader.hasNextLine()) {
                if (i < 2) {
                    String data = myReader.nextLine(); // считываем строку
                    System.out.println(data); // печатаем считанную строку
                } else break;
                i++;
            }
            myReader.close();
    }
}