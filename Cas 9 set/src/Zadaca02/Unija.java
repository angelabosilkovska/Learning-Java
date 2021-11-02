package Zadaca02;

import java.util.HashSet;
import java.util.Set;

public class Unija {

	public static void main(String[] args) {
		HashSet<Integer> mnozestvo=new HashSet<Integer>();
		HashSet<Integer> mnozestvo1=new HashSet<Integer>();
		mnozestvo.add(1);
		mnozestvo.add(2);
		mnozestvo.add(3);
		
		mnozestvo1.add(11);
		mnozestvo1.add(22);
		mnozestvo1.add(3);
		
		Set<Integer> unija=new HashSet<Integer>();
		unija.addAll(mnozestvo);
		unija.addAll(mnozestvo1);
		System.out.println(unija);
	}

}
