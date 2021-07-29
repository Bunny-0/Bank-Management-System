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
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author shubham
 */
public class Signup1 extends JFrame implements ActionListener{
    
    
    
    JLabel Topic;
    JLabel Title;
    JLabel Info;
    JLabel Name;
    JLabel FName;
    JLabel DOB;
    JLabel Gender;
    JLabel Email;
    JLabel Marital;
    JLabel Add;
    JLabel City;
    JLabel Code;
    JLabel State;
    JTextField input1;
    JTextField input2;
    JTextField input3;
    JTextField input4;
    JTextField input5;
    JTextField input6;
    JTextField input7;
    JComboBox c1,c2,c3,c4;
    JRadioButton r1,r2,r3,r4,r5;
    JButton next;
    long n;
    
    
       
            
    Signup1()
    {
       
        setSize(1000,1000);
        setLayout(null);
        getContentPane().setBackground(java.awt.Color.WHITE);
      
        Topic=new JLabel("New Account Application Form");
        Topic.setFont(new Font("Candara",Font.BOLD,18));
       Topic.setBounds(350,5, 400,75 );
        add(Topic);
        
          Random no=new Random();
         long n1=(no.nextLong()%9000L)+1000L;
         n=Math.abs(n1);
        
         Title=new JLabel("Application Form "+n);
        Title.setFont(new Font("Algerian",Font.BOLD,24));
        Title.setBounds(325,75,400,100);
           add(Title);
           
           Info=new JLabel("Personal Information");
           Info.setFont(new Font("Candara",Font.BOLD,22));
           Info.setBounds(365,150,400,100);
           add(Info);
           
           Name=new JLabel("Name");
           Name.setFont(new Font("Arial",Font.BOLD,20));
           Name.setBounds(100,250,200,100);
           add(Name);
           
          
           
            FName=new JLabel("Father's Name");
           FName.setFont(new Font("Arial",Font.BOLD,20));
           FName.setBounds(100,300,300,100);
           add(FName);
           
            DOB=new JLabel("Date Of Birth");
           DOB.setFont(new Font("Arial",Font.BOLD,20));
           DOB.setBounds(100,365,300,100);
           add(DOB);
           
            Gender=new JLabel("Gender");
           Gender.setFont(new Font("Arial",Font.BOLD,20));
           Gender.setBounds(100,415,300,100);
           add(Gender);
           
            Email=new JLabel("Email ID");
           Email.setFont(new Font("Arial",Font.BOLD,20));
           Email.setBounds(100,475,300,100);
           add(Email);
           
            Marital=new JLabel("Marital Status");
           Marital.setFont(new Font("Arial",Font.BOLD,20));
           Marital.setBounds(100,525,300,100);
           add(Marital);
           
            Add=new JLabel("Address");
           Add.setFont(new Font("Arial",Font.BOLD,20));
           Add.setBounds(100,575,300,100);
           add(Add);
           
            City=new JLabel("City");
           City.setFont(new Font("Arial",Font.BOLD,20));
           City.setBounds(100,625,300,100);
           add(City);
           
           
            Code=new JLabel("Pin Code");
           Code.setFont(new Font("Arial",Font.BOLD,20));
           Code.setBounds(100,675,300,100);
           add(Code);
       
            State=new JLabel("State");
           State.setFont(new Font("Arial",Font.BOLD,20));
           State.setBounds(100,725,300,100);
           add(State);
           
           input1=new JTextField();
           input1.setFont(new Font("Cambria",Font.BOLD,22));
           input1.setBounds(300,270,400,40);
           input1.setBackground(java.awt.Color.BLACK);
           input1.setForeground(java.awt.Color.white);
           add(input1);
           
           input2=new JTextField();
           input2.setFont(new Font("Arial",Font.BOLD,22));
           input2.setBounds(300,330,400,40);
           input2.setBackground(java.awt.Color.BLACK);
           input2.setForeground(java.awt.Color.white);
         
           add(input2);
           
           String date[]={"Day","1","2","3","4","5","6","7","8","9","10"};
           c1=new JComboBox(date);
           String month[]={"Month","Janaury","February","March","April","May","June","July","August","September","October","November","December"};
           c2=new JComboBox(month);
           String year[]={"Year","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014"};
           c3=new JComboBox(year);
           c1.setBounds(300,390,50,40);
           c2.setBounds(360,390,75,40);
           c3.setBounds(445,390,75,40);
           add(c1);
           add(c2);
           add(c3);
           
           r1=new JRadioButton("Male");
           r2=new JRadioButton("Female");
           r1.setBounds(300,440,75,40);
           r2.setBounds(375,440,75,40);
           ButtonGroup rg=new ButtonGroup();
           rg.add(r1);
           rg.add(r2);
           add(r1);
           add(r2);
           
           input4=new JTextField();
           input4.setFont(new Font("Arial",Font.BOLD,22));
           input4.setBounds(300,500,400,40);
           input4.setBackground(java.awt.Color.BLACK);
           input4.setForeground(java.awt.Color.white);
           add(input4);
           
           r3=new JRadioButton("Married");
           r4=new JRadioButton("Single");
           r3.setBounds(300,550,75,40);
           r4.setBounds(375,550,75,40);
           ButtonGroup rg1=new ButtonGroup();
           rg1.add(r3);
           rg1.add(r4);
           add(r3);
           add(r4);
           
            input5=new JTextField();
           input5.setFont(new Font("Arial",Font.BOLD,22));
           input5.setBounds(300,600,400,40);
           input5.setBackground(java.awt.Color.BLACK);
           input5.setForeground(java.awt.Color.white);
           add(input5);
           
           input6=new JTextField();
           input6.setFont(new Font("Arial",Font.BOLD,22));
           input6.setBounds(300,650,400,40);
           input6.setBackground(java.awt.Color.BLACK);
           input6.setForeground(java.awt.Color.white);
           add(input6);
           
           input7=new JTextField();
           input7.setFont(new Font("Arial",Font.BOLD,22));
           input7.setBounds(300,700,150,40);
           input7.setBackground(java.awt.Color.BLACK);
           input7.setForeground(java.awt.Color.white);
           add(input7);
           
           String state[]={"State","Bihar","Jharkhand","Himachar pradesh","Uttar pradesh","Delhi","Maharastra","Odisha","Arunachal Pradesh","j & k","Karnataka","Rajastan","Gujrat"};
           c4=new JComboBox(state);
           c4.setBounds(300,750,140,40);
           add(c4);
           
           next=new JButton("Next");
           next.setBackground(java.awt.Color.RED);
           next.setForeground(java.awt.Color.BLACK);
           next.setBounds(800,800,100,40);
           add(next);
           next.addActionListener(this);
           
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
             setVisible(true);
         
         
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        try {
            conn obj=new conn();
            long id=n;
            String name=input1.getText();
            String fname=input2.getText();
            String date=(String)c1.getSelectedItem()+"-"+c2.getSelectedItem()+"-"+ c3.getSelectedItem();
            String gender;
            if(r1.isSelected())
            {
                gender=r1.getText();
            }
            else
            {
                gender=r2.getText();
            }
            String mail=input4.getText();
            String status;
            if(r3.isSelected())
            {
                status=r3.getText();
            }
            else
            {
                status=r4.getText();
            }
            String address=input5.getText();
            String city=input6.getText();
           String code=input7.getText();
            String state=(String)c4.getSelectedItem();
            obj.st.executeUpdate(" insert into signup1 values("+id+",'"+name+"','"+fname+"','"+date+"','"+gender+"','"+mail+"','"+status+"','"+address+"','"+city+"','"+567+"','"+state+"');");
           
           new Signup2();
           dispose();
           

            
             
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        
        
        
    }
    
    public static void main(String args[])
    {
        Signup1 sg=new Signup1();
      
         
      
    }
    
}
