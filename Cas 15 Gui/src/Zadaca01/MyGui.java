 package Zadaca01;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class MyGui {

	public static void main(String[] args) {
		Frame f=new Frame("My Frame");
		Button b=new Button("OK");
		TextField tf=new TextField("Programming in Java", 20);
		f.setLayout(new FlowLayout());
		f.add(b);
		f.add(tf);
		f.setSize(300,300);
		f.setVisible(true);
	}
}