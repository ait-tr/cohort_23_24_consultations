public class Cat {
    private String name;
    private static int catCount;
 //   private  int catCount;

    public Cat(String name){
        this.name = name;
        catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }

    public String getName(){
        return name;
    }

    public  static void setCatCount(int catCount){
       Cat.catCount = catCount;
    }

    //Создать класс калькулятор  Calculator  с пятью действиями - сложить, отнять, умножить,
    // разделить, найти процент
}

