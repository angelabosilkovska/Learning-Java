package Zadaca03;

public class Fakultet {
    public String nazivNaFax;
    public int brojNaSmerovi;
    public int brojNaStudenti;
    public String dekan;
    public String sediste;
    
    public Fakultet(String nazivNaFax, int brojNaSmerovi, int brojNaStudenti, String dekan, String sediste) {
    	this.nazivNaFax=nazivNaFax;
    	this.brojNaSmerovi=brojNaSmerovi;
    	this.brojNaStudenti=brojNaStudenti;
    	this.dekan=dekan;
    	this.sediste=sediste;
    }
    public int Zgolemuvanje() {
    	int x;
    	x=brojNaStudenti+50;
    	return x;
    }
    public int Namaluvanje() {
    	int namali=20;
    	int y;
    	y=brojNaStudenti-namali;
    	return y;
    }
    public void Pecati() {
    	System.out.println(nazivNaFax+" "+sediste);
    }
}
