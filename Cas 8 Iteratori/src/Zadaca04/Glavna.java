package Zadaca04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Avtobus> avtobus=new ArrayList<>();
		ArrayList<String> marka=new ArrayList<>();
		ArrayList<String> model=new ArrayList<>();
		ArrayList<Integer> brNaPatnici=new ArrayList<>();
		ArrayList<Integer> godina=new ArrayList<>();
		String marka1,model1;
		int brNaPatnici1,godina1;
		for(int i=0;i<4;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Vnesete marka: ");
			marka1=sc.next();
			System.out.println("Vnesete model: ");
			model1=sc.next();
			System.out.println("Vnesete broj na patnici: ");
			brNaPatnici1=sc.nextInt();
			System.out.println("Vnesete godina: ");
			godina1=sc.nextInt();
			Avtobus a=new Avtobus(marka1,model1,brNaPatnici1,godina1);
			avtobus.add(a);
		}
		for(int i=0;i<avtobus.size();i++) {
			System.out.println();
			System.out.println(avtobus.get(i).getMarka());
			System.out.println(avtobus.get(i).getModel());
			System.out.println(avtobus.get(i).getBrNaPatnici());
			System.out.println(avtobus.get(i).getGodina());
		}
		for(int i=0;i<avtobus.size();i++) {
			marka.add(avtobus.get(i).getMarka());
			model.add(avtobus.get(i).getModel());
			brNaPatnici.add(avtobus.get(i).getBrNaPatnici());
			godina.add(avtobus.get(i).getGodina());
		}
		Iterator itrMarka=(Iterator) marka.iterator();
		while(itrMarka.hasNext()) {
			Object element=itrMarka.next();
			System.out.println(element + "+");
		}
		Iterator itrModel=(Iterator) model.iterator();
		while(itrModel.hasNext()) {
			Object element=itrModel.next();
			System.out.println(element + "+");
		}
		Iterator itrBrNaPatnici=(Iterator) brNaPatnici.iterator();
		while(itrBrNaPatnici.hasNext()) {
			Object element=itrBrNaPatnici.next();
			System.out.println(element + "+");
		}
		Iterator itrGodina=(Iterator) godina.iterator();
		while(itrGodina.hasNext()) {
			Object element=itrGodina.next();
			System.out.println(element + "+");
		}

	}

}
