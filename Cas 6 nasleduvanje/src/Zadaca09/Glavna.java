package Zadaca09;

import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		Paralelogram p=new Paralelogram();
        Pravoagolnik pr=new Pravoagolnik();
        
        int a,b,h,a1,b1;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Paralelogram ===>> A");
        a=sc.nextInt();
        p.setA(a);
        System.out.println("Paralelogram ===>> B");
        b=sc.nextInt();
        p.setB(b);
        System.out.println("Paralelogram ====>> H");
        h=sc.nextInt();
        p.setH(h);
        System.out.println("");
        p.plostina();
        p.perimetar();
        
        System.out.println("Pravoagolnik ===>> A");
        a1=sc.nextInt();
        pr.setA(a1);
        System.out.println("Pravoagolnik ===>> B");
        b1=sc.nextInt();
        pr.setB(b1);
        pr.plostina();
        pr.perimetar();
	}

}
