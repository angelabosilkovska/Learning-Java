package Zadaca19;

public class Telefon {
   public String marka;
   public String model;
   private int cena;
   
   public Telefon() {
	   
   }
   
   public Telefon(int cena) {
	   this.cena=cena;
   }
   public int getCena() {
	   return cena;
   }
   public int compareTo(Telefon t1) {
	   return 0;
   }
}
