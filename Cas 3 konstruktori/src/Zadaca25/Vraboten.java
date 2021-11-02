package Zadaca25;

public class Vraboten {
    private String ime;
    private String prezime;
    private String firma;
    private int bod;
    private int vrednostnabod;
    
    public Vraboten(String ime, String prezime,String firma, int bod,int vrednostnabod) {
    	this.ime=ime;
    	this.prezime=prezime;
    	this.firma=firma;
    	this.bod=bod;
    	this.vrednostnabod=vrednostnabod;
    }
    public String getime() {
    	return ime;
    }
    public String getprezime() {
    	return prezime;
    }
    public String getfirma() {
    	return firma;
    }
    public int getbod() {
    	return bod;
    }
    public int getvrednostnabod() {
    	return vrednostnabod;
    }
}