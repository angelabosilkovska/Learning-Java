package Zadaca05;

public class Student extends Covek {
    private int indeks;
    private double prosek;
    
    public Student(String ime, String prezime, int godinaNaRaganje, int indeks, double prosek) {
    	super(ime,prezime,godinaNaRaganje);
    	this.indeks=indeks;
    	this.prosek=prosek;
    }
    @Override
    public String toString() {
    	return getIme()+" "+getPrezime()+" "+godinaNaRaganje+" "+indeks+" "+prosek;
    }
}
