package Zadaca17;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Doktor> doktor=new ArrayList<>();
		XML object=new XML();
	    String ime,prezime,specijalizacija,plata;
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<4;i++)
	    {
	    	Doktor d=new Doktor();
	    	doktor.add(d);
	    	System.out.println("vnesete ime: ");
	    	ime=sc.next();
	    	d.setIme();
	    	System.out.println("vnesete prezime: ");
	    	prezime=sc.next();
	    	d.setPrezime();
	    	System.out.println("vnesete specijalizacija: ");
	    	specijalizacija=sc.next();
	    	d.setSpecijalizacija();
	    	System.out.println("vnesete plata: ");
	    	plata=sc.next();
	    	d.setPlata();
	        try {
	    		object.kreirajXmlFajl(doktor);
	    	}
	    	catch(IOException e) {
	    		e.printStackTrace();
	    	}
	    }
	    for(int i=0; i<doktor.size();i++) {
	    	System.out.println();
	    	System.out.println(doktor.get(i).ime);
	    	System.out.println(doktor.get(i).prezime);
	    	System.out.println(doktor.get(i).specijalizacija);
	    	System.out.println(doktor.get(i).plata);
	    }


	}

	}
