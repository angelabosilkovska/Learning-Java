package Zadaca29;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String marka1;
			String model1;
			int cena1;
			ArrayList<Mobilen> lista=new ArrayList<Mobilen>();
			System.out.println("Vnesi kolku: ");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				System.out.println("Vnesete marka:");
				marka1=sc.next();
				System.out.println("Vnesete model: ");
				model1=sc.next();
				System.out.println("Vnesete cena: ");
				cena1=sc.nextInt();
				Mobilen m=new Mobilen(marka1,model1,cena1);
				lista.add(m);
			}
			MobilShop m=new MobilShop(lista);
			for(int i=0;i<n;i++) {
				System.out.println("-------");
				System.out.println(lista.get(i).marka);
				System.out.println(lista.get(i).model);
				System.out.println(lista.get(i).getCena());
			}
	}

}
