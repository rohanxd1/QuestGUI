package AWT_test;

import java.awt.*;
import javax.swing.*;
public class GridLayoutTest extends JFrame
{
	public GridLayoutTest() 
	{
		setLayout(new GridLayout(3,3,20,25));
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
		JButton b6=new JButton("6");
		JButton b7=new JButton("7");
		JButton b8=new JButton("8");
		JButton b9=new JButton("9");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		
		
	}
	public static void main(String[] args) 
	{
		new GridLayoutTest();
	}
}
