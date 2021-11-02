package Zadaca11;

public class Rakometar extends Sportist{
    private int odigraniNatprevari;
    
    public Rakometar(String ime, String prezime, int godinaNaRaganje, int godisnaZarabotuvacka, int odigraniNatprevari) {
    	super(ime,prezime,godinaNaRaganje,godisnaZarabotuvacka);
    	this.odigraniNatprevari=odigraniNatprevari;
    }
    
    public int getNatprevari() {
 	   return odigraniNatprevari;
    }
    
    @Override 
    public int danok() {
 	   int dd=0;
 	   if(getNatprevari()<20)
 		   dd=getGodisnaZarabotuvacka()*7/100;
 	   if(getNatprevari()>=20)
 		   dd=getGodisnaZarabotuvacka()*11/100;
 	   return dd;
    }
}
