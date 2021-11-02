package Zadaca11;

public class Fudbaler extends Sportist{
     private String pol;
     
     public Fudbaler(String ime, String prezime, int godinaNaRaganje, int godisnaZarabotuvacka, String pol) {
    	 super(ime,prezime,godinaNaRaganje,godisnaZarabotuvacka);
    	 this.pol=pol;
     }
     
     public String getPol() {
  	   return pol;
     }
   
     @Override 
     public int danok() {
  	   int d;
  	   d=getGodisnaZarabotuvacka()*5/100;
  	   return d;
    }
}
