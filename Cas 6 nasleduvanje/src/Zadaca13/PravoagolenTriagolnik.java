package Zadaca13;

public class PravoagolenTriagolnik {
    private int a;
    private int b;
    
    public PravoagolenTriagolnik() {
    	a=3;
    	b=4;
    }
    public int getA() {
    	return a;
    }
    public int getB() {
    	return b;
    }
    public double Hipotenuza() {
    	double h;
    	h=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
    	return h;
    }
}
