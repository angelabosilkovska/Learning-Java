package Zadaca02;

public class Lice {
   private String ime;
   private String prezime;
   private double visina;
   private double tezina;
   
   public Lice(String ime, String prezime, double visina, double tezina) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.visina=visina;
	   this.tezina=tezina;
   }
   public String getIme() {
	   return ime;
   }
   public String getPrezime() {
	   return prezime;
   }
   public double getVisina() {
	   return visina;
   }
   public double getTezina() {
	   return tezina;
   }
}
