package Zadaca25;

import java.util.ArrayList;
import java.util.Scanner;

import Zadaca23.Vraboten;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Kvadar> lista=new ArrayList<Kvadar>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete kolku: ");
		int n=sc.nextInt();
		int a1;
		int b1;
		int c1;
		for(int i=0;i<n;i++) {
			Kvadar k=new Kvadar();
			System.out.println("Vnesete a: ");
			a1=sc.nextInt();
			k.setA(a1);
			System.out.println("Vnesete b: ");
			b1=sc.nextInt();
			k.setB(b1);
			System.out.println("Vnesete c: ");
			c1=sc.nextInt();
			k.setC(c1);
			lista.add(k);
		}
		for(int i=0; i<n; i++) {
			System.out.println("--------------------");
			System.out.println(lista.get(i).getA());
			System.out.println(lista.get(i).getB());
			System.out.println(lista.get(i).getC());
			System.out.println(lista.get(i).plostina());
			System.out.println(lista.get(i).volumen());
		}
}

}
