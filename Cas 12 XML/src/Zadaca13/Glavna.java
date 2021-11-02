package Zadaca13;
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
        	System.out.println("vnesete ime: ");
        	ime=sc.next();
        	System.out.println("vnesete prezime: ");
        	prezime=sc.next();
        	System.out.println("vnesete specijalizacija: ");
        	specijalizacija=sc.next();
        	System.out.println("vnesete plata: ");
        	plata=sc.next();
        	Doktor d=new Doktor(ime,prezime,specijalizacija,plata);
        	doktor.add(d);
        	try {
        		object.kreirajXmlFajl(doktor);
        	}
        	catch(IOException e) {
        		e.printStackTrace();
        	}
        }
        for(int i=0; i<doktor.size();i++) {
        	System.out.println();
        	System.out.println(doktor.get(i).getIme());
        	System.out.println(doktor.get(i).getPrezime());
        	System.out.println(doktor.get(i).getSpecijalizacija());
        	System.out.println(doktor.get(i).getPlata());
        }
    }
}
