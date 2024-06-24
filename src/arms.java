import java.util.ArrayList;

public class arms {

    public static void main(String[] args) {
       System.out.println( squareDigit(9119));

    }
    public static String squareDigit(int num){
        ArrayList<Integer> data=new ArrayList<>();
        while(num!=0){
            int a=num%10;
           data.add(a);
            num=num/10;





        }


        return data.get(2)+"-"+data.get(1)+"-"+data.get(0);
    }
}
