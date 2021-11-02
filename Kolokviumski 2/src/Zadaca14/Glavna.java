package Zadaca14;
import java.io.IOException;
import java.util.Scanner;

public class Glavna extends CustomE{

	public static void main(String[] args) {
		int a,b;
		double x;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete a: ");
		a=sc.nextInt();
		System.out.println("Vnesete b: ");
		b=sc.nextInt();
		try {
		     if(b==0) {
		    	 Poraka();
		    	 kraj();
		     }
		     else {
		    	 x=(double)a/b;
		    	 System.out.println(x);
		    	 kraj();
	        }
		}catch(Exception e) {
			
	
	}
   }
}