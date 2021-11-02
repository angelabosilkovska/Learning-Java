package Zadaca02;

public class Avtomobil {
    public String marka;
    public String model;
    public String boja;
    public int pominatiKm;
    public int godinaNaProizvodstvo;
    public int registracija;
    
    public Avtomobil(String marka, String model, String boja, int pominatiKm, int godinaNaProizvodstvo, int registracija) {
    	this.marka=marka;
    	this.model=model;
    	this.boja=boja;
    	this.pominatiKm=pominatiKm;
    	this.godinaNaProizvodstvo=godinaNaProizvodstvo;
    	this.registracija=registracija;
    }
    public void Pecati() {
    	System.out.println(marka+model+boja);
    }
    public double Vrakja() {
    	double x;
    	x=pominatiKm+1520.25;
    	return x;
    }
}
