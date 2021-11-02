package Zadaca15;

public class Predmet {
   private String ime;
   private String otsek;
   private int semestar;
   private int godina;
   
   public Predmet() {
	   ime=" ";
	   otsek=" ";
	   semestar=0;
	   godina=0;
   }
   public String getIme() {
	   return ime;
   }
   public String getOtsek() {
	   return otsek;
   }
   public int getSemestar() {
	   return semestar;
   }
   public int getGodina() {
	   return godina;
   }
   public void setIme(String ime) {
	   this.ime=ime;
   }
   public void setOtsek(String otsek) {
	   this.otsek=otsek;
   }
   public void setSemestar(int semestar) {
	   this.semestar=semestar;
   }
   public void setGodina(int godina) {
	   this.godina=godina;
   }
   
}
