package Zadaca03;

import java.util.Scanner;

public class Glavna {
	public static void main(String[] args) {
		   Predmet p[]=new Predmet[100];
		   int i,n;
		   System.out.println("Vnesi n");
		   String ime,otsek,semestar;
		   int krediti;
		   Scanner sc=new Scanner(System.in);
		   n=sc.nextInt();
		   for (i=0;i<n;i++) {
	   		System.out.println("Vnesi ime ");
	   		ime=sc.next();
	   		System.out.println("Vnesi otsek ");
	   		otsek=sc.next();
	   		System.out.println("Vnesi semestar ");
	   		semestar=sc.next();
	   		System.out.println("Vnesi krediti ");
	   		krediti=sc.nextInt();
	   		Predmet p1=new Predmet(ime,otsek,semestar,krediti);
	   		p[i]=p1;
	   }
		   for (i=0; i<n;i++) {
	   		ime=p[i].getIme();
	   		otsek=p[i].getOtsek();
	   		semestar=p[i].getSemestar();
	   		krediti=p[i].getKrediti();
	   		System.out.println(ime+" "+otsek+" "+semestar+" "+krediti);
	   }
}
}