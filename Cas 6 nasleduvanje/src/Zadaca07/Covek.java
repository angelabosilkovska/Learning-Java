package Zadaca07;

public class Covek {
	private String ime;
	private String prezime;
	private String ulica;
	private int embg;
	
	public Covek() {
		ime=" ";
		prezime=" ";
		ulica=" ";
		embg=0;
	}
	 public String getIme() {
		   return ime;
	   }
	 public String getPrezime() {
		 return prezime;
	 }
	 public String getUlica() {
		   return ulica;
	   }
	 public int getEmbg() {
		   return embg;
	   }
	 public void setIme(String ime) {
		   this.ime=ime;
	   }
	 public void setPrezime(String prezime) {
		 this.prezime=prezime;
	 }
	 public void setUlica(String ulica) {
		   this.ulica=ulica;
	   }
	 public void setEmbg(int embg) {
		   this.embg=embg;
	   }
}
