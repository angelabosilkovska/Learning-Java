package Zadaca08;

public class Covek {
	private String ime;
	private String prezime;
	private int maticenBroj;
    
	public Covek() {
		ime=" ";
		prezime=" ";
		maticenBroj=0;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getMaticenBroj() {
		return maticenBroj;
	}
	public void setIme(String ime) {
		this.ime=ime;
	}
	public void setPrezime(String prezime) {
		this.prezime=prezime;
	}
	public void setMaticenBroj(int maticenBroj) {
		this.maticenBroj=maticenBroj;
	}
}
