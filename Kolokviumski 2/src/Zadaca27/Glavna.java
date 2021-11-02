package Zadaca27;
import java.io.IOException;

public class Glavna extends IOException{

	public static void main(String[] args) {
		int a,b,c=0;
		a=5;
		b=0;
		try {
		     if(b==0) {
		    	 throw new CustomE();
		     }
		     else
		    	 c=a/b;
	        }
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Kraj na programata");
		}
		System.out.println(c);
    }
}