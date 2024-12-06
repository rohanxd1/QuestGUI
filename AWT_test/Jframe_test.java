package AWT_test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;

public class Jframe_test extends JFrame implements ActionListener
{	JTextField tf;
	JTextField tf2;
	JButton b1;
	JLabel l1;
	public Jframe_test() 
	{
		
		tf=new JTextField(20);
		tf2=new JTextField(20);
		b1=new JButton("Click");
		l1=new JLabel();
		
		add(tf);
		add(tf2);
		add(b1);
		add(l1);
		b1.addActionListener(this);

		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int a=Integer.parseInt(tf.getText());
		int b=Integer.parseInt(tf2.getText());
		int sum=a+b;
		l1.setText(sum+"");
		
	}

	public static void main(String args[])
	{
		Jframe_test j=new Jframe_test();
	}


}
