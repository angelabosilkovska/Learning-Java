package Zadaca02;

import java.util.Scanner;
import java.util.TreeMap;

public class Glavna {

	public static void main(String[] args) {
		TreeMap<Integer,Dekan> dekan=new TreeMap<Integer,Dekan>();
		Scanner sc=new Scanner(System.in);
		String ime;
		String prezime;
		String fakultet;
		String titula;
		int plata;
		int n;
		System.out.println("Vnesete n");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Vnesete ime");
			ime=sc.next();
			System.out.println("Vnesete prezime");
			prezime=sc.next();
			System.out.println("Vnesete fakultet");
			fakultet=sc.next();
			System.out.println("Vnesete titula");
			titula=sc.next();
			System.out.println("Vnesete plata");
			plata=sc.nextInt();
			dekan.put(i, new Dekan(ime,prezime,fakultet,titula,plata));
		}
		for(Dekan d:dekan.values()) {
			System.out.println(d.getIme()+" "+d.getPrezime()+" "+d.getFakultet()+" "+d.getTitula()+" "+d.getPlata());
		}

	}

}
