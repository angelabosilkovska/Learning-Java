package Zadaca03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Gradovi> gradovi=new ArrayList<>();
		ArrayList<String> ime=new ArrayList<>();
		ArrayList<Integer> brNaZitel=new ArrayList<>();
		ArrayList<String> drzava=new ArrayList<>();
		String ime1,drzava1;
		int brNaZitel1;
		for(int i=0;i<3;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Vnesete ime: ");
			ime1=sc.next();
			System.out.println("Vnesete broj na zitel: ");
			brNaZitel1=sc.nextInt();
			System.out.println("Vnesete drzava: ");
			drzava1=sc.next();
			Gradovi g=new Gradovi(ime1,brNaZitel1,drzava1);
			gradovi.add(g);
		}
		for(int i=0;i<gradovi.size();i++) {
			System.out.println();
			System.out.println(gradovi.get(i).getIme());
			System.out.println(gradovi.get(i).getBrNaZitel());
			System.out.println(gradovi.get(i).getDrzava());
		}
		for(int i=0;i<gradovi.size();i++) {
			ime.add(gradovi.get(i).getIme());
			brNaZitel.add(gradovi.get(i).getBrNaZitel());
			drzava.add(gradovi.get(i).getDrzava());
		}
		Iterator itrIme=(Iterator) ime.iterator();
		while(itrIme.hasNext()) {
			Object element=itrIme.next();
			System.out.println(element + "+");
		}
		Iterator itrBrNaZitel=(Iterator) brNaZitel.iterator();
		while(itrBrNaZitel.hasNext()) {
			Object element=itrBrNaZitel.next();
			System.out.println(element + "+");
		}
		Iterator itrDrzava=(Iterator) drzava.iterator();
		while(itrDrzava.hasNext()) {
			Object element=itrDrzava.next();
			System.out.println(element + "+");
		}

	}

}
