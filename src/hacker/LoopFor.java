package hacker;

public class LoopFor {
    public static void main(String[] args) {
        int a=0;
        int b=2;
        int n=10;
        int result1=1;
        int result2=1;
        for(int i=0;i<=n;i++){
result1 =(int) Math.pow(b, i);
            System.out.println("Result1:"+result1);
result2=(a+b*result1);
          System.out.println("Result:"+result2);
        }
      System.out.println(result1);
    }
}
