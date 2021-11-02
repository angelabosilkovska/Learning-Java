package Zadaca01;

import java.util.Scanner;

public class Glavna {
    public static void main(String[] args) {
    	//Deklariranje na niza od elementi objekti
    	Vozilo v[]=new Vozilo[100];
    	int i,n;
    	System.out.println("Vnesi n");
    	String marka,model,boja;
    	int cena;
    	Scanner sc=new Scanner(System.in);
    	//se vnesuva broj na elementi za nizata
    	n=sc.nextInt();
    	//se vnesuva nizataod elementi
    	for (i=0;i<n;i++) {
    		System.out.println("Vnesi marka ");
    		marka=sc.next();
    		System.out.println("Vnesi model ");
    		model=sc.next();
    		System.out.println("Vnesi boja ");
    		boja=sc.next();
    		System.out.println("Vnesi cena ");
    		cena=sc.nextInt();
    		//kreiranje na obiekt vo konstruktor vo vlezni parametri
    		Vozilo v1=new Vozilo(marka, model, boja, cena);
    		//polenje na nizata od elementi 
    		v[i]=v1;
    	}
    	for (i=0; i<n;i++) {
    		marka=v[i].getmarka();
    		model=v[i].getmodel();
    		boja=v[i].getboja();
    		cena=v[i].getcena();
    		System.out.println(marka+" "+model+" "+boja+" "+cena);
    }
}
}