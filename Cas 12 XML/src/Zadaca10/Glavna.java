package Zadaca10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Glavna {

	public static void main(String[] args) {
		ArrayList<Vraboten> vrab=new ArrayList<>();
		XML object=new XML();
		String ime,prezime,plata;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("Vnesete ime: ");
			ime=sc.next();
			System.out.println("Vnesete prezime: ");
			prezime=sc.next();
			System.out.println("Vnesete plata: ");
			plata=sc.next();
			Vraboten v=new Vraboten(ime,prezime,plata);
			vrab.add(v);
			try {
			System.out.println(object.kreirajXmlFajl(vrab));
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
        for(int i=0;i<vrab.size();i++) {
        	System.out.println();
        	System.out.println(vrab.get(i).getIme());
            System.out.println(vrab.get(i).getPrezime());
            System.out.println(vrab.get(i).getPlata());
        }
	}

}
