package Primer8;

public class Zadaca8 {
	public static void main(String args[]) {
		String ime = "Petko";
		String prezime = "Petkovski";
		String zbir = "96";
		String polozeniPredmeti = "10";
		
		double x;
		double zbir1=Integer.parseInt(zbir);
		double polozeni=Integer.parseInt(polozeniPredmeti);
	    x=zbir1/polozeni;
		System.out.println("Zbirot od odcenite po polozenite predmeti na studentot "+ime+" "+prezime+" iznesuva"+zbir);
		System.out.println(ime+" polozil "+polozeniPredmeti+", sto znaci negovata prosecna ocena iznesuva "+x);	
	}
}
