package Zadaca27;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Profesor> lista=new ArrayList<Profesor>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete kolku: ");
		int n=sc.nextInt();
		String ime1;
		String prezime1;
		String titula1;
		int plata1;
		for(int i=0; i<n; i++) {
			System.out.println("Vnesete ime: ");
			ime1=sc.next();
			System.out.println("Vnesete prezime: ");
			prezime1=sc.next();
			System.out.println("Vnesete titula: ");
			titula1=sc.next();
			System.out.println("Vnesete plata: ");
			plata1=sc.nextInt();
			Profesor p=new Profesor(ime1, prezime1, titula1, plata1);
			lista.add(p);
		}
		for(int i=0; i<n; i++) {
			System.out.println(lista.get(i).getIme());
			System.out.println(lista.get(i).getPrezime());
			System.out.println(lista.get(i).getTitula());
			System.out.println(lista.get(i).getPlata());
		}
		System.out.println("Prebaruvanje po ime: ");
		String ime=sc.next();
		for(int i=0;i<n;i++) {
			if(lista.get(i).prebaruvanjeIme(ime))
				System.out.println();
		}
		System.out.println("Prebaruvanje po prezime: ");
		String prezime=sc.next();
		for(int i=0;i<n;i++) {
			if(lista.get(i).prebaruvanjePrezime(prezime))
				System.out.println();
		}
		System.out.println("Prebaruvanje po titula: ");
		String titula=sc.next();
		for(int i=0;i<n;i++) {
			if(lista.get(i).prebaruvanjeTitula(titula))
				System.out.println();
		}
		System.out.println("Prebaruvanje po plata: ");
		int plata=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(lista.get(i).prebaruvanjePlata(plata))
				System.out.println();
		}
	}

}
