package Zadaca24;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Dekan> lista=new ArrayList<Dekan>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete kolku: ");
		int n=sc.nextInt();
		String ime1;
		String prezime1;
		String titula1;
		int plata1;
		String oblast1;
		for(int i=0;i<n;i++) {
			System.out.println("Vnesete ime: ");
			ime1=sc.nextLine();
			System.out.println("Vnesete prezime: ");
			prezime1=sc.nextLine();
			System.out.println("Vnesete titula: ");
			titula1=sc.nextLine();
			System.out.println("Vnesete plata: ");
			plata1=sc.nextInt();
			System.out.println("Vnesete oblast: ");
			oblast1=sc.nextLine();
			Dekan d=new Dekan(ime1, prezime1, titula1, plata1, oblast1);
			lista.add(d);
		}
		for(int i=0; i<n; i++) {
			System.out.println("--------------------");
			System.out.println(lista.get(i).getIme());
			System.out.println(lista.get(i).getPrezime());
			System.out.println(lista.get(i).getTitula());
			System.out.println(lista.get(i).getPlata());
			System.out.println(lista.get(i).getOblast());
	}
	}

}
