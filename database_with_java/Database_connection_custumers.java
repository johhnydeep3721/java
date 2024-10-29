import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;


public class Database_connection_custumers {

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/Custumers";
        String username = "root";
        String password = "root";
        // String insertSQL = "insert into custemer_table(CustumerName, ContactName, Address, City, PostalCode, Country)  VALUES (?, ?, ?, ?, ?, ?)";
        // try{
        //     Connection connection = DriverManager.getConnection(url, username, password);
        //     PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.println("input custumers name: ");
        //     String CustumerName = scanner.nextLine();
        //     System.out.println("int Contact name: ");
        //     String ContactName = scanner.nextLine();
        //     System.out.println("input Address: ");
        //     String Address = scanner.nextLine();
        //     System.out.println("input City: ");
        //     String City = scanner.nextLine();
        //     System.out.println("input postalCode: ");
        //     String PostalCode = scanner.nextLine();
        //     System.out.println("input Contry: ");
        //     String Contry = scanner.nextLine();

        //     preparedStatement.setString(1, CustumerName);
        //     preparedStatement.setString(2, ContactName);
        //     preparedStatement.setString(3, Address);
        //     preparedStatement.setString(4, City);
        //     preparedStatement.setString(5, PostalCode);
        //     preparedStatement.setString(6, Contry);
        //     // System.out.println("Connect successful");
        //     // connection.close();
        //     int rowInserted = preparedStatement.executeUpdate();
        //     if(rowInserted > 0){
        //         System.out.println("A new user updated");
        //     }

        // }catch(SQLException e){
        //     e.printStackTrace();
        // }

        String query ="Select* From custemer_table";
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            System.out.printf("%-5s %-40s %-30s %-30s %-20s %-15s%n",
                "CustomerID", "CustumerName", "ContactName", "Address", "City", "PostalCode", "Country");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");

            while (resultSet.next()) {
                int ID = resultSet.getInt("CustomerID");
                String CustumerName = resultSet.getString("CustumerName");
                String ContactName = resultSet.getString("ContactName");
                String Address = resultSet.getString("Address");
                String City = resultSet.getString("City");
                String PostalCode = resultSet.getString("PostalCode");
                String Country = resultSet.getString("Country");

                System.out.printf("%-5s %-40s %-30s %-30s %-20s %-15s%n",
                ID, CustumerName, ContactName, Address, City, PostalCode, Country);
                
            }
            connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}