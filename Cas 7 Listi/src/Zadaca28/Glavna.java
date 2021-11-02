package Zadaca28;
import java.util.Scanner;
import java.util.ArrayList;

public class Glavna {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String marka;
	int cena;
	ArrayList<Leb> lista=new ArrayList<Leb>();
	System.out.println("Vnesi kolku: ");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println("Vnesete marka:");
		marka=sc.next();
		System.out.println("Vnesete cena: ");
		cena=sc.nextInt();
		Leb l=new Leb(marka,cena);
		lista.add(l);
	}
	Pekara p=new Pekara(lista);
	for(int i=0;i<n;i++) {
		System.out.println("-------");
		System.out.println(lista.get(i).vrstaNaLeb);
		System.out.println(lista.get(i).getCena());
	}
	}

}
