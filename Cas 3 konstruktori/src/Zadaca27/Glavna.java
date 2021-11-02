package Zadaca27;
import java.util.Scanner;

public class Glavna {
   public static void main(String[] args) {
	   String ime="Trajko";
	   int indeks;
	   double prosek;
	   
	   Student s=new Student();
	   s.vnesi();
	   s.pecati();
	   
	   Scanner sc=new Scanner(System.in);
	   //vnes na novo ime
	   //System.out.println("Vnesete novo ime za izmena: ");
	   //ime=sc.nextLine();
	   //povik  na set metoda za izmena na ime
	   s.setIme(ime);
	   s.pecati();
	   
	   System.out.println("Vnesete nov indeks za zgolemvanje: ");
	   indeks=sc.nextInt();
	   s.setIndeks(indeks);
	   s.pecati();
	   System.out.println("Vnesete nov prosek za namaluvanje: ");
	   prosek=sc.nextDouble();
	   s.setProsek(prosek);
	   s.pecati();
   }
}
