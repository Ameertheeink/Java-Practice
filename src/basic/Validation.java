package basic;

import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        String name="";
        int age;
        int IDno;
        boolean isValidName=false;
        Scanner sc = new Scanner(System.in);
while(!isValidName){
    System.out.println("enter student name:");
    name=sc.nextLine();
    if(!name.trim().isEmpty()){
        isValidName=false;
        break;
    }
    else {
        System.out.println("enter valid name");
    }
}
while(true){
    System.out.println("Enter your age:");
    if(sc.hasNextInt()){
        age= sc.nextInt();
        if(age>0){
            break;
        }
        else{
            System.out.println("ENter Valid age");
        }
    }
    else{
        System.out.println("Enter valid input");

        sc.next();

    }
}

System.out.println("Candidate names is "+name);
System.out.println("Age of Candidate is "+age);
    }
}