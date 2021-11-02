package Zadaca17;

public class Kukja extends Nedviznost{
    private int brojNaSpratovi;
    private int kvadratura;
    
    public Kukja(String adresa, String grad, int brojNaSpratovi, int kvadratura) {
    	super(adresa,grad);
    	this.brojNaSpratovi=brojNaSpratovi;
    	this.kvadratura=kvadratura;
    }
    public int getBrojNaSpratovi() {
    	return brojNaSpratovi;
    }
    public int getKvadratura() {
    	return kvadratura;
    }
    
    @Override
    public int Presmetka() {
    	if (getGrad().equals("Bitola") || brojNaSpratovi<=1) {
    		int a=kvadratura*700;
    		return a;
    	}
    	if (getGrad().equals("Ohrid") || brojNaSpratovi>=2) {
    		int b=kvadratura*900;
    		return b;
    	}
    	else
    		return 0;
    }
}
