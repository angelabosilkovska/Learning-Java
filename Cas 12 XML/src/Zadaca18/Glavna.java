package Zadaca18;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Vozilo> vozilo=new ArrayList<>();
		XML object=new XML();
	    String marka,model,boja,cena;
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<4;i++)
	    {
	    	Vozilo v=new Vozilo();
	    	vozilo.add(v);
	    	System.out.println("vnesete marka: ");
	    	marka=sc.next();
	    	v.setMarka();
	    	System.out.println("vnesete model: ");
	    	model=sc.next();
	    	v.setModel();
	    	System.out.println("vnesete boja: ");
	    	boja=sc.next();
	    	v.setBoja();
	    	System.out.println("vnesete cena: ");
	        cena=sc.next();
	    	v.setCena();
	        try {
	    		object.kreirajXmlFajl(vozilo);
	    	}
	    	catch(IOException e) {
	    		e.printStackTrace();
	    	}
	    }
	    for(int i=0; i<vozilo.size();i++) {
	    	System.out.println();
	    	System.out.println(vozilo.get(i).getMarka());
	    	System.out.println(vozilo.get(i).getModel());
	    	System.out.println(vozilo.get(i).getBoja());
	    	System.out.println(vozilo.get(i).getCena());
	    }


	}


	}
