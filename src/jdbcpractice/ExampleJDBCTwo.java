package jdbcpractice;

import  java.sql.*;
import java.util.Scanner;

public class ExampleJDBCTwo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your name:");
        String name=sc.next();
        System.out.println("Please enter your Email ID:");
        String email=sc.next();
        System.out.println("Please enter your current city:");
        String location=sc.next();
        System.out.println("Please Enter your id:");
        int id=sc.nextInt();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/user";
            String username="root";
            String password="root";
            Connection connection=DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO userinfo (id, username, email, location) VALUES ('" + id + "','" + name + "','" + email + "','" + location + "')";
            String updateQuery="";
            System.out.println("Query is "+query);
            Statement statement = connection.createStatement();
            int m=statement.executeUpdate(query);
            if(m==1){
                System.out.println("Data updated successfully..");
            }
            else{
                System.out.println("Error");
            }
connection.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
