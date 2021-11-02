package Zadaca08;

public class Glavna {

	public static void main(String[] args) {
		Recnik recnik=new Recnik();
		System.out.println(recnik.prevediZbor("Zdravo"));
		System.out.println(recnik.prevediZbor("Priatno"));
		recnik.dodadiNovZbor("Priatno", "Bye");
		System.out.println(recnik.prevediZbor("Priatno"));
	}

}
