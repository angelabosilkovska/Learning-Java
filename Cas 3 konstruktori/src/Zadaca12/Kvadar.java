package Zadaca12;

import java.util.Scanner;

public class Kvadar {
   private int a;
   private int b;
   private int c;
   
   public Kvadar() {
	   a=5;
	   b=3;
	   c=6;
   }
   public void vnesi() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Vnesete a: ");
	   a=sc.nextInt();
	   System.out.println("Vnesete b: ");
	   b=sc.nextInt();
	   System.out.println("Vnesete c: ");
	   c=sc.nextInt();
   }
   public void pecati() {
	   System.out.println(a+" "+b+" "+c);
   }
   public int plostina() {
		int p=2*(a*b+a*c+b*c);
		return p;
	}
	public int volumen() {
		int v=a*a*b*c;
		return v;
}
}