package Zadaca04;

public abstract class Covek implements IPresmetki{
   private String ime;
   private String prezime;
   private int godinaNaRaganje;
   
   public Covek(String ime, String prezime, int godinaNaRaganje) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.godinaNaRaganje=godinaNaRaganje;
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
   @Override
   public void pecati(String stringZaPecatenje) {
	   System.out.println(ime+prezime+godinaNaRaganje);
   }
}
