package Zadaca11;

import java.util.Scanner;

public class Student {
   private String ime;
   private String prezime;
   private int indeks;
   private double prosek;
   
   public Student() {
	   //pocetnivrednostizaprivatniteatributinaklasata
	   ime=" ";
	   prezime=" ";
	   indeks=0;
	   prosek=0;
   }
   //Mora da ima metoda vnesi
   public void vnesi() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Vneseteime: ");
	   ime=sc.nextLine();
	   System.out.println("Vneseteprezime: ");
	   prezime=sc.nextLine();
	   System.out.println("Vneseteindeks: ");
	   indeks=sc.nextInt();
	   System.out.println("Vneseteprosek: ");
	   prosek=sc.nextDouble();
	   }
   public void pecati() {
	   System.out.println(ime+" "+prezime+" "+indeks+" "+prosek);
   }
}
