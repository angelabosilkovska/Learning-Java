package Zadaca12;

public class Predmet {
    public String ime;
    public String profesor;
    public int krediti;
    public int semestar;
    
    public Predmet() {
    	ime=" ";
    	profesor=" ";
    	krediti=0;
    	semestar=0;
    }
    public Predmet(String ime) {
    	this.ime=ime;
    }    
    public Predmet(String ime, String profesor, int krediti) {
    	this.ime=ime;
    	this.profesor=profesor;
    	this.krediti=krediti;
    }
}
