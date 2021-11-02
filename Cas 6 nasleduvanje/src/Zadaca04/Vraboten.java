package Zadaca04;

import java.util.Scanner;

public class Vraboten extends Covek {
   private String firma;
   private int plata;
   
   public Vraboten() {
	   super();
	   firma=" ";
	   plata=0;
   }
   public Vraboten(String ime, String prezime, String ulica, int telefon, String firma, int plata) {
	   super(ime,prezime,ulica,telefon);
	   this.firma=firma;
	   this.plata=plata;
   }
   public void VnesV() {
	   	VnesC();
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete firma: ");
		firma=sc.nextLine();
		System.out.println("Vnesete plata: ");
		plata=sc.nextInt();
	}
	public void IspisV() {
		IspisC();
		System.out.println(firma+plata);
	}
}
