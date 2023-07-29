/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamysqlconnect;

import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class JavaMySQLConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int rollNo = scan.nextInt();
        
        
        try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
            System.out.println("Connected with the database successfully");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student values(?,?,?,?)");
            
            preparedStatement.setInt(1, rollNo);
            preparedStatement.setString(2,"Ravishan");
            preparedStatement.setString(3, "Information Technology");
            preparedStatement.setString(4, "Anuradhapura");
            
            preparedStatement.executeUpdate();
            System.out.println("Data inserted Successfully");
                   
    }catch(SQLException e){
            System.out.println("Error while connecting to the database");
    }
    }
}
