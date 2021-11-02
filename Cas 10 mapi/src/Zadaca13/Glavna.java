package Zadaca13;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Glavna {

	public static void main(String[] args) {
		Map<Integer,Student> mapaz=new HashMap<Integer,Student>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesi kolku");
		int n=sc.nextInt();
		String ime1;
		String prezime1;
		int indeks1;
		double prosek1;
		for(int i=0;i<n;i++) {
			System.out.println("Vnesete ime");
			ime1=sc.next();
			System.out.println("Vnesete prezime");
			prezime1=sc.next();
			System.out.println("Vnesete indeks");
			indeks1=sc.nextInt();
			System.out.println("Vnesete prosek");
			prosek1=sc.nextInt();
			Student s=new Student(ime1, prezime1, indeks1, prosek1);
			mapaz.put(i+1,s);
		}
		Fakultet f=new Fakultet(mapaz);
		f.pecati();
		String imep;
		System.out.println("Vnesi za prebaruvanje");
		imep=sc.next();
		f.prebarajPoIme(imep);
	}

}
