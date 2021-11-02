package Zadaca13;

import java.util.Scanner;

public class Direktor {
	   private String ime;
	   private String prezime;
	   private String uciliste;
	   private int bod;
	   private int vbod;
	   
       public Direktor() {
	   ime="Trajko ";
	   prezime="Trajkovski ";
	   uciliste="Kliment Ohridski";
	   bod=70;
	   vbod=5;
}
       public void vnesi() {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Vneseteime: ");
    	   ime=sc.nextLine();
    	   System.out.println("Vneseteprezime: ");
    	   prezime=sc.nextLine();
    	   System.out.println("Vneseteuciliste: ");
    	   uciliste=sc.nextLine();
    	   System.out.println("Vnesetebod: ");
    	   bod=sc.nextInt();
    	   System.out.println("Vnesetevbod: ");
    	   vbod=sc.nextInt();
    	   }
       public void pecati() {
    	   System.out.println(ime+" "+prezime+" "+uciliste+" "+bod+" "+vbod);
}
       public int plata() {
    	   int a=70;
    	   int b=5;
    	   int x=a*b;
    	   return x;
       }
}
       