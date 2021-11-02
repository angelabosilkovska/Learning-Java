package Zadaca11;

public class Glavna {

	public static void main(String[] args) {
		Rakometar r=new Rakometar("Petko","Petkovski",1990,150000,50);
		Fudbaler f=new Fudbaler("Trajko","Trajkovski",1992,160000,"Masko");
        System.out.println(r.getIme()+" "+r.getPrezime()+" "+r.getGodinaNaRaganje()+" "+r.getGodisnaZarabotuvacka()+" "+r.getNatprevari());
        int rr=r.danok();
        System.out.println(rr);
        System.out.println(f.getIme()+" "+f.getPrezime()+" "+f.getGodinaNaRaganje()+" "+f.getGodisnaZarabotuvacka()+f.getPol());
        int ff=f.danok();
        System.out.println(ff);
	}

}
