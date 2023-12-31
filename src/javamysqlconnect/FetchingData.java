/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javamysqlconnect;
import java.sql.*;
/**
 *
 * @author user
 */
public class FetchingData {
    
    public static void main(String[] args) {
        
        try{
            
            String sqlQuery = "select * from student  where city = 'Colombo'";
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
            System.out.println("Connected with the database successfully");
                
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            
            ResultSet resultSet =  preparedStatement.executeQuery();
            
            if(resultSet.next()){
            do{
            
                String rollNo = resultSet.getString("ROLLNO");
                String name = resultSet.getString("STUDNAME");
                String dept = resultSet.getString("DEPT");
                String city = resultSet.getString("CITY");
                
             
              
                System.out.println("Roll No = "+ rollNo);
                System.out.println("Name = "+ name);
                System.out.println("Department = "+ dept);
                System.out.println("City = "+ city);
                
              
            
            }while(resultSet.next());
            }else{
            
                    System.out.println("The data your are looking for is not in database");
            
            }
            
            
            
            }catch(SQLException e){
                    
                System.out.println("Error while connecting to the database");    
                    
                    }
            

        }
        
        
    }
    
