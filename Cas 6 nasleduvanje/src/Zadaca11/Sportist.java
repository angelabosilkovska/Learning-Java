package Zadaca11;

public abstract class Sportist {
	private String ime;
    private String prezime;
    private int god;
    private int zarabotuvacka;
    
    public Sportist(String ime, String prezime, int god, int zarabotuvacka) {
    	this.ime=ime;
    	this.prezime=prezime;
    	this.god=god;
    	this.zarabotuvacka=zarabotuvacka;
    }
    public String getIme() {
    	return ime;
    }
    public String getPrezime() {
    	return prezime;
    }
    public int getGod() {
    	return god;
    }
    public int getZarabotuvacka() {
 	   return zarabotuvacka;
    }
    public abstract int danok();
}
