public class Main {
    //2. abc ->  +3
    //  abcdefghi
    //def
    // xyz -> abc
    //Написать метод, принимающий слово из английских маленьких букв и шифрующий
    // его по методу цезаря. Использовать StringBuilder

    //abc ->
    // sb
    // for
    // a+3 =d   sb.append(d)
    // b +3 = e  sb.append(e)
    // c + 3 = f sb.append(f)
    // return sb
    //def
    public static void main(String[] args) {
        System.out.println(ceasarCode("az",3));
        int a = 10;
        int b = 5;

        int max = a>b? a : b;


        if(a>b)
            max = a;
        else max = b;

        //написать такую лямбду, используя интерфейс Checkable:
        // если длина строки четная вернуть true  иначе false


        Integer.toString(10);
        Checkable checkable = s -> s.length()%2 == 0;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

        //написать лямбда -выражение, такое что строка возвращается в верхнем регистре
        Transformable transformable = s->s.toUpperCase();
        System.out.println(transformable.modify("abcDe"));
    }
    public static String ceasarCode(String code, int move){
        StringBuilder codedString = new StringBuilder();
        int lastCharValue = 'z';//122
        int alphabetLength = 'z'-'a'+1; // a = 097
        System.out.println("alphabet length = "+alphabetLength);
        System.out.println("lastCharValue = "+lastCharValue);
//az
        for( char character: code.toCharArray()){
            int charNoRotation = character +move;//z+3 = 125
            System.out.println("charNoRotation = "+charNoRotation);

            int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation -alphabetLength;
            codedString.append((char) charValue);
        }
        return new String(codedString);
    }
}
