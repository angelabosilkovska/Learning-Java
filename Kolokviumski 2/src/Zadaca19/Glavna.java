package Zadaca19;

import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Telefon> telefonlist=new ArrayList<Telefon>();
		
		Telefon t1=new Telefon(898989);
		t1.marka="aaaa";
		t1.model="bbbb";
		
		Telefon t2=new Telefon(11111);
		t2.marka="aaaa111";
		t2.model="bbbb111";
		
		Telefon t3=new Telefon(22222);
		t3.marka="aaaa2222";
		t3.model="bbbb2222";
		
		telefonlist.add(t1);
		telefonlist.add(t2);
		telefonlist.add(t3);
	}
}
