package Zadaca09;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class Glavna {
   public static void main(String[] args) {
	   JFrame frame=new JFrame("List, ComboBox");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,400);
       JFrame f=new JFrame();
       
       DefaultListModel<String> l1=new DefaultListModel<String>();
       l1.addElement("Vnesi");
       l1.addElement("Izmeni");
       l1.addElement("Izbrishi");
       l1.addElement("Novo");
        
       JList<String> list=new JList<>(l1);
       list.setBounds(100, 100, 75, 75);
       f.add(list);
       f.setSize(400, 400);
       f.setLayout(null);
       f.setVisible(true);
   }
}
