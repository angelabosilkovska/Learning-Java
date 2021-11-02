package Zadaca16;
import java.util.Scanner;

public class Glavna {
public static void main(String[] args) {
	Kvadar k=new Kvadar();
	Kvadar k1=new Kvadar();
	
	Scanner sc=new Scanner (System.in);
	System.out.println("se vnesuvaat podatoci za prv kvadar ");
	System.out.println("Vneszi a: ");
	k.a=sc.nextInt();
	System.out.println("Vnesi b: ");
	k.b=sc.nextInt();
	System.out.println("Vnesi c: ");
	k.c=sc.nextInt();
	
	System.out.println();
	System.out.println("Se vnesuvaat podatoci za vtor kvadar ");
	System.out.println("Vnesi a: ");
	k1.a=sc.nextInt();
	System.out.println("Vnesi b: ");
	k1.b=sc.nextInt();
	System.out.println("Vnesi c: ");
	k1.c=sc.nextInt();
	
	System.out.println(k.a+" "+k.b+" "+k.c);
	
	  int p1,v1;
	  p1=2*(k.a*k.b+k.a*k.c+k.b*k.c);
	  v1=(k.a*k.b*k.c);
	     System.out.println("Plostina e "+p1);
	     System.out.println("Volumen e "+v1);
	     System.out.println(k1.a+" "+k1.b+" "+k1.c);
	     int p2,v2;
	     p2=2*(k1.a*k1.b+k1.a*k1.c+k1.b*k1.c);
	     v2=(k1.a*k1.b*k1.c);
	     System.out.println("----------");
	     if(p1>p2)
	    	 System.out.println("Prvata plostina e pogolema od vtorata");
	     else
	    	 System.out.println("Vtorata plostina e pogolema od prvata");
	     if(v1>v2)
	    	 System.out.println("Prviot volumen e pogolem od vtoriot");
	     else
	    	 System.out.println("Vtooriot volumen e pogollem od prviot");
	     
}
}
