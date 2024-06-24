package basic;

import java.util.Scanner;

public class SampleTest {
    public static void main(String[] args) {


        String name="";
        int age;
        String mobile="";

        boolean isNameValid=false;
        boolean isageValid=false;
        boolean ismobileValid=false;

        Scanner sc =new Scanner(System.in);

        while(!isNameValid){
            System.out.println("Enter your name:");
            name=sc.nextLine();
            if(!name.isEmpty()){
                break;
            }
            else {
                System.out.println("Name Should not be empty!!!");
            }
        }


        while(!isageValid){
            System.out.println("enter your age:");
        if(sc.hasNextInt()){

        }
        }
        System.out.println("Name is"+name);
    }
}
