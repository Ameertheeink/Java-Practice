package threads;

public class MyThreadOne extends Thread{
//    public void run(){
//        System.out.println("no-arg-method");
//    }
//    public void run(int i){
//        System.out.println("int-arg-method");
//    }

    public void start(){
        super.start();
        System.out.println("start-method");
    }
    public void run(){
        System.out.println("run-method");
    }
}
