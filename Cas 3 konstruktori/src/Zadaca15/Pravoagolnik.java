package Zadaca15;

import java.util.Scanner;

public class Pravoagolnik {
	public int a;
    public int b;
    
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
    	System.out.println("a : = "+a+" b: = "+b);
    }
}
