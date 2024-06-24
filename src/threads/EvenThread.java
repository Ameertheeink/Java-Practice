package threads;

public class EvenThread extends Thread{
    @Override
  public  void run(){
        for(int i=0;i<=20;i+=2){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
