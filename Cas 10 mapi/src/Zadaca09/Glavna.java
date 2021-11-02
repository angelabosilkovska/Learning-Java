package Zadaca09;

import java.util.Scanner;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Glavna {

	public static void main(String[] args) {
		Map<Integer,Dekan> dekan=new HashMap<Integer,Dekan>();
		Scanner sc=new Scanner(System.in);
		String ime1;
		String prezime1;
		String fakultet1;
		String titula1;
		int plata1;
		int n;
		System.out.println("Vnesi n");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Dekan d=new Dekan();
			System.out.println("Vnesete ime");
			ime1=sc.next();
			d.setIme(ime1);
			System.out.println("Vnesete prezime");
			prezime1=sc.next();
			d.setPrezime(prezime1);
			System.out.println("Vnesete fakultet");
			fakultet1=sc.next();
			d.setFakultet(fakultet1);
			System.out.println("Vnesete titula");
			titula1=sc.next();
			d.setTitula(titula1);
			System.out.println("Vnesete plata");
			plata1=sc.nextInt();
			d.setPlata(plata1);
			dekan.put(i+1,d);
	}
		for(Dekan d:dekan.values()) {
			System.out.println(d.getIme()+" "+d.getPrezime()+" "+d.getPlata()+" "+d.getFakultet()+" "+d.getTitula());
		}
		int plata2;
		System.out.println("Vnesi plata za prebaruvanje");
		plata2=sc.nextInt();
		int k=0;
		for(Dekan d:dekan.values()) {
			if(d.getPlata()==plata2) {
				System.out.println(d.getIme()+" "+d.getPrezime()+" "+d.getPlata()+" "+d.getFakultet()+" "+d.getTitula());
				k++;
			}
		}
		if(k==0)
			System.out.println("Nema");
       
}
}