package array.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mobile Number:");
        String mobileString=scanner.nextLine();

        int[] phone_number=new int[10];
Pattern pattern=Pattern.compile("^\\d{10}$");
Matcher matcher=pattern.matcher(mobileString);
if(matcher.find()){

    for(int i=0;i<mobileString.length();i++){

        phone_number[i]=Character.getNumericValue(mobileString.charAt(i));
    }
}
else{
    System.out.println("Enter valid mobile number:");
    System.exit(0);
}

        for (int s:phone_number
             ) {
            System.out.print(s);
        }

        scanner.close();
    }

}
