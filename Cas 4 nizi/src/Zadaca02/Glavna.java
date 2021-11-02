package Zadaca02;

import java.util.Scanner;

public class Glavna {
   public static void main(String[] args) {
	   Profesor p[]=new Profesor[100];
	   int i,n;
	   System.out.println("Vnesi n");
	   String ime,prezime,titula;
	   int plata;
	   Scanner sc=new Scanner(System.in);
	   n=sc.nextInt();
	   for (i=0;i<n;i++) {
   		System.out.println("Vnesi ime ");
   		ime=sc.next();
   		System.out.println("Vnesi prezime ");
   		prezime=sc.next();
   		System.out.println("Vnesi titula ");
   		titula=sc.next();
   		System.out.println("Vnesi plata ");
   		plata=sc.nextInt();
   		Profesor p1=new Profesor(ime,prezime,titula,plata);
   		p[i]=p1;
   }
	   for (i=0; i<n;i++) {
   		ime=p[i].getIme();
   		prezime=p[i].getPrezime();
   		titula=p[i].getTitula();
   		plata=p[i].getPlata();
   		System.out.println(ime+" "+prezime+" "+titula+" "+plata);
   }
}
}