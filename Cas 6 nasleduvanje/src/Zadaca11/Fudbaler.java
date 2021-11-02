package Zadaca11;

public class Fudbaler extends Sportist{
   private String pol;
   
   public Fudbaler(String ime, String prezime, int god, int zarabotuvacka, String pol) {
	   super(ime,prezime,god,zarabotuvacka);
	   this.pol=pol;
   }
   public String getPol() {
	   return pol;
   }
 
   @Override 
   public int danok() {
	   int d;
	   d=getZarabotuvacka()*5/100;
	   return d;
  }
}
