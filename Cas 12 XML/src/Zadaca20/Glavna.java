package Zadaca20;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Avion> avion=new ArrayList<>();
		XML object=new XML();
	    String marka,model,cena;
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<4;i++)
	    {
	    	Avion a=new Avion();
	    	avion.add(a);
	    	System.out.println("vnesete marka: ");
	    	marka=sc.next();
	    	a.setMarka();
	    	System.out.println("vnesete model: ");
	    	model=sc.next();
	    	a.setModel();
	    	System.out.println("vnesete cena: ");
	        cena=sc.next();
	    	a.setCena();
	        try {
	    		object.kreirajXmlFajl(avion);
	    	}
	    	catch(IOException e) {
	    		e.printStackTrace();
	    	}
	    }
	    for(int i=0; i<avion.size();i++) {
	    	System.out.println();
	    	System.out.println(avion.get(i).getMarka());
	    	System.out.println(avion.get(i).getModel());
	    	System.out.println(avion.get(i).getCena());
	    }


	}


}
