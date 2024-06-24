import java.util.Scanner;

public class SampleMarkCalc {
    public static void main(String[] args) {
        int n=0;
       int total=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of Subjects you have:");
        n=sc.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the mark of Subjects "+i+1+": ");
            marks[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++){
            total=total+marks[i];
        }
        System.out.println("Total marks scored:"+total);
        System.out.println("Percentage Scored:"+((total)*100/(n*100))+"%");

    }
}
