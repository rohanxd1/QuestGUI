package AWT_test;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;
public class MenuBar_test 
{
	MenuBar_test()
	{	//if we extending as frame dont need to create frame object
//		setting frame and layout
		Frame f=new Frame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
//		
		MenuBar m=new MenuBar();
		Menu m1=new Menu("File");
		Menu m2=new Menu("Edit");
		
		m.add(m1);
		m.add(m2);
		
		MenuItem mi1=new MenuItem("Open");
		MenuItem mi2=new MenuItem("Save");
		MenuItem mi3=new MenuItem("Copy");
		
		m1.add(mi1);
		m1.add(mi2);
		m2.add(mi3);
		
		f.setMenuBar(m);
		//--
//		Button
		Button b1=new Button("Click Here");
		b1.setBounds(60, 50,100,50);
		f.add(b1);
		//--
//		Label
		Label l1=new Label("This is a Label");
		l1.setBounds(65, 100, 100, 50);
		f.add(l1);
		//--
//		TextField
		TextField tf=new TextField("Enter text");
		tf.setBounds(65,150,90,35);
		f.add(tf);
		
		//
		f.addWindowListener(new WindowAdapter() 
		{
            public void windowClosing(WindowEvent e) 
            {
                f.dispose();
            }
        });
	}
	public static void main(String args[])
	{
		new MenuBar_test();
	}
}
