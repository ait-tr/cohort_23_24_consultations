import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сумма элементов ArrayList");
        System.out.println();
        // Шаг 1:
        // Что на входе: Имеется массив целых чисел, массив надо задать самомтоятельно,
        // На выходе: получить сумму всех чисел из массива.
        // В переменную sum надо насуммировать последовательно все элементы массива.
        // Будем это делать в цикле for.
        // Интерфейс: спрашивать пользователя не будем,
        // для наглядности распечатем элементы листа (ArrayList),
        // после масива выведем на экран сумму всех элементов.

        // Шаг 2:
        // импорт необходимых компонент import = java.util.*;
        // подсказки из теории по синтаксису ArrayList<int> myArrayList = new ArrayList<int>();
        // похожие примеры кода int sum = sum + nameArray[i];
        //  sum+= nameArray[i]; - это аналогичный по функционалу код;
        // "=" - это оператор присваивания ( :=  - так оператор присваивания выглядел раньше )
        // 70, 27, 99, 33, 19 - это значения элементов массива
        // ### ArrayList - прямое заполнение методом asList
        //ArrayList<String> namesList = new ArrayList<String>(
        //    Arrays.asList("Peter","Vladimir","Stepan"));
        //System.out.println(namesList);

        // инициализация ArrayList (массива)
        ArrayList<Integer> myNumbers = new ArrayList<>(
                Arrays.asList(70, 27, 99, 33, 19)
        );

        //распечатка элементов ArrayList
        System.out.println("Заданы элементы ArrayList: " + myNumbers);


        int size = myNumbers.size(); // узнали длину (размер) ArrayList
        System.out.println("Длина ArrayList " + size);

        int s = sumOfArray(myNumbers);

        System.out.println("Cумма всех элементов = " + s);

        Collections.sort(myNumbers);

        System.out.println("Отсортированный ArrayList " + myNumbers);

    }

    public static int sumOfArray (ArrayList<Integer> arrayList) {
        int sum = 0;
        // Цикл for для суммирования элементов
        for (int i = 0 ; i < arrayList.size(); i++) {
            sum = sum + arrayList.get(i);
        }
        return sum;
    }
}