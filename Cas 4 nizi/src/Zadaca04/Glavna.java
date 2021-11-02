package Zadaca04;

import java.util.Scanner;

public class Glavna {
   public static void main(String[] args) {
	   int i,n;
	   Vozilo v3[]=new Vozilo[100];
	   System.out.println("Vnesi n");
	   String marka,model,boja;
	   int cena;
	   Scanner sc=new Scanner(System.in);
	   n=sc.nextInt();
	   for(i=0;i<n;i++) {
		   Vozilo v2=new Vozilo();
		   System.out.println("Vnesi marka ");
		   marka=sc.next();
		   v2.setMarka(marka);
		   System.out.println("Vnesi model ");
		   model=sc.next();
		   v2.setModel(model);
		   System.out.println("Vnesi boja ");
		   boja=sc.next();
		   v2.setBoja(boja);
		   System.out.println("Vnesi cena ");
		   cena=sc.nextInt();
		   v2.setCena(cena);
		   v3[i]=v2;
	   }
   for(i=0;i<n;i++) {
	   marka=v3[i].getMarka();
	   model=v3[i].getMarka();
	   boja=v3[i].getBoja();
	   cena=v3[i].getCena();
	   System.out.println(marka+" "+model+" "+boja+" "+cena);
   }
   }
}