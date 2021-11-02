package Zadaca12;

public class Glavna {

	public static void main(String[] args) {
		Predmet p=new Predmet();
		Predmet p1=new Predmet("OOP");
        Predmet p2=new Predmet("Kalkulus","Sonja",6);
        p.ime="Strukturno prog";
        p.profesor="Ramona";
        p.krediti=6;
        p.semestar=1;
        System.out.println(p.ime+p.profesor+p.krediti+p.semestar);
        System.out.println(p1.ime);
        System.out.println(p2.ime+p2.profesor+p2.krediti);
	}

}
