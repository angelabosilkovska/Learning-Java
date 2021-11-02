package Zadaca11;

public abstract class Sportist {
   private String ime;
   private String prezime;
   private int godinaNaRaganje;
   private int godisnaZarabotuvacka;
   
   public Sportist(String ime, String prezime, int godinaNaRaganje, int godisnaZarabotuvacka) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.godinaNaRaganje=godinaNaRaganje;
	   this.godisnaZarabotuvacka=godisnaZarabotuvacka;
   }
   public String getIme() {
   	return ime;
   }
   public String getPrezime() {
   	return prezime;
   }
   public int getGodinaNaRaganje() {
   	return godinaNaRaganje;
   }
   public int getGodisnaZarabotuvacka() {
	   return godisnaZarabotuvacka;
   }
   public abstract int danok();
}
