package Zadaca09;

public class Pravoagolnik extends Figura{
    private int a;
    private int b;
    
    public Pravoagolnik() {
    	a=0;
    	b=0;
    }
    public int getA() {
    	return a;
    }
    public int getB() {
    	return b;
    }
    public void setA(int a) {
    	this.a=a;
    }
    public void setB(int b) {
    	this.b=b;
    }
    @Override
    public void plostina() {
    	int p;
    	p=a*b;
    	System.out.println("Plostiknata na pravoagolnikot e: "+p);
    }
    @Override 
    public void perimetar() {
    	int l;
    	l=2*(a+b);
    	System.out.println("Perimetarot na pravoagolnikot e: "+l);
    }
}
