package Zadaca04;

public class Kocka implements Figura{
	int a;
    
    public Kocka(int a) {
    	this.a=a;
    }
    @Override
    public double Plostina() {
    	return 6*Math.pow(a, 2);
    }
    @Override
    public double Volumen() {
    	return Math.pow(a, 3);
    }
}
