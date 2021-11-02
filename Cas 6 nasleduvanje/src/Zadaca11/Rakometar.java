package Zadaca11;

public class Rakometar extends Sportist{
   private int odigraniNatprevari;
   
   public Rakometar(String ime, String prezime, int god, int zarabotuvacka, int odigraniNatprevari) {
	   super(ime,prezime,god,zarabotuvacka);
	   this.odigraniNatprevari=odigraniNatprevari;
   } 
   public int getNatprevari() {
	   return odigraniNatprevari;
   }

   @Override 
   public int danok() {
	   int dd=0;
	   if(getNatprevari()<20)
		   dd=getZarabotuvacka()*7/100;
	   if(getNatprevari()>=20)
		   dd=getZarabotuvacka()*11/100;
	   return dd;
   }
}
