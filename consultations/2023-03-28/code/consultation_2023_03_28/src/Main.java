import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        MaxWithTests m = new MaxWithTests();

        int[] ints = {2};

        System.out.println(m.max(ints));

        LocalTime twentyTwo = LocalTime.of(16,07);
        LocalTime nineteen = twentyTwo.plus(3, ChronoUnit.HOURS);
        System.out.println(nineteen);


    }

}
