package threads;

public class OddThread extends Thread{
    @Override
   public void run(){
        for(int i=1;i<=19;i+=2){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
