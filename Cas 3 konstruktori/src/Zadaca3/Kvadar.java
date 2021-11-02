package Zadaca3;

public class Kvadar {
   private int a;
   private int b;
   private int c;
   
   public Kvadar() {
	   a=5;
	   b=6;
	   c=4;
	   
   }
public void pecati() {
	System.out.println(a+b+c);
}
public int volumen() {
	int v=a*b*c;
	return v;
}
public int plostina() {
	int p=2*(a*b+b*c+a*c);
	return p;
}
}
