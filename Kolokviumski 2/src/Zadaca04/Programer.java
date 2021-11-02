package Zadaca04;

public class Programer extends Covek{
    private int plata;
    private double rabotniCasovi;
    
    public Programer(String ime, String prezime, int godinaNaRaganje, int plata, double rabotniCasovi)
    {
    super(ime,prezime,godinaNaRaganje);
    this.plata=plata;
    this.rabotniCasovi=rabotniCasovi;
}
@Override
public double presmetaj(int vrednost) {
	double a=plata+rabotniCasovi*5*4*1.2;
	return a;
}
}