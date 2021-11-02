package Zadaca22;

import java.util.ArrayList;
import java.util.Scanner;

import Zadaca21.Profesor;


public class Glavna {

	public static void main(String[] args) {
		ArrayList<Avtomobil> lista=new ArrayList<Avtomobil>();
		String marka1;
		String model1;
		String boja1;
		int cena1;
		int izminatiKm1;
		int godina1;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("Vnesete marka: ");
			marka1=sc.nextLine();
			System.out.println("Vnesete model: ");
			model1=sc.nextLine();
			System.out.println("Vnesete boja: ");
			boja1=sc.nextLine();
			System.out.println("Vnesete cena: ");
			cena1=sc.nextInt();
			System.out.println("Vnesete izminati km: ");
			izminatiKm1=sc.nextInt();
			System.out.println("Vnesete godina: ");
			godina1=sc.nextInt();
			Avtomobil a=new Avtomobil(marka1, model1, boja1, cena1, izminatiKm1, godina1);
			lista.add(a);
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.println("--------------------");
			System.out.println(lista.get(i).getMarka());
			System.out.println(lista.get(i).getModel());
			System.out.println(lista.get(i).getBoja());
		    System.out.println(lista.get(i).getCena());
			System.out.println(lista.get(i).getIzminatiKm());
			System.out.println(lista.get(i).getGodina());
			}
	}

}
