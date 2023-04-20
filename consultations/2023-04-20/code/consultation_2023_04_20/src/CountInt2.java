public class CountInt2 extends Thread {
    int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i<1000;i++){
            counter++;
        }
    }
    public int getCounter(){
        return counter;
    }
}
