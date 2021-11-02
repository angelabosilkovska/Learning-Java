package Zadaca26;
import java.util.Scanner;

public class Kvadar {
   private int a;
   private int b;
   private int c;
   
   public Kvadar() {
	   a=0;
	   b=0;
	   c=0;
   }
   public void vnesi() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Vnesi a: ");
	   a=sc.nextInt();
	   System.out.println("Vnesi b: ");
	   b=sc.nextInt();
	   System.out.println("Vnesi c: ");
	   c=sc.nextInt();
   }
   public int geta() {
	   return a;
   }
   public int getb() {
	   return b;
   }
   public int getc() {
	   return c;
   }
}
