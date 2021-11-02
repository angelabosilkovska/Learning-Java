package Zadaca30;

import java.util.Scanner;

public class Doktor {
	   private String ime;
	   private String prezime;
	   private String specijalizacija;
	   private int bod;
	   private int vrednostnabod;
	   
	   public Doktor() {
		   ime=" ";
		   prezime=" ";
		   specijalizacija=" ";
		   bod=0;
		   vrednostnabod=0;
	   }
	   public void vnesi() {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Vnesete ime: ");
		   ime=sc.nextLine();
		   System.out.println("Vnesete prezime: ");
		   prezime=sc.nextLine();
		   System.out.println("Vnesete specijalizacija: ");
		   specijalizacija=sc.nextLine();
		   System.out.println("Vnesete bod: ");
		   bod=sc.nextInt();
		   System.out.println("Vnesete vrednost na bod: ");
		   vrednostnabod=sc.nextInt();
	   }
	   public void pecati() {
		   System.out.println(ime+" "+prezime+" "+specijalizacija+" "+bod+" "+vrednostnabod);
	   }
	   public void setIme(String ime) {
		   this.ime=ime;
	   }
	   public void setPrezime(String prezime) {
		   this.prezime=prezime;
	   }
	   public void setSpecijalizacija(String specijalizacija) {
		   this.specijalizacija=specijalizacija;
	   }
	   public void setVrednostnabod(int vrednostnabod) {
		   this.vrednostnabod=this.vrednostnabod+vrednostnabod;
	   }
	   public void setBod(int bod) {
		   this.bod=this.bod-bod;
	   }
	   public void plata() {
		   int p;
		   p=bod*vrednostnabod;
		   System.out.println(p);
	   }
}
