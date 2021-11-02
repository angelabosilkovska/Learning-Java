package Zadaca07;

public class Glavna {

	public static void main(String[] args) {
		Student s=new Student("Angela","Bosilkovska",539);
        s.setIme("Marija");
        s.setPrezime("Trajkovska");
        s.indeks=465;
        System.out.println(s.getIme()+s.getPrezime()+s.indeks);
	}

}
