package Zadaca25;

public class Kvadar {
   private int a;
   private int b;
   private int c;
   
   public Kvadar() {
	   a=0;
	   b=0;
	   c=0;
   }
   public int getA() {
	   return a;
   }
   public int getB() {
	   return b;
   }
   public int getC() {
	   return c;
   }
   public void setA(int a) {
	   this.a=a;
   }
   public void setB(int b) {
	   this.b=b;
   }
   public void setC(int c) {
	   this.c=c;
   }
   public int plostina() {
	   int x=2*(a*b+a*c+b*c);
	   return x;
   }
   public int volumen() {
	   int y=a*b*c;
	   return y;
   }
   
}
