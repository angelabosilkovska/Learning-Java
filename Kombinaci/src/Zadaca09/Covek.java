package Zadaca09;

public class Covek {
    private String ime;
    private String prezime;
    private int godini;
    
    public Covek(String ime, String prezime, int godini) {
    	this.ime=ime;
    	this.prezime=prezime;
    	this.godini=godini;
    }
    public String getIme() {
	    return ime;
    }
    public String getPrezime() {
	    return prezime;
    }
    public int getGodini() {
    	return godini;
    }
}
