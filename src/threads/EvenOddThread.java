package threads;

public class EvenOddThread {
    public static void main(String[] args) {
EvenThread et=new EvenThread();
OddThread ot=new OddThread();
et.start();
ot.start();
    }
}
