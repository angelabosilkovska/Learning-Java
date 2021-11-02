package Zadaca17;

public class Glavna {

	public static void main(String[] args) {
	    Kukja k=new Kukja("Partizanska 13","Bitola",2,300);
	    Stan s=new Stan("Partizanska 40","Skopje",5,100,3);
	    k.Presmetka();
	    s.Presmetka();
	    System.out.println(k.getAdresa()+" "+k.getGrad()+" "+k.getBrojNaSpratovi()+" "+k.getKvadratura()+" "+k.Presmetka());
	    System.out.println(s.getAdresa()+" "+s.getGrad()+" "+s.getBrojNaSobi()+" "+s.getKvadratura()+" "+s.Presmetka());
	    
	}

}
