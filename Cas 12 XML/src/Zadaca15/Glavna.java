package Zadaca15;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {
	public static void main(String[] args) {
	ArrayList<Profesor> profesor=new ArrayList<>();
	XML object=new XML();
    String ime,prezime,titula,plata;
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<4;i++)
    {
    	System.out.println("vnesete ime: ");
    	ime=sc.next();
    	System.out.println("vnesete prezime: ");
    	prezime=sc.next();
    	System.out.println("vnesete titula: ");
    	titula=sc.next();
    	System.out.println("vnesete plata: ");
    	plata=sc.next();
    	Profesor p=new Profesor(ime,prezime,titula,plata);
    	profesor.add(p);
    	try {
    		object.kreirajXmlFajl(profesor);
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}
    }
    for(int i=0; i<profesor.size();i++) {
    	System.out.println();
    	System.out.println(profesor.get(i).ime);
    	System.out.println(profesor.get(i).prezime);
    	System.out.println(profesor.get(i).titula);
    	System.out.println(profesor.get(i).plata);
    }

}
}
