package Zadaca17;

public class Triagolnik {
   private int a;
   private int b;
   private int c;
   
   public Triagolnik(int a, int b, int c) {
	   this.a=a;
	   this.b=b;
	   this.c=c;
   }
   public int Perimetar() {
	   int p;
	   p=a+b+c;
	   return p;
   }
   public double Plostina() {
	   double p1,s;
	   s=(a+b+c)/2;
	   p1=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	   return p1;
   }
}
