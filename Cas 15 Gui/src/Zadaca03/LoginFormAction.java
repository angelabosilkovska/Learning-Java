package Zadaca03;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFormAction implements ActionListener{
	static int count=0;
	Button b;
	TextField tf, tf1;
	LoginFormAction(Frame f)
	{
		b=new Button("Login");
		b.addActionListener(this);
		tf=new TextField("Username");
		tf1=new TextField("Password");
		f.setLayout(new FlowLayout());
		f.add(b);
		f.add(tf);
		f.add(tf1);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			count++;
			System.out.println("Button is Pressed");
			tf.setText("Enter Username");
			tf1.setText("Enter Password");
		}
	}
}
