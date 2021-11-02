package Zadaca16;

public class Student extends Covek{
    private int indeks;
    private double prosek;
    
    public Student(String ime, String prezime, int godinaNaRagenje, int indeks, double prosek) {
    	super(ime,prezime,godinaNaRagenje);
    	this.indeks=indeks;
    	this.prosek=prosek;
    }
    @Override
    public String toString() {
    	return getIme()+" "+getPrezime()+" "+godinaNaRaganje+" "+indeks+" "+prosek;
    }
}
