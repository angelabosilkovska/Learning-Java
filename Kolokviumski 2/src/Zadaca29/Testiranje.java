package Zadaca29;
import java.util.ArrayList;

public class Testiranje extends Thread{
   private ArrayList<String> lista;
   private int i=0;
   private int n;
   
   public Testiranje(ArrayList<String> lista, int n) {
	   this.lista=lista;
	   this.n=n;
	   i=lista.size();
   }
   public void run() {
	   while(true) {
		   try {
			   sleep(n);
		   } catch(InterruptedException e) {
			   e.printStackTrace();
		   }
		   System.out.println("Pominaa 2 sekundi"+(n/10000)+" "
				   +(lista.size()-1));
		   i=lista.size();
	   }
   }
}
