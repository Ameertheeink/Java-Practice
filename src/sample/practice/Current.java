package sample.practice;

public class Current {

    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Current Thread"+t.getName());
    }
}
