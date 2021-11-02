package Zadaca36;

public class Dekan {
	  private String ime;
	  private String prezime;
	  private String ulica;
	  private int telefon;
	  private String fakultet;
	  private int embg;
	  private int bod;
	  private int vrednostnabod;
	   
	  public Dekan() {
		   ime=" ";
		   prezime=" ";
		   ulica=" ";
		   telefon=0;
		   fakultet=" ";
		   embg=0;
		   bod=0;
		   vrednostnabod=0;
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
	   public void setTelefon(int telefon) {
		   this.telefon=telefon;
	   }
	   public void setFakultet(String fakultet) {
		   this.fakultet=fakultet;
	   }
	   public void setEmbg(int embg) {
		   this.embg=embg;
	   }
	   public void setBod(int bod) {
		   this.bod=bod;
	   }
	   public void setVrednostNaBod(int vrednostnabod) {
		   this.vrednostnabod=vrednostnabod;
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
	   
	   public int getTelefon() {
		   return telefon;
	   }
	   public String getFakultet() {
		   return fakultet;
	   }
	   public int getEmbg() {
		   return embg;
	   }
	   public int getBod() {
		   return bod;
	   }
	   
	   public int getVrednostNaBod() {
		   return vrednostnabod;
	   }
}
