package Zadaca31;

public class Vraboten {
private String ime;
private String prezime;
private String firma;
private int plata;

public Vraboten(String ime, String prezime, String firma, int plata) {
	this.ime=ime;
	this.prezime=prezime;
	this.plata=plata;
	this.firma=firma;
}
public String getIme() {
	return ime;
}
public String getPrezime() {
	return prezime;
}
public String getFirma() {
	return firma;
}
public int getPlata() {
	return plata;
}
}
