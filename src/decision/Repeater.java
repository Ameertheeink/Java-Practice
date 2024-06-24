package decision;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message : ");
        String message=sc.nextLine();
        System.out.println("Enter number of time message to be repeated : ");
        int count=sc.nextInt();
        for(int i=0;i<=count;i++){
            System.out.println(message);
        }

    }}
