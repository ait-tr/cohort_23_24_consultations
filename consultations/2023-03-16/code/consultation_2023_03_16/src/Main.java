public class Main {

    public static void main(String[] args) {


        Week monday = Week.MONDAY;
        System.out.println(monday);

        for (Week dayOfWeek : Week.values())
        System.out.println(dayOfWeek);

    //    String day = "MONDAY";
    //    Week mondayEnum = Week.valueOf(day);
    //    System.out.println(mondayEnum);

        Week day=Week.MONDAY;

        switch (day)  {
            case MONDAY:
                System.out.println("Today is Monday");
                break;

            case SUNDAY:
                System.out.println("Today is Sunday");
        }


    }
}
