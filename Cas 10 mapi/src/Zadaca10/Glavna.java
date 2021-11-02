package Zadaca10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		Map<Integer,Osigurenik> mapa=new HashMap<Integer,Osigurenik>();
		Scanner sc=new Scanner(System.in);
		String ime1;
		String prezime1;
		String firma1;
		int suma1;
		int n;
		System.out.println("Vnesi n");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Osigurenik o=new Osigurenik();
			System.out.println("Vnesete ime");
			ime1=sc.next();
			o.setIme(ime1);
			System.out.println("Vnesete prezime");
			prezime1=sc.next();
			o.setPrezime(prezime1);
			System.out.println("Vnesete firma");
			firma1=sc.next();
			o.setFirma(firma1);
			System.out.println("Vnesete plata");
			suma1=sc.nextInt();
			o.setSuma(suma1);
			mapa.put(i+1,o);
	}
		for(Osigurenik o:mapa.values()) {
			System.out.println(o.getIme()+" "+o.getPrezime()+" "+o.getFirma()+" "+o.getSuma());
		}
		String ime2;
		System.out.println("Vnesi ime za prebaruvanje");
		ime2=sc.nextLine();
		int k=0;
		for(Osigurenik o:mapa.values()) {
			if(o.getIme()==ime2) {
				System.out.println(o.getIme()+" "+o.getPrezime()+" "+o.getFirma()+" "+o.getSuma());
				k++;
			}
		}
		if(k==0)
			System.out.println("Nema");
       

	}

}
