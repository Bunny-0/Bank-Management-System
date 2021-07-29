/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;
import java.sql.*;

/**
 *
 * @author shubham
 */
public class conn  {
     Connection cn;
    Statement st;
    
       conn() throws ClassNotFoundException, SQLException
       {
            Class.forName("com.mysql.cj.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManage","root","Bunny");
         st=cn.createStatement();
          
           
       } 
      
       
       public static void main(String args[])
       {
    try{
           conn obj=new conn();
       }
    catch(Exception e)
    {
        
    }
       }
           
       }
    
    
    

