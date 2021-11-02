package Zadaca02;

public class Profesor {
	private String ime;
    private String prezime;
    private String titula;
    private int plata;
    
    public Profesor(String ime, String prezime, String titula, int plata) {
    	this.ime=ime;
    	this.prezime=prezime;
    	this.titula=titula;
    	this.plata=plata;
    }
    public Profesor() {
    	ime=" ";
    	prezime=" ";
    	titula=" ";
    	plata=0;
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
