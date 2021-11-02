package Zadaca40;

import Zadaca39.Covek;

public class Glavna {
	public static void main(String[] args) {
	//kreiranje na objekt
    Covek c=new Covek();
    //deklaracija na promenlivi
    String ime, prezime, data;
    double visina,tezina;
    
    //povik na set metodi
    //se vnesuva preku set metoda
    c.setIme("Andrej");
	c.setPrezime("Jovanov");
	c.setTezina(25.8);
	c.setVisina(56);
	c.setData("25.12.2015");
	
	//povik na get metodi
	//se pecati preku get metoda
	ime=c.getIme();
	prezime=c.getPrezime();
	visina=c.getVisina();
	tezina=c.getTezina();
	data=c.getData();
	
	System.out.println(ime+" "+prezime+" "+tezina+" "+visina+" "+data);
    }
}