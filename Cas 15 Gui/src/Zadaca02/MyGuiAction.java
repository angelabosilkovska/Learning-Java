package Zadaca02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGuiAction implements ActionListener
	{
		static int count=0;
		Button b;
		TextField tf;
		MyGuiAction(Frame f)
		{
			b=new Button("OK");
			b.addActionListener(this);
			tf=new TextField("Hello Java", 20);
			f.setLayout(new FlowLayout());
			f.add(b);
			f.add(tf);
			f.setSize(300,300);
			f.setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b)
			{
				count++;
				System.out.println("Button is Pressed");
				tf.setText("Hello Java Click" +count);
			}
		}
}
