package Zadaca19;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {
  public static void main(String[] args) {
	  ArrayList<Grad> grad=new ArrayList<>();
		XML object=new XML();
	    String ime,drzava,brNaZiteli;
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<4;i++)
	    {
	    	Grad g=new Grad();
	    	grad.add(g);
	    	System.out.println("vnesete ime: ");
	    	ime=sc.next();
	    	g.setIme();
	    	System.out.println("vnesete drzava: ");
	    	drzava=sc.next();
	    	g.setDrzava();
	    	System.out.println("vnesete brNaZiteli: ");
	    	brNaZiteli=sc.next();
	    	g.setBrNaZiteli();
	        try {
	    		object.kreirajXmlFajl(grad);
	    	}
	    	catch(IOException e) {
	    		e.printStackTrace();
	    	}
	    }
	    for(int i=0; i<grad.size();i++) {
	    	System.out.println();
	    	System.out.println(grad.get(i).getIme());
	    	System.out.println(grad.get(i).getDrzava());
	    	System.out.println(grad.get(i).getBrNaZiteli());
	    }


	}
  }
