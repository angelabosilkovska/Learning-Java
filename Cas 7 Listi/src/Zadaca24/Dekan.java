package Zadaca24;

public class Dekan {
	private String ime;
	private String prezime;
	private String titula;
	private int plata;
	private String oblast;
	
	public Dekan(String ime, String prezime, String titula, int plata, String oblast) {
		this.ime=ime;
		this.prezime=prezime;
		this.titula=titula;
		this.plata=plata;
		this.oblast=oblast;
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
	public String getOblast() {
		return oblast;
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
	public void setOblast(String oblast) {
		this.oblast=oblast;
	}
}
