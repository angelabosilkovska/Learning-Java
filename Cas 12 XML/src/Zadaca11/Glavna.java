package Zadaca11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Profesor> prof=new ArrayList<>();
		XML object=new XML();
        String ime, prezime, titula, plata;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++) {
        	System.out.println("vnesete ime: ");
        	ime=sc.next();
        	System.out.println("vnesete prezime: ");
        	prezime=sc.next();
        	System.out.println("vnesete titula: ");
        	titula=sc.next();
        	System.out.println("vnesete plata: ");
        	plata=sc.next();
        	Profesor p=new Profesor(ime,prezime,titula,plata);
        	prof.add(p);
        	try {
        		object.kreirajXmlFajl(prof);
        	}
        	catch(IOException e) {
        		e.printStackTrace();
        	}
        }
        for(int i=0; i<prof.size();i++) {
        	System.out.println();
        	System.out.println(prof.get(i).ime);
        	System.out.println(prof.get(i).prezime);
        	System.out.println(prof.get(i).titula);
        	System.out.println(prof.get(i).plata);
        }
   }

}
