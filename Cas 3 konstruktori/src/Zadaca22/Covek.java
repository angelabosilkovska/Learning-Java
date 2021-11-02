package Zadaca22;

public class Covek {
    private String ime;
    private String prezime;
    private double visina;
    private double tezina;
    private String data;
    public Covek(String ime,String prezime,int visine, int tezina, String data) {
    	this.ime=ime;
    	this.prezime=prezime;
    	this.visina=visina;
    	this.tezina=tezina;
    	this.data=data;
    }
    public String getime() {
    	return ime;
    }
    public String getprezime() {
    	return prezime;
    }
    public double getvisina() {
    	return visina;
    }
    public double gettezina() {
    	return tezina;
    }
    public String getdata() {
    	return data;
    }
} 
