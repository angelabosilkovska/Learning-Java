package Zadaca05;

import java.util.Scanner;

public class Covek {
    private String ime;
    private String prezime;
    private int visina;
    private int tezina;
    
    public Covek() {
    	ime=" ";
    	prezime=" ";
    	visina=0;
    	tezina=0;
    }
    public void vnesi() {
 	   Scanner sc=new Scanner(System.in);
 	   System.out.println("Vnesi ime: ");
 	   ime=sc.next();
 	   System.out.println("Vnesi prezime: ");
 	   prezime=sc.next();
 	   System.out.println("Vnesi visina: ");
 	   visina=sc.nextInt();
 	   System.out.println("Vnesi tezina: ");
 	   tezina=sc.nextInt();
    }
    public void pecati() {
    	System.out.println(ime+" "+prezime+" "+visina+" "+tezina);
    }
       public void setIme(String ime) {
		   this.ime=ime;
	   }
	   public void setPrezime(String prezime) {
		   this.prezime=prezime;
	   }
	   public void setVisina(int visina) {
		   this.visina=visina;
	   }
	   public void setTezina(int tezina) {
		   this.tezina=tezina;
	   }
	   public String getIme() {
		   	return ime;
	   }
	   public String getPrezime() {
		   	return prezime;
	   }
	   public int getVisina() {
		   	return visina;
	   }
	   public int getTezina() {
		   	return tezina;
	   }
}
