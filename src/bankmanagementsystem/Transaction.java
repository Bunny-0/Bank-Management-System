/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

import com.mysql.cj.protocol.Resultset;
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

/**
 *
 * @author shubham
 */
public class Transaction extends JFrame implements ActionListener {
    
    
       JLabel Title,Topic;
       JButton Deposit,Withdrawal,Fast,Mini,Pin,Balance,Exit;    
       String account;
    
    
    
    Transaction(String num)
    {
        setSize(800,800);
        setLayout(null);
        this.account=num;
      
         Topic =new JLabel("Transaction");
            Topic.setFont(new Font("Candara",Font.BOLD,18));
        Topic.setBounds(350,5,600,60);
        
        add(Topic);
        
        Title =new JLabel("Please Select Your Transaction");
        Title.setBounds(150,100,600,40);
         Title.setFont(new Font("Algerian",Font.BOLD,28));
        add(Title);
        
      Deposit=new JButton("Deposit");
          Deposit.setBackground(java.awt.Color.BLACK);
           Deposit.setForeground(java.awt.Color.WHITE);
            Deposit.setFont(new Font("Candara",Font.BOLD,22));
           Deposit.setBounds(180,200,200,90);
           add(Deposit);
           
           Fast=new JButton("Fast Cash");
          Fast.setBackground(java.awt.Color.BLACK);
           Fast.setForeground(java.awt.Color.WHITE);
            Fast.setFont(new Font("Candara",Font.BOLD,22));
           Fast.setBounds(180,320,200,90);
           add(Fast);
           
            Pin=new JButton("Pin Change");
          Pin.setBackground(java.awt.Color.BLACK);
           Pin.setForeground(java.awt.Color.WHITE);
            Pin.setFont(new Font("Candara",Font.BOLD,22));
           Pin.setBounds(180,440,200,90);
           add(Pin);
            Withdrawal=new JButton("Cash Withdrawal");
          Withdrawal.setBackground(java.awt.Color.BLACK);
           Withdrawal.setForeground(java.awt.Color.WHITE);
            Withdrawal.setFont(new Font("Candara",Font.BOLD,22));
           Withdrawal.setBounds(440,200,200,90);
           add(Withdrawal);
           
           Mini=new JButton("Mini Statement");
          Mini.setBackground(java.awt.Color.BLACK);
           Mini.setForeground(java.awt.Color.WHITE);
            Mini.setFont(new Font("Candara",Font.BOLD,22));
           Mini.setBounds(440,320,200,90);
           add(Mini);
           
            Balance=new JButton("Balance Enquiry");
          Balance.setBackground(java.awt.Color.BLACK);
           Balance.setForeground(java.awt.Color.WHITE);
            Balance.setFont(new Font("Candara",Font.BOLD,22));
           Balance.setBounds(440,440,200,90);
           add(Balance);
           
            Exit=new JButton("Exit");
          Exit.setBackground(java.awt.Color.BLACK);
           Exit.setForeground(java.awt.Color.WHITE);
            Exit.setFont(new Font("Candara",Font.BOLD,22));
           Exit.setBounds(320,550,200,90);
           add(Exit);
           
           Exit.addActionListener(this);
           Balance.addActionListener(this);
           Mini.addActionListener(this);
           Fast.addActionListener(this);
           Withdrawal.addActionListener(this);
           Deposit.addActionListener(this);
           Pin.addActionListener(this);
           
        setVisible(true);
    }
    
    
 
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
   try {
               
        conn cn=new conn();
             
        if(ae.getSource()==Deposit)
        {
            new Deposit(account);
            dispose();
        }
        if(ae.getSource()==Fast)
        {
            
        }
        if(ae.getSource()==Pin)
        {
            new Pin(account);
            dispose();
            
        }
        if(ae.getSource()==Withdrawal)
        {
            new Withdrawal(account);
            dispose();
            
        }
        if(ae.getSource()==Mini)
        {
            
        }
        if(ae.getSource()==Balance)
        {
            String i=JOptionPane.showInputDialog(null,"Enter the pin");
            int pinn=Integer.parseInt(i);
           ResultSet rs=  cn.st.executeQuery("select balance from bank where Account='"+account+"' and pin='"+pinn+"'");
           if(rs.next())
           {
               int bal=rs.getInt("balance");
               JOptionPane.showMessageDialog(null,bal);
           }
            
           
            
        }
        if(ae.getSource()==Exit)
        {
            System.exit(0);
        }
        
        
           }
           catch (ClassNotFoundException ex) {
               Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
           }
            catch(NumberFormatException ee)
            {
                
            }
        
        
        
    }
    
    public static void main(String args[])
    {
        Transaction obj=new Transaction("");
       
    }
    
}
