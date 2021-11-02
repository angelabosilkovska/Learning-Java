package Zadaca31;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Vraboten> lista=new ArrayList<Vraboten>();
		System.out.println("Vnesete n");
		Scanner sc=new Scanner(System.in);
		String ime, prezime, firma;
		int plata, n;
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Vnesete ime: ");
			ime=sc.next();
			System.out.println("Vnesete prezime: ");
			prezime=sc.next();
			System.out.println("Vnesete firma: ");
			firma=sc.next();
			System.out.println("Vnesete plata: ");
			plata=sc.nextInt();
			
			Vraboten v=new Vraboten(ime,prezime,firma,plata);
			lista.add(v);
		}
            Collections.sort(lista,new Comparator<Vraboten>() {
			
			public int compare(Vraboten v1,Vraboten v2) {
				return v1.getIme().compareTo(v2.getIme());
			}
		});
		for(int i=0; i<n; i++) {
			System.out.println(lista.get(i).getIme());
			System.out.println(lista.get(i).getPrezime());
			System.out.println(lista.get(i).getFirma());
			System.out.println(lista.get(i).getPlata());
		}
	}

}
