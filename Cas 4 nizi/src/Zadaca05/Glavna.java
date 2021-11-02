package Zadaca05;

import java.util.Scanner;

public class Glavna {
	public static void main(String[] args) {
		   Covek c[]=new Covek[3];
		   int i;
		   for(i=0;i<3;i++) {
		   System.out.println("go vnesuvate"+(i+1)+"covek");
		   Covek nov=new Covek();
		   c[i]=nov;
		   c[i].vnesi();
	}
	Scanner sc=new Scanner(System.in);
	String ime,prezime;
	int visina,tezina;
	
	for(i=0;i<3;i++) {
		c[i].pecati();
	}
}
}
