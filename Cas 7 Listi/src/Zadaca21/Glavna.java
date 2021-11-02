package Zadaca21;

import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Profesor> lista=new ArrayList<Profesor>();
		String ime1;
		String prezime1;
		String ulica1;
		String telefon1;
		int maticen;
		int plata1;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("Vnesete ime: ");
			ime1=sc.nextLine();
			System.out.println("Vnesete prezime: ");
			prezime1=sc.nextLine();
			System.out.println("Vnesete ulica: ");
			ulica1=sc.nextLine();
			System.out.println("Vnesete telefon: ");
			telefon1=sc.nextLine();
			System.out.println("Vnesete maticen broj: ");
			maticen=sc.nextInt();
			System.out.println("Vnesete plata: ");
			plata1=sc.nextInt();
			Profesor p=new Profesor(ime1, prezime1, ulica1, telefon1, maticen, plata1);
			lista.add(p);
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.println("--------------------");
			System.out.println(lista.get(i).getIme());
			System.out.println(lista.get(i).getPrezime());
			System.out.println(lista.get(i).getUlica());
		    System.out.println(lista.get(i).getTelefon());
			System.out.println(lista.get(i).getMaticenBroj());
			System.out.println(lista.get(i).getPlata());
			}
		}
	}

