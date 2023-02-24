import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Написать метод, который принимает список имен и их анаграмм и имя, по
        // которому он выдает список всех анаграмм этого имени, включая само имя
        // [vani,ivan,petr,terp,navi,maria],ivan->vani,ivan,navi

        //ДААНО слово, необходимо сформировать его анаграмму с помощью метода, который получает на вход слово,
        // возвращает анаграмму этого соова

        // на входе слово (word) типа Strig, на выходе аналогично
        // ключевой алгоритм - разобрать слово в массив по буквам
        // вывести массив задом наперед

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = sc.nextLine();

        int k = word.length();

        String[] letters = new String[k]; // объявление массива

        // разделение слов ана буквы методом split
        for ( int i = 0; i < word.length(); i++) {
            letters[i] = Arrays.toString(word.split(""));
            System.out.println(letters[i]);
        }

        // разделение слов ана буквы методом charAt()
        for ( int i = 0; i < word.length(); i++) {
            letters[i] = String.valueOf(word.toLowerCase().charAt(i));
            System.out.println(letters[i]);
        }
        // создаем метод
        anagamma (letters);

    }
        public static void anagamma(String[] letters) {
            for ( int i = letters.length - 1 ; i >= 0  ; i-- ) {
                System.out.print(letters[i]);
            }
    }
}