package forEach;
import forEach.Average;
public class ExampleOne {
    public static void main(String[] args) {
int[] number={50,75,34,23,20};
int sum=0;

for(int i:number){
   sum+=i;
}
System.out.println("Average mark is "+sum/number.length);
    }
}
