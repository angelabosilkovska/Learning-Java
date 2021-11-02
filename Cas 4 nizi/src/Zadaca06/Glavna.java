package Zadaca06;

import java.util.Scanner;

public class Glavna {
	public static void main(String[] args) {
		   int i,n;
		   Dekan d3[]=new Dekan[100];
		   System.out.println("Vnesi n");
		   String ime,prezime,titula;
		   int plata;
		   Scanner sc=new Scanner(System.in);
		   n=sc.nextInt();
		   for(i=0;i<n;i++) {
			   Dekan d2=new Dekan();
			   System.out.println("Vnesi ime ");
			   ime=sc.next();
			   d2.setIme(ime);
			   System.out.println("Vnesi prezime ");
			   prezime=sc.next();
			   d2.setPrezime(prezime);
			   System.out.println("Vnesi titula ");
			   titula=sc.next();
			   d2.setTitula(titula);
			   System.out.println("Vnesi plata ");
			   plata=sc.nextInt();
			   d2.setPlata(plata);
			   d3[i]=d2;
		   }
	   for(i=0;i<n;i++) {
		   ime=d3[i].getIme();
		   prezime=d3[i].getPrezime();
		   titula=d3[i].getTitula();
		   plata=d3[i].getPlata();
		   System.out.println(ime+" "+prezime+" "+titula+" "+plata);
	   }
	   }
}
