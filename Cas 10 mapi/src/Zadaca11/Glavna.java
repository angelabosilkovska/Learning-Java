package Zadaca11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		Map<Integer,Gradovi> mapa=new HashMap<Integer,Gradovi>();
		Scanner sc=new Scanner(System.in);
		String ime1;
		String drzava1;
		int brNaZiteli1;
		int n;
		System.out.println("Vnesi n");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Gradovi g=new Gradovi();
			System.out.println("Vnesete ime");
			ime1=sc.next();
			g.setIme(ime1);
			System.out.println("Vnesete Drzava");
			drzava1=sc.next();
			g.setDrzava(drzava1);
			System.out.println("Vnesete broj na ziteli");
			brNaZiteli1=sc.nextInt();
			g.setBrNaZiteli(brNaZiteli1);
			mapa.put(i+1,g);
	}
		for(Gradovi g:mapa.values()) {
			System.out.println(g.getIme()+" "+g.getDrzava()+" "+g.getBrNaZiteli());
		}
		String drzava2;
		System.out.println("Vnesi drzava za prebaruvanje");
		drzava2=sc.nextLine();
		int k=0;
		for(Gradovi g:mapa.values()) {
			if(g.getDrzava()==drzava2) {
				System.out.println(g.getIme()+" "+g.getDrzava()+" "+g.getBrNaZiteli());
				k++;
			}
		}
		if(k==0)
			System.out.println("Nema");
       

	}

	}

