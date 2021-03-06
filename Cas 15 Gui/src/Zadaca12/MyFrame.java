package Zadaca12;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class MyFrame extends JFrame  {
      
	private Container c;
	private JLabel naslov;
	private JLabel ime;
	private JTextField tfIme;
	private JLabel prezime;
	private JTextField tfPrezime;
	private JLabel pol;
	private JRadioButton male;
	private JRadioButton female;
	private JLabel data;
	private JComboBox datum;
	private JComboBox mesec;
	private JComboBox godina;
	private JButton register;
	private JButton cancel;
	
	    private String dates[] 
			= { "1", "2", "3", "4", "5", 
				"6", "7", "8", "9", "10", 
				"11", "12", "13", "14", "15", 
				"16", "17", "18", "19", "20", 
				"21", "22", "23", "24", "25", 
				"26", "27", "28", "29", "30", 
				"31" }; 
		private String months[] 
			= { "Jan", "feb", "Mar", "Apr", 
				"May", "Jun", "July", "Aug", 
				"Sep", "Oct", "Nov", "Dec" }; 
		private String years[] 
			= { "1995", "1996", "1997", "1998", 
				"1999", "2000", "2001", "2002", 
				"2003"}; 
		
	public MyFrame() {
		
		setTitle("Registracija"); 
		setBounds(300,90,900,600); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setResizable(false); 
		c = getContentPane(); 
		c.setLayout(null);
		
		naslov=new JLabel("Registracija");
		naslov.setSize(300, 30);
		naslov.setLocation(300, 30);
		c.add(naslov);
		
		ime=new JLabel("Vnesete ime:");
		ime.setSize(100, 20);
		ime.setLocation(100, 100);
		c.add(ime);
		
		tfIme=new JTextField();
		tfIme.setSize(190, 200);
		tfIme.setLocation(200, 100);
		c.add(tfIme);
		
		prezime=new JLabel("Vnesete prezime:");
		prezime.setSize(100, 20);
		prezime.setLocation(100, 100);
		c.add(prezime);
		
		tfPrezime=new JTextField();
		tfPrezime.setSize(190, 200);
		tfPrezime.setLocation(200, 100);
		c.add(tfPrezime);
		
		
	}
}
