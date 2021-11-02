package Zadaca27;
import java.util.Scanner;

public class Student {
   private String ime;
   private String prezime;
   private int indeks;
   private double prosek;
   
   public Student() {
	   ime=" ";
	   prezime=" ";
	   indeks=0;
	   prosek=0;
   }
   public void vnesi() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Vnesete ime: ");
	   ime=sc.nextLine();
	   System.out.println("Vnesete prezime: ");
	   prezime=sc.nextLine();
	   System.out.println("Vnesete indeks: ");
	   indeks=sc.nextInt();
	   System.out.println("Vnesete prosek: ");
	   prosek=sc.nextDouble();
   }
   public void pecati() {
	   System.out.println(ime+" "+prezime+" "+indeks+" "+prosek);
   }
   //set matodi
   //ne vika vrednost
   //prima vlezen parametar za izmena
   //tri tipa na seteri
   //izmeni
   //zgolemi
   //namali
   //set za ime
   public void setIme(String ime) {
	   this.ime=ime;
   }
   //set prezime izmena
   public void setPrezime(String prezime) {
	   this.prezime=prezime;
   }
   //set zgolemi indeks
   public void setIndeks(int indeks) {
	   this.indeks=this.indeks+indeks;
   }
   //set namali prosek
   public void setProsek(double prosek) {
	   this.prosek=this.prosek-prosek;
   }
}
