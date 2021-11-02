package Zadaca26;

import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Vraboten> lista=new ArrayList<Vraboten>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete kolku: ");
		int n=sc.nextInt();
		String ime1;
		String prezime1;
		String firma1;
		int plata1;
		for(int i=0;i<n;i++) {
			Vraboten v=new Vraboten();
			System.out.println("Vnesete ime: ");
			ime1=sc.nextLine();
			v.setIme(ime1);
			System.out.println("Vnesete prezime: ");
			prezime1=sc.nextLine();
			v.setPrezime(prezime1);
			System.out.println("Vnesete firma: ");
			firma1=sc.nextLine();
			v.setFirma(firma1);
			System.out.println("Vnesete plata: ");
			plata1=sc.nextInt();
			v.setPlata(plata1);
			lista.add(v);
		}
		for(int i=0; i<n; i++) {
			System.out.println("--------------------");
			System.out.println(lista.get(i).getIme());
			System.out.println(lista.get(i).getPrezime());
			System.out.println(lista.get(i).getFirma());
			System.out.println(lista.get(i).getPlata());
				}
		System.out.println("Prebaruvanje po ime: ");
		String ime=sc.next();
		for(int i=0;i<n;i++) {
			if(lista.get(i).prebaruvanjeIme(ime))
				System.out.println();
		}
		System.out.println("Prebaruvanje po plata: ");
		int plata=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(lista.get(i).prebaruvanjePlata(plata))
				System.out.println();
		}
	}

}
