package Zadaca01;

public class Parfem {
    private String ime;
    private int godinaNaProizvodstvo;
    private double procentAlkohol;
    private String sodrziAlkohol;
    
    public Parfem() {
    	ime=" ";
    	godinaNaProizvodstvo=0;
    	procentAlkohol=0.0;
    	sodrziAlkohol=" ";
    }
    public String getIme() {
    	return ime;
    }
    public int getGodinaNaProizvodstvo() {
    	return godinaNaProizvodstvo;
    }
    public double getProcentAlkohol() {
    	return procentAlkohol;
    }
    public String getSodrziAlkohol() {
    	return sodrziAlkohol;
    }
    public void setIme(String ime) {
    	this.ime=ime;
    }
    public void setGodinaNaProizvodstvo(int godinaNaProizvodstvo) {
    	this.godinaNaProizvodstvo=godinaNaProizvodstvo;
    }
    public void setProcentAlkohol(double procentAlkohol) {
    	this.procentAlkohol=procentAlkohol;
    }
    public void setSodrziAlkohol(String sodrziAlkohol) {
    	this.sodrziAlkohol=sodrziAlkohol;
    }
}
