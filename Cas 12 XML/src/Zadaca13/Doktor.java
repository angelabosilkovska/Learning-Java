package Zadaca13;

public class Doktor {
   private String ime;
   private String prezime;
   private String specijalizacija;
   private String plata;
   
   public Doktor(String ime, String prezime, String specijalizacija, String plata) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.specijalizacija=specijalizacija;
	   this.plata=plata;
   }
   public String getIme() {
	   return ime;
   }
   public String getPrezime() {
	   return prezime;
   }
   public String getSpecijalizacija() {
	   return specijalizacija;
   }
   public String getPlata() {
	   return plata;
   }
}
