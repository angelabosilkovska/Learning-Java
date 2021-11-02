package Zadaca12;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Vozilo> vozilo=new ArrayList<>();
		XML object=new XML();
		String marka,model,cena;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("vnesete marka: ");
			marka=sc.next();
			System.out.println("vnesete model: ");
			model=sc.next();
			System.out.println("vnesete cena: ");
			cena=sc.next();
			Vozilo v=new Vozilo(marka,model,cena);
			vozilo.add(v);
			try {
				object.kreirajXmlFajl(vozilo);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<vozilo.size();i++) {
			System.out.println();
			System.out.println(vozilo.get(i).getMarka());
			System.out.println(vozilo.get(i).getModel());
			System.out.println(vozilo.get(i).getCena());
		}
	}

}
