package Zadaca06;

public class Dekan {
	private String ime;
    private String prezime;
    private String titula;
    private int plata;
    
    public Dekan() {
    	ime=" ";
    	prezime=" ";
    	titula=" ";
    	plata=0;
    }
       public void setIme(String ime) {
		   this.ime=ime;
	   }
	   public void setPrezime(String prezime) {
		   this.prezime=prezime;
	   }
	   public void setTitula(String titula) {
		   this.titula=titula;
	   }
	   public void setPlata(int plata) {
		   this.plata=plata;
	   }
	   public String getIme() {
		   	return ime;
	   }
	   public String getPrezime() {
		   	return prezime;
	   }
	   public String getTitula() {
		   	return titula;
	   }
	   public int getPlata() {
		   	return plata;
	   }
}
