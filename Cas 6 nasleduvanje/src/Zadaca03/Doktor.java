package Zadaca03;

public class Doktor extends Covek{
    private String specijalizacija;
    private int plata;
    private String rabmesto;
    
    public Doktor(String ime, String prezime, double visina, double tezina, String specijalizacija, int plata, String rabmesto) {
    	super(ime,prezime,visina,tezina);
    	this.specijalizacija=specijalizacija;
    	this.plata=plata;
    	this.rabmesto=rabmesto;
    }
       public String getSpecijalizacija() {
       	return specijalizacija;
       }
       public int getPlata() {
       	return plata;
       }
       public String getRabmesto() {
    	   return rabmesto;
       }
       public void setSpecijalizacija(String specijalizacija) {
		   this.specijalizacija=specijalizacija;
	   }
	   public void setPlata(int plata) {
		   this.plata=plata;
	   }
	   public void setRabmesto(String rabmesto) {
		   this.rabmesto=rabmesto;
	   }
}
