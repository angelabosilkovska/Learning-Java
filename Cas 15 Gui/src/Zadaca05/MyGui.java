package Zadaca05;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui implements ActionListener{
	static int count=0;
	Button b,b1;
	TextField tf, tf1, tf2,tf3,tf4,tf5;
	MyGui(Frame f)
	{
		tf=new TextField("Name");
		tf1=new TextField("Surname");
		tf2=new TextField("Age");
		tf3=new TextField("Gender");
		tf4=new TextField("Username");
		tf5=new TextField("Password");
		f.setLayout(new FlowLayout());
		Panel p=new Panel();
		p.add(tf);
		p.add(tf1);
		Panel p1=new Panel();
		p1.add(tf2);
		p1.add(tf3);
		Panel p2=new Panel();
		p2.add(tf4);
		p2.add(tf5);
		Panel p3=new Panel();
		b=new Button("Register");
		b.addActionListener(this);
		p3.add(b);
		p3.add(new Button("Cancel"));
		f.add(p);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			count++;
			System.out.println("Button is Pressed");
			tf.setText("Enter Name");
			tf1.setText("Enter Surname");
			tf2.setText("Enter Age");
			tf3.setText("Enter Gender");
			tf4.setText("Enter Username");
			tf5.setText("Enter Password");
		}
	}
}
