package Zadaca41;

public class Pretplatnik {
    private String ime;
    private String prezime;
    private String telefon;
    
    public Pretplatnik() {
    	ime=" ";
    	prezime=" ";
    	telefon=" ";
    }
    public String getIme() {
    	return ime;
    }
    public String getPrezime() {
    	return prezime;
    }
    public String getTelefon() {
    	return telefon;
    }
    public void setIme(String ime) {
    	this.ime=ime;
    }
    public void setPrezime(String prezime) {
    	this.prezime=prezime;
    }
    public void setTelefon(String telefon) {
    	this.telefon=telefon;
    }
}
