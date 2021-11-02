package Zadaca07;

import java.util.Scanner;

public class Glavna {
	public static void main(String[] args) {
		   Telefon t[]=new Telefon[3];
		   int i;
		   for(i=0;i<3;i++) {
		   System.out.println("go vnesuvate "+(i+1)+" telefon");
		   Telefon nov=new Telefon();
		   t[i]=nov;
		   t[i].vnesi();
	}
	Scanner sc=new Scanner(System.in);
	String ime,prezime,boja;
	int visina,tezina;
	
	for(i=0;i<3;i++) {
		t[i].pecati();
	}
}
}
