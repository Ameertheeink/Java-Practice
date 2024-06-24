package threads;

public class SampleThread{

    public static void main(String[] args) {
        MyThread thread=new MyThread();
        MyThreadOne t=new MyThreadOne();
       // thread.start();
//        for(int i =0;i<10;i++){
//            System.out.println("Main THREAD");
//
//        }
//
        t.start();
        System.out.println("Main THREAD");

   }


}
