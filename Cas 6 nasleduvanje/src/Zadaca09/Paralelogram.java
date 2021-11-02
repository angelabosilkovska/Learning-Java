package Zadaca09;

public class Paralelogram extends Figura {
    private int a;
    private int b;
    private int h;
    
    public Paralelogram() {
    	a=0;
    	b=0;
    	h=0;
    }
    public int getA() {
    	return a;
    }
    public int getB() {
    	return b;
    }
    public int getH() {
    	return h;
    }
    public void setA(int a) {
    	this.a=a;
    }
    public void setB(int b) {
    	this.b=b;
    }
    public void setH(int h) {
    	this.h=h;
    }
    @Override
    public void plostina() {
    	double p;
    	p=(a*h)/2;
    	System.out.println("Ploshtinata na paralelogramot e: "+p);
    }
    @Override
    public void perimetar() {
    	double l;
    	l=2*(a+b);
    	System.out.println("Perimetarot na paralelogramot e: "+l);
    }
}
