package Zadaca02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Dekan> dekani=new ArrayList<>();
		ArrayList<String> ime=new ArrayList<>();
		ArrayList<String> prezime=new ArrayList<>();
		ArrayList<String> fakultet=new ArrayList<>();
		String ime1,prezime1,fakultet1;
		for(int i=0;i<3;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Vnesete ime: ");
			ime1=sc.next();
			System.out.println("Vnesete prezime: ");
			prezime1=sc.next();
			System.out.println("Vnesete fakultet: ");
			fakultet1=sc.next();
			Dekan d=new Dekan(ime1,prezime1,fakultet1);
			dekani.add(d);
		}
		for(int i=0;i<dekani.size();i++) {
			System.out.println();
			System.out.println(dekani.get(i).getIme());
			System.out.println(dekani.get(i).getPrezime());
			System.out.println(dekani.get(i).getFakultet());
		}
		for(int i=0;i<dekani.size();i++) {
			ime.add(dekani.get(i).getIme());
			prezime.add(dekani.get(i).getPrezime());
			fakultet.add(dekani.get(i).getFakultet());
		}
		Iterator itrIme=(Iterator) ime.iterator();
		while(itrIme.hasNext()) {
			Object element=itrIme.next();
			System.out.println(element + "+");
		}
		Iterator itrPrezime=(Iterator) prezime.iterator();
		while(itrPrezime.hasNext()) {
			Object element=itrPrezime.next();
			System.out.println(element + "+");
		}
		Iterator itrFakultet=(Iterator) fakultet.iterator();
		while(itrFakultet.hasNext()) {
			Object element=itrFakultet.next();
			System.out.println(element + "+");
		}

	}

}
