package Zadaca15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Zadaca13.Fakultet;
public class Glavna {

	public static void main(String[] args) {
		Map<Integer,Predmet> mapa2=new HashMap<Integer,Predmet>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesi kolku");
		int n=sc.nextInt();
		String ime1;
		String otsek1;
		int semestar1;
		int godina1;
		for(int i=0;i<n;i++) {
			Predmet p=new Predmet();
			System.out.println("Vnesete ime");
			ime1=sc.next();
			p.setIme(ime1);
			System.out.println("Vnesete otsek");
			otsek1=sc.next();
			p.setOtsek(otsek1);
			System.out.println("Vnesete semestsar");
			semestar1=sc.nextInt();
			p.setSemestar(semestar1);
			System.out.println("Vnesete godina");
			godina1=sc.nextInt();
			p.setGodina(godina1);
			mapa2.put(i+1,p);
	}
		Otseci o=new Otseci(mapa2);
		o.pecati();
		String ime3;
		System.out.println("Vnesi ime za prebaruvanje");
		ime3=sc.next();
		o.prebarajPoIme(ime3);
		
		o.pecati();
		int godina3;
        System.out.println("Vnesi godina za prebaruvanje");
        godina3=sc.nextInt();
        o.prebarajPoGodina(godina3);

	}

}
