public class PlusCalculator {
    //method overloading
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    int add (int a,int b,String action){
        System.out.println("Action is "+action);

        return a+b;
    }

    int add (String action, int a, int b){
        return a+b;
    }
}
