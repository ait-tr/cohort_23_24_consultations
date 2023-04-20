import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println(readInList("input.txt"));

        List<BankAccount> l1 = List.of(new BankAccount("DE43249898543096"),
                new BankAccount("DE33249898543096"),
                new BankAccount("DE73249898543096"));
        List<BankAccount> l2 = List.of(new BankAccount("DE13249898543096"),
                new BankAccount("DE73249898543096"),
                new BankAccount("DE23249898543096"));
        List<BankAccount> l3 = List.of(new BankAccount("DE53249898543096"),
                new BankAccount("DE43249898543096"));
        List<BankAccount> l4 = List.of(new BankAccount("DE43249898543096"),
                new BankAccount("DE33249898543096"),
                new BankAccount("DE73249898543096"),
                new BankAccount("DE23249898543096"));
        List<Person> newList = List.of(new Person("Mark", l1),
                new Person("Karl", l2),
                new Person("Jimmy", l3),
                new Person("Vasja", l4));

     //   System.out.println(ibanWithStars(newList));
        // Start with Runner
    //    new Runner().start();
    //    new Runner().start();
    //    new Runner().start();

        //Start with RunnerRunnable
    //    new Thread(new RunnerRunnable()).start();
    //    new Thread(new RunnerRunnable()).start();

        CountInt2 countInt = new CountInt2();
        countInt.start();
        countInt.join();

        System.out.println("Counter is ");
        System.out.println(countInt.getCounter());
    }


    public static List<String> readInList(String filename) {
        List<String> result = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

  /*  Есть класс BankAccount  с полем String IBAN  и класс Person  с полями name и List<BankAccount>. Написать
    // метод, возвращающий список IBANs   со звездочками после третьего символа */

    public static List<String> ibanWithStars(List<Person> persons) {
        return persons
                .stream()
                .flatMap(ba -> ba.getBankAccounts().stream())
             //   .map(ba -> ba.getBankAccounts().stream())
                .map(BankAccount::getIBAN)
                .map(Main::stars)
                .collect(Collectors.toList());
    }

    private static String stars(String input) {
        char[] ch = input.toCharArray();
        for (int i = 3; i < ch.length; i++) {
            ch[i] = '*';
        }
        return new String(ch);


    }

    //1.Создать класс, наследующий Thread и класс реализующий интерфейс Runnable.
    // Переопределить метод run() в обоих таким образом, чтобы при создании и последующем вызове потока
    // 5 раз было выведено в консоль hello world.
    // Создать в классе Main и запустить несколько потоков.



    //2.написать метод, увеличивающий счетчик  от 0 до 1000 и выводящий результат на экран. Метод должен быть создан
    // для использования в режиме многопоточности.
    // Запустить в классе Main.
    // Реализовать двумя способами -  через класс Thread  и интерфейс Runnable


}
