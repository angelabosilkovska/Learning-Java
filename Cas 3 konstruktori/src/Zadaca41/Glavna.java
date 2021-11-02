package Zadaca41;

import java.util.Scanner;

public class Glavna {
    public static void main(String[] args) {
    	Pretplatnik p=new Pretplatnik();
    	String ime,prezime,telefon;
    	
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Vnesete ime: ");
    	ime=sc.nextLine();
    	p.setIme(ime);
    	
    	System.out.println("Vnesete prezime: ");
    	prezime=sc.nextLine();
    	p.setPrezime(prezime);
    	
    	System.out.println("Vnesete telefon: ");
    	telefon=sc.nextLine();
    	p.setTelefon(telefon);
    	
    	System.out.println(p.getIme()+" "+p.getPrezime()+" "+p.getTelefon());
    }
}
