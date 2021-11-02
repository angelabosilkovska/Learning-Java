package Zadaca14;
import java.util.Scanner;

public class Pravoagolnik {
   private int a;
   private int b;
   public Pravoagolnik() {
	   a=0;
	   b=0;
   }
   public void vnesi() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Vnesete a: ");
	   a=sc.nextInt();
	   System.out.println("Vnesete b: ");
	   b=sc.nextInt();
   }
   public void pecati() {
	   System.out.println("a : - "+a+" b: - "+b);
   }
   public void plostina() {
	   int p;
	   p=a*b;
	   System.out.println("Plostina e; "+p);
   }
   public void perimetar() {
	   int l;
	   l=2*(a+b);
	   System.out.println("Perimetaro e : "+1);
   }
}
