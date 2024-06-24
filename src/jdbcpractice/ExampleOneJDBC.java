package jdbcpractice;


import java.sql.*;

public class ExampleOneJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/user";
            String username = "root";
            String password = "root";
            int count=1;
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM userinfo where id=2");
            while (resultSet.next()){

                String name=resultSet.getString("username");
                System.out.println("Username "+count +":"+name);
                count++;
            }

            resultSet.close();
            statement.close();
            connection.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
