package Zadaca08;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Glavna {

	public static void main(String[] args) {
		JFrame frame=new JFrame("RadioButton, Check box");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        
        JRadioButton rb=new JRadioButton("Vnesi");
        JRadioButton rb1=new JRadioButton("Brishi");
        JRadioButton rb2=new JRadioButton("Izmeni");
        JRadioButton rb3=new JRadioButton("Novo");
        
        frame.getContentPane().add(rb);
        frame.getContentPane().add(rb1);
        frame.getContentPane().add(rb2);
        frame.getContentPane().add(rb3);
        
        JCheckBox cb=new JCheckBox("Vnesi");
        JCheckBox cb1=new JCheckBox("Brishi");
        JCheckBox cb2=new JCheckBox("Izmeni");
        JCheckBox cb3=new JCheckBox("Novo");
        
        frame.getContentPane().add(cb);
        frame.getContentPane().add(cb1);
        frame.getContentPane().add(cb2);
        frame.getContentPane().add(cb3);
        
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
	}

}
