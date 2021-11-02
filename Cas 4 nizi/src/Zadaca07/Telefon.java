package Zadaca07;

import java.util.Scanner;

public class Telefon {
	private String marka;
    private String model;
    private String boja;
    private int visina;
    private int tezina;
    
    public Telefon() {
    	marka=" ";
    	model=" ";
    	boja=" ";
    	visina=0;
    	tezina=0;
    }
    public void vnesi() {
 	   Scanner sc=new Scanner(System.in);
 	   System.out.println("Vnesi marka: ");
 	   marka=sc.next();
 	   System.out.println("Vnesi model: ");
 	   model=sc.next();
 	   System.out.println("Vnesi boja: ");
 	   boja=sc.next();
 	   System.out.println("Vnesi visina: ");
 	   visina=sc.nextInt();
 	   System.out.println("Vnesi tezina: ");
 	   tezina=sc.nextInt();
    }
    public void pecati() {
    	System.out.println(marka+" "+model+" "+boja+" "+visina+" "+tezina);
    }
       public void setMarka(String marka) {
		   this.marka=marka;
	   }
	   public void setModel(String model) {
		   this.model=model;
	   }
	   public void setBoja(String boja) {
		   this.boja=boja;
	   }
	   public void setVisina(int visina) {
		   this.visina=visina;
	   }
	   public void setTezina(int tezina) {
		   this.tezina=tezina;
	   }
	   public String getMarka() {
		   	return marka;
	   }
	   public String getModel() {
		   	return model;
	   }
	   public String getBoja() {
		   return boja;
	   }
	   public int getVisina() {
		   	return visina;
	   }
	   public int getTezina() {
		   	return tezina;
	   }
}
