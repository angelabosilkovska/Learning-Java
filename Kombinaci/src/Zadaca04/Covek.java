package Zadaca04;

public class Covek {
    private String ime;
    private String prezime;
    public int godinaNaRaganje;
    
    public Covek(String ime, String prezime, int godinaNaRaganje) {
    	this.ime=ime;
    	this.prezime=prezime;
    	this.godinaNaRaganje=godinaNaRaganje;
    }
    public Covek() {
    	ime=" ";
    	prezime=" ";
    	godinaNaRaganje=0;
    }
    public String getIme() {
	return ime;
}
    public String getPrezime() {
	return prezime;
}
    public void setIme(String ime) {
    	this.ime=ime;
    }
    public void setPrezime(String prezime) {
    	this.prezime=prezime;
    }
}
