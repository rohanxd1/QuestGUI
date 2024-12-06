package AWT_test;

import java.awt.*;
import javax.swing.*;

public class RadioHeadTest extends JFrame 
{

    RadioHeadTest() 
    {
        setLayout(null);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel lab=new JLabel("Enter Name");
        lab.setBounds(61,26,200,30);
        add(lab);
        
        // Text field
        JTextField nameField = new JTextField(20);
        nameField.setBounds(60, 50, 200, 30);  
        add(nameField);

        // Male radio button
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(60, 100, 100, 30); 
        add(male);

        // Female radio button
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(160, 100, 100, 30); 
        add(female);

        // Grouping radio buttons
        ButtonGroup gender = new ButtonGroup();
        gender.add(female);
        gender.add(male);
        
        JCheckBox football=new JCheckBox("Football");
        football.setBounds(60,150,100,30);
        add(football);
        
        JCheckBox basketball=new JCheckBox("Basketball");
        basketball.setBounds(160,150,100,30);
        add(basketball);

       
        // Submit button
        JButton submit = new JButton("Submit");
        submit.setBounds(60, 200, 100, 30); 
        add(submit);
        
        JLabel l1 = new JLabel("Mr./Mrs.");
        l1.setBounds(175, 200, 200, 30); 
        add(l1);
        
        JLabel sport=new JLabel();
        sport.setBounds(60,250,200,30);
        add(sport);
       
        football.addItemListener((e)->{
        	
        	if(football.isSelected())
        	{
        		System.out.println("Football");
        	}
        });
        
        basketball.addItemListener((e)->{
        	
        	if(basketball.isSelected())
        	{
        		System.out.println("Basketball");
        	}
        });
        
        submit.addActionListener((a) -> 
        {	String name="";
            name = nameField.getText();
            if (male.isSelected())
            {
                l1.setText("Mr." + name);
                name="Mr "+name;
            } else if (female.isSelected()) 
            {
                l1.setText("Mrs. " + name);
                name="Mrs."+name;
            } else 
            {
                l1.setText("Please select a gender");
            }
            
            if(football.isSelected())
            {
            	sport.setText(name+" plays football");
            }
            else if (basketball.isSelected())
            {
            	sport.setText(name+" plays basketball");
            }
            else if(!football.isSelected() && !basketball.isSelected())
            {
            	sport.setText("");
            }
            else if(football.isSelected() && basketball.isSelected())
            {
            	sport.setText(name+ "plays both football and basketball");
            }
            
        });
    }

    public static void main(String[] args) 
    {
        new RadioHeadTest();
    }
}
