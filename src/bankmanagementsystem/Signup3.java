/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Signup3 extends JFrame implements ActionListener{
    
    JLabel no;
    JLabel Topic;
    JLabel Title;
    JLabel Type,Num,Req,Pin,Note,Note0,input1,input2;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,Note1;
    JTextField input0;
    JButton Submit,Cancel;
    long n,n1,PinNo;
    
    
    
    
    Signup3()
    {
        setSize(1000,1000);
        setLayout(null);
       // getContentPane().setBackground(java.awt.Color.CYAN);
          
        no=new JLabel("Form no:");
        no.setBounds(800,50,200,75);
        add(no);
        
         input0=new JTextField();
           input0.setFont(new Font("Cambria",Font.BOLD,22));
           input0.setBounds(860,70,100,35);
           add(input0);
        
        
        Topic=new JLabel("Page 3");
        Topic.setFont(new Font("Candara",Font.BOLD,18));
       Topic.setBounds(450,5, 400,75 );
        add(Topic);
       
         Title=new JLabel("Accounts Details ");
        Title.setFont(new Font("Algerian",Font.BOLD,24));
        Title.setBounds(325,75,400,100);
           add(Title);
           
            Type=new JLabel("Account Type");
          Type.setFont(new Font("Arial",Font.BOLD,20));
           Type.setBounds(100,200,200,100);
           add(Type);

          r1=new JRadioButton("Saving Account");
           r2=new JRadioButton("FIxed Deposit Account");
           r1.setBounds(300,250,200,40);
           r2.setBounds(500,250,200,40);
           ButtonGroup rg=new ButtonGroup();
           
           r3=new JRadioButton("Corrent Account");
           r4=new JRadioButton("Recurring Deposit Account");
           r3.setBounds(300,300,200,40);
           r4.setBounds(500,300,200,40);
           rg.add(r1);
           rg.add(r2);          
           rg.add(r3);
           rg.add(r4);
           add(r1);
           add(r2);
           add(r3);
           add(r4);
           
            Random rn=new Random();
            n=(rn.nextLong()%90000000L)+50409080000000L;
           n1=Math.abs(n);
          
          long last4=n1%10000;
          long te=(rn.nextLong()%9000L)+1000L;
            PinNo=Math.abs(te);
          
           Num=new JLabel("Card Number  :");
          Num.setFont(new Font("Arial",Font.BOLD,20));
           Num.setBounds(100,350,200,100);
         add(Num);
         
         Note =new JLabel("(Your 16-digit Account Number)");
          Note.setFont(new Font("Arial",Font.PLAIN,12));
           Note.setBounds(100,380,200,100);
         add(Note);
         
          input1=new JLabel("XXXX-XXXX-XXXX-"+last4);
           input1.setFont(new Font("Cambria",Font.BOLD,22));
           input1.setBounds(300,380,400,35);
           add(input1);
           
            input2=new JLabel("XXXX");
           input2.setFont(new Font("Cambria",Font.BOLD,22));
           input2.setBounds(300,450,150,35);
           add(input2);
         
          Pin=new JLabel("PIN");
          Pin.setFont(new Font("Arial",Font.BOLD,20));
           Pin.setBounds(100,420,200,100);
         add(Pin);
         
          Note0 =new JLabel("(Your 4-digit pin)");
          Note0.setFont(new Font("Arial",Font.PLAIN,12));
           Note0.setBounds(100,450,200,100);
         add(Note0);
         
          Req=new JLabel("Service Required");
          Req.setFont(new Font("Arial",Font.BOLD,20));
           Req.setBounds(100,490,200,100);
         add(Req);
         
         c1=new JCheckBox("ATM CARD");
         c1.setFont(new Font("Arial",Font.BOLD,16));
         c1.setBounds(150,570,200,50);
         add(c1);
         
          c2=new JCheckBox("Mobile Banking");
         c2.setFont(new Font("Arial",Font.BOLD,16));
         c2.setBounds(150,620,200,50);
         add(c2);
         
          c3=new JCheckBox("Cheque Book");
         c3.setFont(new Font("Arial",Font.BOLD,16));
         c3.setBounds(150,670,200,50);
         add(c3);
         
          c4=new JCheckBox("Internet Banking");
         c4.setFont(new Font("Arial",Font.BOLD,16));
         c4.setBounds(400,570,200,50);
         add(c4);
         
          c5=new JCheckBox("Email Alert");
         c5.setFont(new Font("Arial",Font.BOLD,16));
         c5.setBounds(400,620,200,50);
         add(c5);
         
          c6=new JCheckBox("E-Statement");
         c6.setFont(new Font("Arial",Font.BOLD,16));
         c6.setBounds(400,670,200,50);
         add(c6);
         
           Note1=new JCheckBox("I hereby declares that the above filled  details is correct to the best of my knowlegde");
          Note1.setFont(new Font("Arial",Font.PLAIN,12));
           Note1.setBounds(100,730,600,100);
         add(Note1);
         
          Submit=new JButton("Submit");
           Submit.setBackground(java.awt.Color.RED);
           Submit.setForeground(java.awt.Color.BLACK);
           Submit.setBounds(250,830,100,40);
           add(Submit);
                     Cancel=new JButton("Cancel");
           Cancel.setBackground(java.awt.Color.RED);
           Cancel.setForeground(java.awt.Color.BLACK);
           Cancel.setBounds(550,830,100,40);
           add(Cancel);
           
          
         
       Submit.addActionListener(this);
       Cancel.addActionListener(this);
        
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae)  {
        
        try{
            
        if(ae.getSource()==Cancel)
        {
            System.exit(0);
        }
        
        if(Note1.isSelected())
        {
            
        
        
  
        
       String temp=input0.getText();
   
       int id=Integer.parseInt(temp);
       String type;
      
       if(r1.isSelected())
       {
           type="Saving account";
       }
       else if(r2.isSelected())
       {
           type="Fixed Deposit account";
       }
       else if(r3.isSelected())
       {
           type="Current account";
       }
       else 
       {
           type="Recurring Deposit account";
       }
     Long p=n1;
     String card=p.toString();
       
       long pin=PinNo;
       String Require="";
       
       if(c1.isSelected())
       {
           Require=Require+c1.getText()+",";
       }
       if(c2.isSelected())
       {
           Require=Require+c2.getText()+",";
       }
       if(c2.isSelected())
       {
           Require=Require+c2.getText()+",";
       }
       if(c3.isSelected())
       {
           Require=Require+c3.getText()+",";
       }
       if(c4.isSelected())
       {
           Require=Require+c4.getText()+",";
       }
       if(c5.isSelected())
       {
           Require=Require+c5.getText()+",";
       }
       if(c6.isSelected())
       {
           Require=Require+c6.getText()+",";
       }
       int amount=0;
      
     conn obj=new conn();
     obj.st.executeUpdate("insert into signup3 values('"+id+"','"+type+"','"+card+"','"+pin+"','"+Require+"') ");
     obj.st.executeUpdate("insert into bank values('"+card+"','"+pin+"','"+amount+"')");
      
       JOptionPane.showMessageDialog(null,"Your Card Number is :"+n1 +"\n pin :"+pin);
     new Login();
     dispose();
        
        
        
        
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Tick the Declaration Box");
        }
       }
        
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup3.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch(NumberFormatException ee)
       {
       }
        
        
        
        
        
        
        
    }
    public static void main(String srgs[])
    {
        Signup3 obj=new Signup3();
    }
}
