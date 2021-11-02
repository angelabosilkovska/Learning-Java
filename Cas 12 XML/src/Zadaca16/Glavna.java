package Zadaca16;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Dekan> dekan=new ArrayList<>();
		XML object=new XML();
	    String ime,prezime,fakultet,plata;
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<4;i++)
	    {
	    	Dekan d=new Dekan();
	    	dekan.add(d);
	    	System.out.println("vnesete ime: ");
	    	ime=sc.next();
	    	d.setIme("Angela");
	    	System.out.println("vnesete prezime: ");
	    	prezime=sc.next();
	    	d.setPrezime("Bosilkovska");
	    	System.out.println("vnesete fakultet: ");
	    	fakultet=sc.next();
	    	d.setFakultet("Fikt");
	    	System.out.println("vnesete plata: ");
	    	plata=sc.next();
	    	d.setPlata("3000");
	        try {
	    		object.kreirajXmlFajl(dekan);
	    	}
	    	catch(IOException e) {
	    		e.printStackTrace();
	    	}
	    }
	    for(int i=0; i<dekan.size();i++) {
	    	System.out.println();
	    	System.out.println(dekan.get(i).ime);
	    	System.out.println(dekan.get(i).prezime);
	    	System.out.println(dekan.get(i).fakultet);
	    	System.out.println(dekan.get(i).plata);
	    }


	}

}
