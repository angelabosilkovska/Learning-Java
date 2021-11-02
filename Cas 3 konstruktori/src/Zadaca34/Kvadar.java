package Zadaca34;

public class Kvadar {
	   private int a;
	   private int b;
	   private int c;
	   
	   public Kvadar() {
		   a=0;
		   b=0;
		   c=0;
	   }
	   public int geta() {
		   return a;
	   }
	   public void seta(int a) {
		   this.a=a;
	   }
	   public int getb() {
		   return b;
	   }
	   public void setb(int b) {
		   this.b=b;
	   }
	   public int getc() {
		   return c;
	   }
	   public void setc(int c) {
		   this.c=c;
	   }
	   public int plostina() {
		   int p;
		   p=2*(a*b+a*c+b*c);
		   return p;
	   }
	   public int volumen() {
		   int v;
		   v=a*b*c;
		   return v;
	   }
}
