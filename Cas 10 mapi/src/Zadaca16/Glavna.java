package Zadaca16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Glavna {

	public static void main(String[] args) {
		Map<Integer,Kvadar> mapa2=new HashMap<Integer,Kvadar>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesi kolku");
		int n=sc.nextInt();
		int a1;
		int b1;
		int c1;
		for(int i=0;i<n;i++) {
			Kvadar k=new Kvadar();
			System.out.println("Vnesete a");
			a1=sc.nextInt();
			k.setA(a1);
			System.out.println("Vnesete b");
			b1=sc.nextInt();
			k.setB(b1);
			System.out.println("Vnesete c");
			c1=sc.nextInt();
			k.setC(c1);
			mapa2.put(i+1,k);
	}
		Figura f=new Figura(mapa2);
		f.pecati();
		f.Plostina();
		f.Volumen();
	}

}
