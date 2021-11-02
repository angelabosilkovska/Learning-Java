package Zadaca12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		Map<Integer,Avtobus> mapa=new HashMap<Integer,Avtobus>();
		Scanner sc=new Scanner(System.in);
		String marka1;
		String model1;
		int brNaPatnici1;
		int godina1;
		int n;
		System.out.println("Vnesi n");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Avtobus a=new Avtobus();
			System.out.println("Vnesete marka");
			marka1=sc.next();
			a.setMarka(marka1);
			System.out.println("Vnesete model");
			model1=sc.next();
			a.setModel(model1);
			System.out.println("Vnesete godina");
			godina1=sc.nextInt();
			a.setGodina(godina1);
			System.out.println("Vnesete broj na ziteli");
			brNaPatnici1=sc.nextInt();
			a.setBrNaPatnici(brNaPatnici1);
			mapa.put(i+1,a);
	}
		for(Avtobus a:mapa.values()) {
			System.out.println(a.getMarka()+" "+a.getModel()+" "+a.getBrNaPatnici()+" "+a.getGodina());
		}
		String marka2;
		System.out.println("Vnesi marka za prebaruvanje");
		marka2=sc.nextLine();
		int k=0;
		for(Avtobus a:mapa.values()) {
			if(a.getMarka()==marka2) {
				System.out.println(a.getMarka()+" "+a.getModel()+" "+a.getBrNaPatnici()+" "+a.getGodina());
				k++;
			}
		}
		if(k==0)
			System.out.println("Nema");
       

	}

	}
