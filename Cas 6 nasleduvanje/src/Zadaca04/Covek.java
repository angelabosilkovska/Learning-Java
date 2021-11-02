package Zadaca04;
import java.util.Scanner;

public class Covek {
	private String ime;
	private String prezime;
	private String ulica;
	private int telefon;
	   
	public Covek(String ime, String prezime, String ulica, int telefon) {
		  this.ime=ime;
		  this.prezime=prezime;
		  this.ulica=ulica;
		  this.telefon=telefon;
		  }
	public Covek() {
		ime=" ";
		prezime=" ";
		ulica=" ";
		telefon=0;
	}
	public void VnesC() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete ime: ");
		ime=sc.nextLine();
		System.out.println("Vnesete prezime: ");
		prezime=sc.nextLine();
		System.out.println("Vnesete ulica: ");
		ulica=sc.nextLine();
		System.out.println("Vnesete telefon: ");
		telefon=sc.nextInt();
	}
	public void IspisC() {
		System.out.println(ime+prezime+ulica+telefon);
	}
}
