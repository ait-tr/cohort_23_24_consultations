import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
   /* Есть класс BankAccount c  полями  String IBAN  и String owner
    Написать метод, возвращающий лист  IBAN  со звездочками после третьего символа
       [DE7****************, DE2****************]
    List<String> replaceWithStars ( List<BankAccount> input)*/
   public static void main(String[] args) {
       List<String> list = Arrays.asList("Peter","Johny","Peter","Ann");
       System.out.println(namesByLength(list));
       System.out.println(partitioningList(list));

       BankAccount bankAccount1 = new BankAccount("DE765849494949494949","owner1");
       BankAccount bankAccount2 = new BankAccount("DE565849494949494949","owner2");
       BankAccount bankAccount3 = new BankAccount("DE365849494949494949","owner3");
       BankAccount bankAccount4 = new BankAccount("DE165849494949494949","owner4");
       BankAccount bankAccount5 = new BankAccount("DE965849494949494949","owner5");
       List<BankAccount> accounts = List.of(bankAccount1,bankAccount2,bankAccount3,bankAccount4,bankAccount5);
       System.out.println(replaceWithStars(accounts));
   }

  public static   List<String> replaceWithStars (List<BankAccount> input){
        return input
                .stream()
                .map(a->stars(a.getIBAN()))
                .collect(Collectors.toList());
    }

    private static String stars(String input){
      char[] chars = input.toCharArray();
      for( int i = 3; i < input.length(); i++)
          chars[i] = '*';
      return new String(chars);
    }

    // Есть список стрингов. Написать метод, который сгруппирует
    // элементы этого листа в зависимости от длины строки и полученный результат поместит в сеты.
    //т.е. длина строки - это ключ а строки такой длины значения. Метод возвращает мапу
    // Peter,Johny,Peter,Ann
    //{5 =[Peter,Jonny], 3 = [Ann]}

    public  static Map<Integer, Set<String>> namesByLength (List<String>list){
        return list.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.toSet()));
    }

    // написать метод, который разделяет элементы по принципу длины строки - если длина строки больше 3, то
    //то ключом будет true или false  а значением сет соответствующих элементов . Метод возвращает мапу
    public static  Map<Boolean,Set<String>> partitioningList(List<String>list){
       return list.stream()
               .collect(Collectors.partitioningBy(s->s.length()>3,Collectors.toSet()));
    }

    public static Set<String> convertToSet(List<String>list){
       return  list.stream()
               .collect(Collectors.collectingAndThen(Collectors.toList(),Set::copyOf));
    }

    //есть лист имен , написать метод, обьединяющий имена из листа  и возвращающий такую строку:
    //Students: name1, name2,name3 study Java

    // Есть класс BankAccount  с полем String IBAN  и класс Person  с полями name и List<BankAccount>. Написать
    // метод, возвращающий список IBANs   со звездочками после третьего символа.
}
