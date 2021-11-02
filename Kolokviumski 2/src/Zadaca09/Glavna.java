package Zadaca09;

import java.util.ArrayList;
import java.util.Scanner;
public class Glavna {

	public static void main(String[] args) {
		ArrayList<Avtomobil> lista=new ArrayList<Avtomobil>();
		String marka1;
		String model1;
		int cena1;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=4;i++) {
			System.out.println("Vnesete marka: ");
			marka1=sc.nextLine();
			System.out.println("Vnesete model: ");
			model1=sc.nextLine();
			System.out.println("Vnesete cena: ");
			cena1=sc.nextInt();
			Avtomobil a=new Avtomobil(marka1, model1, cena1);
			lista.add(a);
		}
		System.out.println();
		for(int i=1; i<=4; i++) {
			System.out.println("--------------------");
			System.out.println(lista.get(i).getMarka());
			System.out.println(lista.get(i).getModel());
			System.out.println(lista.get(i).getCena());
		    }
		}
	}
