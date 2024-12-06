package AWT_test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class addSubButtonLambda extends JFrame
{	JTextField tf1;
	JLabel l1;
	JTextField tf2;
	JLabel l2;
	
	JButton b1;
	JLabel lsum;
	JButton b2;
	JLabel ldiff;
	public addSubButtonLambda() 
	{	
		l1=new JLabel("Enter number 1:");
		l1.setBounds(45,40,150,20);
		add(l1);
		
		tf1=new JTextField();
		tf1.setBounds(20,60,150,20);
		add(tf1);
		
		l2=new JLabel("Enter number 2:");
		l2.setBounds(225,40,150,20);
		add(l2);
		
		tf2=new JTextField(20);
		add(tf2);
		tf2.setBounds(200,60,150,20);
		
		b1=new JButton("Add");
		add(b1);
		b1.setBounds(120,100,60,25);
		
		lsum=new JLabel();
		add(lsum);
		lsum.setBounds(200,101,60,25);
		
		b2=new JButton("Sub");
		add(b2);
		b2.setBounds(120,150,60,25);
		
		ldiff=new JLabel();
		add(ldiff);
		ldiff.setBounds(200,151,60,25);
		
		b1.addActionListener((e)->{
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int sum=a+b;
			lsum.setText(sum+"");
		});
		
		b2.addActionListener((e)->{
			int a=Integer.parseInt(tf1.getText());
			int b=Integer.parseInt(tf2.getText());
			int diff=a-b;
			ldiff.setText(diff+"");
		});
		
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String args[])
	{
		addSubButtonLambda a=new addSubButtonLambda();
	}

}
