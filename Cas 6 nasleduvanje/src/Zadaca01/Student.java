package Zadaca01;

public class Student extends Covek{
    private int indeks;
    private double prosek;
    
    public Student(String ime, String prezime, int indeks, double prosek) {
    	super(ime,prezime);
    	this.indeks=indeks;
    	this.prosek=prosek;
    }
    public int getIndeks() {
    	return indeks;
    }
    public double getProsek() {
    	return prosek;
    }
    public void setIndeks(int indeks) {
    	this.indeks=indeks;
    }
    public void setProsek(double prosek) {
    	this.prosek=prosek;
    }
}
