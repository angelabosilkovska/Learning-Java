package Zadaca8;

public class Paralelogram {
	private int a;
	private int b;
	private int h;
	
	public Paralelogram (int a, int b, int h) {
		this.a=a;
		this.b=b;
		this.h=h;
	}
public void pecati() {
		System.out.println(a+" "+b+" "+h);
	}
public int plostina() {
	int p=a*h/2;
	return p;
}
public int perimetar() {
	int l=2*(a=b);
	return l;
}
}
