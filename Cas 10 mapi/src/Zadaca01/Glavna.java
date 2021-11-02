package Zadaca01;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Glavna {

	public static void main(String[] args) {
		TreeMap<Integer, String> v=new TreeMap<Integer, String>();
		
		Scanner sc=new Scanner(System.in);
		int n;
		String ime;
		int red;
		
		System.out.println("Vnesete broj na vraboteni");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Vnesete reden broj: ");
			red=sc.nextInt();
			System.out.println("Vnesete ime ");
			ime=sc.next();
			v.put(red, ime);
		}
		String ime1;
		System.out.println("vnesete za ime za sporedba");
		ime1=sc.next();
		Iterator itr=v.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry mEntry=(Map.Entry) itr.next();
			if(mEntry.getValue().equals(ime1))
				System.out.println(mEntry.getKey()+" "+mEntry.getValue());
		}

	}

}
