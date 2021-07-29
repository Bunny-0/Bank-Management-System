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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author shubham
 */
public class Pin extends JFrame implements ActionListener {

    
    JLabel Title,Topic,Current,New,Re;
    JPasswordField input1,input2,input3;
    JButton Save,Back;
    String account;
    
    
                        
    
      Pin(String accnt)
      {
          
          setSize(700,700);
          setLayout(null);
          this.account=accnt;
          Title=new JLabel("PIN Change");
        Title.setFont(new Font("Candara",Font.BOLD,18));
       Title.setBounds(300,0, 400,75 );
        add(Title);
        
        Topic=new JLabel("Change Your PIN");
        Topic.setFont(new Font("Algerian",Font.BOLD,30));
        Topic.setBounds(200,75,600,100);
           add(Topic);
          
            Current=new JLabel("Current PIN :");
        Current.setFont(new Font("Candara",Font.BOLD,24));
       Current.setBounds(100,200, 400,75 );
        add(Current);
        
        New=new JLabel("New PIN :");
        New.setFont(new Font("Candara",Font.BOLD,24));
       New.setBounds(100,275, 400,75 );
        add(New);
        
        Re=new JLabel("Re-Enter New PIN :");
        Re.setFont(new Font("Candara",Font.BOLD,24));
       Re.setBounds(100,350, 400,75 );
        add(Re);
           
        input1=new JPasswordField();
           input1.setFont(new Font("Cambria",Font.BOLD,22));
           input1.setBounds(320,220,200,35);
           add(input1);
           
           input2=new JPasswordField();
           input2.setFont(new Font("Cambria",Font.BOLD,22));
           input2.setBounds(320,290,200,35);
           add(input2);
           
            input3=new JPasswordField();
           input3.setFont(new Font("Cambria",Font.BOLD,22));
           input3.setBounds(320,365,200,35);
           add(input3);
           
            Save=new JButton("Save");
          Save.setBackground(java.awt.Color.BLACK);
           Save.setForeground(java.awt.Color.WHITE);
            Save.setFont(new Font("Candara",Font.BOLD,22));
           Save.setBounds(150,460,150,50);
           add(Save);
           
           Back=new JButton("Back");
          Back.setBackground(java.awt.Color.BLACK);
           Back.setForeground(java.awt.Color.WHITE);
            Back.setFont(new Font("Candara",Font.BOLD,22));
           Back.setBounds(350,460,150,50);
           add(Back);
           
           Save.addActionListener(this);
           Back.addActionListener(this);
          
          
          setVisible(true);
      }
    
    
  
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==Back)
        {
            new Transaction(account);
            dispose();
        }
        if(ae.getSource()==Save)
        {
            try {
                String p1=input1.getText();
                int pi1=Integer.parseInt(p1);
              
               
               
                conn cn=new conn();
                ResultSet rs=cn.st.executeQuery("Select * from bank where Account='"+account+"'");
                if(rs.next())
                {
                    int actual=rs.getInt("Pin");
                    if(actual==pi1)
                    {
                         String p2=input2.getText();
                       int pi2=Integer.parseInt(p2);
                       String p3=input3.getText();
                       int pi3=Integer.parseInt(p3);
                       System.out.println(pi3);
                       if(pi2==pi3)
                       {
                            cn.st.executeUpdate("update bank set pin ='"+pi3+"' where Account='"+account+"'");
                          JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(null,"PIN Doesn't Matched");
                       }
                
                   
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Incorrect PIN!");
                    }
                    
                }
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Pin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Pin.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch(NumberFormatException ee)
            {
                
            }
        }
       
    }
    public static void main(String args[])
    {
     
        Pin obj=new Pin("50409065368272");
    }
    
    
    
}
