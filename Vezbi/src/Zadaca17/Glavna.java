package Zadaca17;

import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Vnesete a: ");
        a=sc.nextInt();
        System.out.println("Vnesete b: ");
        b=sc.nextInt();
        System.out.println("Vnesete c: ");
        c=sc.nextInt();
        Triagolnik t=new Triagolnik(a, b, c);
        double r=t.Plostina();
        int e=t.Perimetar();
        System.out.println("Perimetarot e "+t.Perimetar()+" a plostinata "+t.Plostina());
	}

}
