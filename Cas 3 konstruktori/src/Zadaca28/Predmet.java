package Zadaca28;

public class Predmet {
   private String ime;
   private String otsek;
   private String semestar;
   private int krediti;
   
   public Predmet(String ime, String otsek, String sesmestar, int krediti) {
	   this.ime=ime;
	   this.otsek=otsek;
	   this.semestar=semestar;
	   this.krediti=krediti;
   }
   public void pecati() {
	   System.out.println(ime+" "+otsek+" "+semestar+" "+krediti);
   }
   public void setime(String ime) {
	   this.ime=ime;
}
   public void setotsek(String otsek) {
	   this.otsek=otsek;
   }
   public void setsemestar(String semestar) {
	   this.semestar=semestar;
   }
   public void setkrediti(int krediti) {
	   this.krediti=krediti;
   }
}