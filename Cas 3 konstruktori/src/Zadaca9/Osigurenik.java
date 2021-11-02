package Zadaca9;

public class Osigurenik {
	private String ime;
	private String prezime;
	private String firma;
	private int plata;
	
	public Osigurenik (String ime, String prezime, String firma, int plata) {
		this.ime=ime;
		this.prezime=prezime;
		this.firma=firma;
		this.plata=plata;
	}
void pecati() {
	System.out.println(ime+prezime+firma+plata);
}
	
}
