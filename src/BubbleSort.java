import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        int n=0;
        int temp=0;
        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the total numbersArray to be sorted:");
//        n=sc.nextInt();
//        int[] numbersArray=new int[n];
//        System.out.println("Enter values:");
        int[] numbersArray={13,32,26,35,10};
//        for(int i=0;i<numbersArray.length;i++){
//            numbersArray[i]=sc.nextInt();
//        }
       System.out.println("before sorting:"+Arrays.toString(numbersArray));
    for(int i=0;i<numbersArray.length-1;i++){
        for(int j=0;j<numbersArray.length-1-i;j++){
            if(numbersArray[j]>numbersArray[j+1]){
             temp=numbersArray[j];
             numbersArray[j]=numbersArray[j+1];
             numbersArray[j+1]=temp;
          }
        }
    }

        System.out.println("After sorting:"+Arrays.toString(numbersArray));


    }
}
