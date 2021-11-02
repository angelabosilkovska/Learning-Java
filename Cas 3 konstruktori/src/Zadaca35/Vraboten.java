package Zadaca35;

public class Vraboten {
	  private String ime;
	  private String prezime;
	  private String firma;
	  private String grad;
	  private int bod;
	  private int vrednostnabod;
	   
	  public Vraboten() {
		   ime=" ";
		   prezime=" ";
		   firma=" ";
		   grad=" ";
		   bod=0;
		   vrednostnabod=0;
}
	  public void setIme(String ime) {
		   this.ime=ime;
	   }
	  public void setPrezime(String prezime) {
		   this.prezime=prezime;
	   }
	   public void setFirma(String firma) {
		   this.firma=firma;
	   }
	   public void setGrad(String grad) {
		   this.grad=grad;
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
	   public String getFirma() {
		   return firma;
	   }
	   
	   public String getGrad() {
		   return grad;
	   }
	   public int getBod() {
		   return bod;
	   }
	   
	   public int getVrednostNaBod() {
		   return vrednostnabod;
	   }
	   public int plata() {
		   int p;
		   p=bod*vrednostnabod;
		   return p;
	   }
}