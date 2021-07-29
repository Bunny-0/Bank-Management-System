/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

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
import javax.swing.JTextField;

/**
 *
 * @author shubham
 */
public class Deposit extends JFrame implements ActionListener {
    
    
    JLabel Title;
    JLabel Topic1;
    JLabel Topic2;
    JTextField input1,input0;
    JButton Deposit,Back,Exit;
    String acnt;
    int amount;

    
    Deposit(String num)
    {
        setSize(800,800);
        setLayout(null);
        this.acnt=num;
        
         Title=new JLabel("Deposit");
        Title.setFont(new Font("Candara",Font.BOLD,18));
       Title.setBounds(350,5, 400,75 );
        add(Title);
        
        Topic1=new JLabel("ENTER THE AMOUNT YOU WANT");
        Topic1.setFont(new Font("Algerian",Font.BOLD,30));
        Topic1.setBounds(120,75,600,100);
           add(Topic1);
           
             Topic2=new JLabel("TO DEPOSIT");
        Topic2.setFont(new Font("Algerian",Font.BOLD,30));
        Topic2.setBounds(250,115,600,100);
           add(Topic2);
           
           input1=new JTextField();
           input1.setFont(new Font("Cambria",Font.BOLD,22));
           input1.setBounds(175,195,400,50);
           add(input1);
           
            Deposit=new JButton("Deposit");
           Deposit.setBackground(java.awt.Color.RED);
           Deposit.setForeground(java.awt.Color.BLACK);
           Deposit.setBounds(210,275,150,60);
           add(Deposit);
                    Back=new JButton("Cancel");
           Back.setBackground(java.awt.Color.RED);
           Back.setForeground(java.awt.Color.BLACK);
           Back.setBounds(410,275,150,60);
           add(Back);
           
           
           Exit=new JButton("Exit");
           Exit.setBackground(java.awt.Color.RED);
           Exit.setForeground(java.awt.Color.BLACK);
           Exit.setBounds(310,375,150,60);
           add(Exit);
           
           Deposit.addActionListener(this);
           Exit.addActionListener(this);
           Back.addActionListener(this);
        
        
        
        setVisible(true);
    }
  

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        try {
            conn cn=new conn();
            if(ae.getSource()==Exit)
            {
                System.exit(0);
            }
            if(ae.getSource()==Back)
            {
                new Transaction(acnt);
                dispose();
            }
            if(ae.getSource()==Deposit)
            {
                String temp=input1.getText();
                 amount=Integer.parseInt(temp);
                String temp1=JOptionPane.showInputDialog(null,"Enter the pin");
                int pinn=Integer.parseInt(temp1);
                ResultSet rs=  cn.st.executeQuery("select balance from bank where Account='"+acnt+"' and pin='"+pinn+"'");
                System.out.println("yes");
           if(rs.next())
           {
               int bal=rs.getInt("balance");
               int new_bal=bal+amount;
               cn.st.executeUpdate("update bank set balance ='"+new_bal+"' where Account='"+acnt+"'");
               JOptionPane.showMessageDialog(null,"Amount Deposited Successfully");
               
                
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Incorrect Pin!");
           }
            }
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
       
        
        
        
        
        
    }
    
    public static void main(String args[])
    {
        Deposit obj=new Deposit("50409065368272");
        
    }
    
    
}
