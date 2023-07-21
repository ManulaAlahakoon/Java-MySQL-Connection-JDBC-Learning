/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamysqlconnect;

import java.sql.*;

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
        try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
            System.out.println("Connected with the database successfully");
            PreparedStatement preparedtatement = connection.prepareStatement("insert into student values(?,?,?,?)");
            
            preparedtatement.setString(1, "1");
            preparedtatement.setString(2,"Udara Manula");
            preparedtatement.setString(3, "Computer Science");
            preparedtatement.setString(4, "Badulla");
            
            preparedtatement.executeUpdate();
            System.out.println("Data inserted Successfully");
                   
    }catch(SQLException e){
            System.out.println("Error while connecting to the database");
    }
    }
}