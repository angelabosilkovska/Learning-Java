package Zadaca20;

import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Fakultet> lista=new ArrayList<Fakultet>();
		String ime;
		int broj;
		int vkupno;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("Vnesete ime: ");
			ime=sc.nextLine();
			System.out.println("Vnesete broj: ");
			broj=sc.nextInt();
			System.out.println("Vnesete vkupna cena: ");
			vkupno=sc.nextInt();
			Fakultet f=new Fakultet(ime, broj, vkupno);
			lista.add(f);
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.println("--------------------");
			System.out.println(lista.get(i).getImenafakultet());
			System.out.println(lista.get(i).getBrojnasmerovi());
			System.out.println(lista.get(i).getVkupnostudenti());
		}
	}

}
