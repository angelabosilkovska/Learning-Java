package Zadaca10;

public class Predmet {
	private String ime;
	private String semestar;
	private String otsek;
	private int krediti;
	
	public Predmet (String ime, String otsek, String semestar,int krediti) {
		this.ime=ime;
		this.otsek=otsek;
		this.semestar=semestar;
		this.krediti=krediti;
	}
void pecati() {
	System.out.println(ime+otsek+semestar+krediti);
}
}
