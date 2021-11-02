package Zadaca04;

import java.util.Scanner;

public class Sef extends Vraboten{	
    private String titula;
    private int staz;
    
    public Sef() {
    	super();
    	titula=" ";
    	staz=0;
    }
    public Sef(String ime, String prezime, String ulica, int telefon, String firma, int plata, String titula, int staz) {
    	super(ime,prezime,ulica,telefon,firma,plata);
    	this.titula=titula;
    	this.staz=staz;
    }
    public void VnesS() {
    	VnesV();
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete titula: ");
		titula=sc.nextLine();
		System.out.println("Vnesete staz: ");
		staz=sc.nextInt();
	}
	public void IspisS() {
		IspisV();
		System.out.println(titula+staz);
	}
}
