import java.util.Arrays;
import java.util.Scanner;

public class Insertion {

    public static void main(String[] args) {
        int n=0;
        int temp=0;
        Scanner sc =new Scanner(System.in);
//
        int[] numbers={2,56,42,31,67,10,4,8,100};
//
        System.out.println("before sorting:"+ Arrays.toString(numbers));
for(int i=1;i<numbers.length;i++){
    temp=numbers[i];
int j=i-1;
while(j>=0 && numbers[j]>temp){
    numbers[j+1]=numbers[j];
    j=j-1;
}
numbers[j+1]=temp;
}

        System.out.println();
        System.out.println("After sorting:"+Arrays.toString(numbers));


    }
}
