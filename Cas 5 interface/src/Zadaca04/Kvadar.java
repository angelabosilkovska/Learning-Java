package Zadaca04;

public class Kvadar implements Figura{
    int a;
    int b;
    int c;
    
    public Kvadar(int a,int b, int c) {
    	this.a=a;
    	this.b=b;
    	this.c=c;
    }    
    @Override
    public double Plostina() {
    	double x;
    	x=2*(a*b+b*c+c*a);
    	return x;
    }
    @Override
    public double Volumen() {
    	return a*b*c;
    }
}
