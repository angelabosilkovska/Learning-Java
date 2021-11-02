package Zadaca06;

public class Paralelogram extends Pravoagolnik{
    private int h;
    
    public Paralelogram(int a, int b, int h) {
    	super(a,b);
    	this.h=h;
    }
    public int geth() {
 	   return h;
    }
}
