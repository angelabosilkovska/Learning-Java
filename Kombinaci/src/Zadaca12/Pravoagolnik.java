package Zadaca12;

public class Pravoagolnik {
    private int a;
    private int b;
        
    public Pravoagolnik(int a, int b) {
    	this.a=a;
    	this.b=b;
    }
    public double Dijagonala() {
    	double d;
    	d=Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
    	return d;
    }
}
