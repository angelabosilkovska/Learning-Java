package Zadaca10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;

public class Glavna {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,400);
	    JFrame f=new JFrame();
		JLabel label=new JLabel("Naslov");
		JLabel label1=new JLabel("Vnesete ime");
		TextField tf=new TextField();
		JLabel label2=new JLabel("Izberete pol");
		JRadioButton rb=new JRadioButton("M");
		JRadioButton rb1=new JRadioButton("F");
		JLabel label3=new JLabel("Izberete datum");
		JLabel label4=new JLabel("M");
	       DefaultListModel<String> l1=new DefaultListModel<String>();
	       l1.addElement("January");
	       l1.addElement("February");
	       l1.addElement("March");
	       l1.addElement("April");
	    JList<String> list=new JList<>(l1);
		JLabel label5=new JLabel("D");
	       DefaultListModel<String> l2=new DefaultListModel<String>();
	       l2.addElement("1");
	       l2.addElement("2");
	       l2.addElement("3");
	       l2.addElement("4");
	    JList<String> list1=new JList<>(l2);   
	    JLabel label6=new JLabel("G"); 
	       DefaultListModel<String> l3=new DefaultListModel<String>();
	       l2.addElement("1999");
	       l2.addElement("1998");
	       l2.addElement("1997");
	       l2.addElement("1996");
	    JList<String> list2=new JList<>(l3);   
	    Button b=new Button("Ok");
	    Button b1=new Button("Izl");
	    f.add(label);
	    f.add(label1);
	    f.add(tf);
	    f.add(label2);
	    f.add(rb);
	    f.add(rb1);
	    f.add(label3);
	    f.add(label4);
	    f.add(list);
	    f.add(label5);
	    f.add(list1);
	    f.add(label6);
	    f.add(list2);
	    f.add(b);
	    f.add(b1);
	    f.setSize(400, 400);
	    f.setLayout(new FlowLayout());
	    f.setVisible(true);
	}

}
