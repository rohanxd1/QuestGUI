package AWT_test;

import java.awt.Color;

import javax.swing.*;
import java.awt.event.*;

public class MouseListenerTest extends JFrame implements MouseListener
{	JLabel l;
	Timer holdTimer;
	boolean isMousePressed;
	boolean isMouseReleased;
	boolean flag;
	MouseListenerTest()
	{
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		
		l=new JLabel("Come Here");
		l.setBounds(100,100,100,100);
		 // Make the background visible
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setVerticalAlignment(SwingConstants.CENTER);
		add(l);
		l.addMouseListener(this);
		
				
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		MouseListenerTest t1=new MouseListenerTest();
	}
	
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		l.setText("Mouse Entered");
		l.setOpaque(true);
		l.setBackground(Color.BLACK);
		l.setForeground(Color.WHITE); 
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		l.setText("Mouse Exited");
//		l.setBackground(Color.WHITE);
		l.setOpaque(false);
		l.setForeground(Color.BLACK);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) 
	{	
		l.setText("Mouse clicked");
		l.setBackground(Color.BLUE);
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		l.setText("Mouse Pressed");
		l.setBackground(Color.RED);
		 isMousePressed = true;

	        // Start a timer to check for 1.5-second hold
		 holdTimer = new Timer(1500, new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent evt) {
			        if (isMousePressed) 
			        {
			            // Execute whatever action you want to happen after 1.5 seconds.
			        	flag=true;
			        	
			        }
			    }
			});
			holdTimer.setRepeats(false); // Ensure the timer runs only once.
			holdTimer.start();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{	
		if(flag)
		{
			l.setText("Mouse Released");
			l.setBackground(Color.GREEN);
			flag=false;
		}
		
	}


}
