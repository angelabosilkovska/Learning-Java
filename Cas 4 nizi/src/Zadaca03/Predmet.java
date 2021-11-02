package Zadaca03;

public class Predmet {
   private String ime;
   private String otsek;
   private String semestar;
   private int krediti;
   
   public Predmet(String ime, String otsek, String semestar, int krediti) {
   	this.ime=ime;
   	this.otsek=otsek;
   	this.semestar=semestar;
   	this.krediti=krediti;
   }
   public Predmet() {
   	ime=" ";
   	otsek=" ";
   	semestar=" ";
   	krediti=0;
   }
   public String getIme() {
   	return ime;
   }
   public String getOtsek() {
   	return otsek;
   }
   public String getSemestar() {
   	return semestar;
   }
   public int getKrediti() {
   	return krediti;
   }
}