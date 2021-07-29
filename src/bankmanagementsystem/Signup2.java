/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Signup2  extends JFrame implements ActionListener{
   
    JLabel no;
    JLabel Title;
    JLabel Topic;
    JLabel Religion;
    JLabel Category;
    JLabel Income;
    JLabel Educational ;
    JLabel Qualification;
    JLabel Occupation;
    JLabel Pan;
    JLabel Adhar;
    JLabel Senior;
    JLabel Existing;
    JRadioButton r1,r2,r3,r4;
    JComboBox c1,c2,c3,c4,c5;
    JTextField input0,input1,input2,input3;
    JButton next;
    
    
    
    
    
    
    Signup2()
    {
       setSize(1000,1000);
        setLayout(null);
        getContentPane().setBackground(java.awt.Color.WHITE);
          
        no=new JLabel("Form no:");
        no.setBounds(800,50,200,75);
        add(no);
        
        
        
        
        
        Topic=new JLabel("Page 2");
        Topic.setFont(new Font("Candara",Font.BOLD,18));
       Topic.setBounds(450,5, 400,75 );
        add(Topic);
       
         Title=new JLabel("Addiotional Details ");
        Title.setFont(new Font("Algerian",Font.BOLD,24));
        Title.setBounds(325,75,400,100);
           add(Title);
        
         Religion=new JLabel("Religion");
          Religion.setFont(new Font("Arial",Font.BOLD,20));
           Religion.setBounds(100,250,200,100);
           add(Religion);
           
             Category=new JLabel("Category");
          Category.setFont(new Font("Arial",Font.BOLD,20));
           Category.setBounds(100,300,200,100);
           add(Category);
           
             Income=new JLabel("Income");
          Income.setFont(new Font("Arial",Font.BOLD,20));
           Income.setBounds(100,350,200,100);
           add(Income);
        
             Educational=new JLabel("Eduactional");
          Educational.setFont(new Font("Arial",Font.BOLD,20));
           Educational.setBounds(100,400,200,100);
           add(Educational);
        
          Qualification=new JLabel("Qualification");
          Qualification.setFont(new Font("Arial",Font.BOLD,20));
           Qualification.setBounds(100,420,200,100);
           add(Qualification);
           
             Occupation=new JLabel("Occupation");
          Occupation.setFont(new Font("Arial",Font.BOLD,20));
           Occupation.setBounds(100,470,200,100);
           add(Occupation);
        
           Pan=new JLabel("PAN Number");
          Pan.setFont(new Font("Arial",Font.BOLD,20));
           Pan.setBounds(100,520,200,100);
           add(Pan);
           
             Adhar=new JLabel("Adhar Number");
          Adhar.setFont(new Font("Arial",Font.BOLD,20));
           Adhar.setBounds(100,570,200,100);
           add(Adhar);
           
             Senior=new JLabel("Senior Citizen");
          Senior.setFont(new Font("Arial",Font.BOLD,20));
           Senior.setBounds(100,620,200,100);
           add(Senior);
           
             Existing=new JLabel("Existing Category");
          Existing.setFont(new Font("Arial",Font.BOLD,20));
           Existing.setBounds(100,670,200,100);
           add(Existing);
           
            

           String religion[]={"Religion","Hindu","Muslim","Sikh","Christian","Other"};
           c1=new JComboBox(religion);
           c1.setBounds(300,285,400,30);
           add(c1);
           
            String Category[]={"Category","General","OBC","SC","ST","Other"};
           c2=new JComboBox(Category);
           c2.setBounds(300,335,400,30);
           add(c2);
        
            String Income[]={"Income","<1,50,000","<3,50,000","<5,50,000","about 10,00,000","above 10,00,000"};
           c3=new JComboBox(Income);
           c3.setBounds(300,385,400,30);
           add(c3);
           
            String Degree[]={"Degree","Graduate","Post-Graduate","Doctrate","Non-Graduate"};
           c4=new JComboBox(Degree);
           c4.setBounds(300,445,400,30);
           add(c4);
           
            String occupation[]={"Occupation","Buisness","Employed","Non-Employed","Student","Salaried","Other"};
           c5=new JComboBox(occupation);
           c5.setBounds(300,500,400,30);
           add(c5);
           
            input0=new JTextField();
           input0.setFont(new Font("Cambria",Font.BOLD,22));
           input0.setBounds(850,70,100,35);
           add(input0);
           
            input1=new JTextField();
           input1.setFont(new Font("Cambria",Font.BOLD,22));
           input1.setBounds(300,550,400,35);
           add(input1);
           
            input2=new JTextField();
           input2.setFont(new Font("Cambria",Font.BOLD,22));
           input2.setBounds(300,600,400,35);
           add(input2);
           
            r1=new JRadioButton("Yes");
           r2=new JRadioButton("No");
           r1.setBounds(300,650,75,40);
           r2.setBounds(375,650,75,40);
           ButtonGroup rg=new ButtonGroup();
           rg.add(r1);
           rg.add(r2);
           add(r1);
           add(r2);
           
           r3=new JRadioButton("Yes");
           r4=new JRadioButton("No");
           r3.setBounds(300,700,75,40);
           r4.setBounds(375,700,75,40);
           ButtonGroup rg1=new ButtonGroup();
           rg1.add(r3);
           rg1.add(r4);
           add(r3);
           add(r4);
           
            next=new JButton("Next");
           next.setBackground(java.awt.Color.RED);
           next.setForeground(java.awt.Color.BLACK);
           next.setBounds(800,800,100,40);
           add(next);
           
           
           next.addActionListener(this);
        
        setVisible(true);
        
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        String te=input0.getText();
        try
        {
        int a=Integer.parseInt(te);
        
        String religion=(String)c1.getSelectedItem();
        String category=(String)c2.getSelectedItem();
        String income=(String)c3.getSelectedItem();
        String qualification=(String)c4.getSelectedItem();
         String occupation=input1.getText();
            String pan=input2.getText();
         String adhar=input1.getText();
             String senior;
            if(r1.isSelected())
            {
                senior=r1.getText();
            }
            else
            {
                senior=r2.getText();
            }
            
            String existing;
            if(r3.isSelected())
            {
                existing=r3.getText();
            }
            else
            {
                existing=r4.getText();
            }
            
            
        
            conn obj=new conn();
            obj.st.executeUpdate("insert into signup2 values('"+a+"','"+religion+"','"+category+"','"+income+"','"+qualification+"','"+occupation+"','"+pan+"','"+adhar+"','"+senior+"','"+existing+"')");
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup2.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (NumberFormatException ee)
        {
            
        }
        
        
        
        new Signup3();
        dispose();
      
    }
    
    public static void main(String args[])
    {
          Signup2 obj=new Signup2();
        
    }
    
}
