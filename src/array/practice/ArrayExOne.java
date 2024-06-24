package array.practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayExOne {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number to be entered!:");
        int size= sc.nextInt();
        int[] a=new int[size] ;
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the value of "+(i+1)+":");
        a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

    }
}
