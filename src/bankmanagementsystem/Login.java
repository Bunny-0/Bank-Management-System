/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author shubham
 */
public class Login extends JFrame implements ActionListener{
    JLabel topic;
    JLabel Title;
  JLabel card;
  JLabel pin;
  
  JButton signin;
  JButton cancel;
  JButton signup;
  JTextField input1;
  JPasswordField input2;
  
    
    
    Login()
    {
        topic=new JLabel("Bank Mangement System");
        topic.setFont(new Font("Candara",Font.ITALIC,24));
        
        Title=new JLabel("Welcome To ATM");
        Title.setFont(new Font("Algerian",Font.BOLD,28));
        
        card=new JLabel("Card Number");
        card.setFont(new Font("Arial",Font.BOLD,20));
        
        pin=new JLabel("Pin");
        pin.setFont(new Font("Arial",Font.BOLD,20));
      
        input1=new JTextField();
        input2=new JPasswordField();
        
        signin=new JButton("SignIn");
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        
                signup=new JButton("Sign Up");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        
       
       
      setSize(1000,1000);
      setVisible(true);
      setLayout(null);
        topic.setBounds(350,5, 400,75 );
        add(topic);
        Title.setBounds(350,75,400,100);
           add(Title);
        card.setBounds(150,200,200,50);
          add(card);
        input1.setBounds(350,210,400,40);
            add(input1);
        pin.setBounds(150,275,200,50);
           add(pin);
           input2.setBounds(350,285,400,40);
           add(input2);
        signin.setBounds(350,400,100,40);
        add(signin);
        cancel.setBounds(650,400,100,40);
        add(cancel);
         signup.setBounds(500,450,100,40);
        add(signup);
        
        signup.addActionListener(this);
        signin.addActionListener(this);
        cancel.addActionListener(this);
        
                 
 
     
      
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         //To change body of generated methods, choose Tools | Templates.
         try{
         String num=input1.getText();
         String pass=input2.getText();
         
          
         if(ae.getSource()==signup)
         {
             
         new Signup1();
         dispose();
         }
         if(ae.getSource()==cancel)
         {
             System.exit(0);
         }
         if(ae.getSource()==signin)
         {
              conn obj=new conn();
                
              ResultSet rs=  obj.st.executeQuery("select * from bank where Account='"+num+"' and pin='"+pass+"'");
            
              if(rs.next())
              {
                   
                  new Transaction(num);
                  dispose();
              }
              else 
              {
                  JOptionPane.showMessageDialog(null,"Incorrect Account Number or Pin");
              }
             
              
                 
         }
         }
             catch (ClassNotFoundException ex) {
                 Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
             }
             catch(NumberFormatException ee)
             {
                
             }
         }
         
    
    public static void main(String args[])
    {
        Login lg =new Login();
      
    }
    
    
    
    
    
    
    
    
    
    
    
   
    
}
