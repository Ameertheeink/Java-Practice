import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int temp=0;
        int rotate=2;
        System.out.println("before rotation:"+ Arrays.toString(numbers));
     for(int j=0;j<rotate;j++){
         temp=numbers[0];
         for(int i=0;i<numbers.length-1;i++){


             numbers[i]=numbers[i+1];


         }
         numbers[numbers.length-1]=temp;
     }
        System.out.println("after rotation:"+ Arrays.toString(numbers));
    }
}
