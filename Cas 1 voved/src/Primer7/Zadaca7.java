package Primer7;

public class Zadaca7 {
	public static void main(String[] args) {
		String grad1 = "Bitola";
		String grad2 = "Skopje";
		String edinica = "h";
		String pat = "170";
		String vreme ="2.5";
		int patBroj=Integer.parseInt(pat);
		double vremeBroj=Double.parseDouble(vreme);
		
		double x=patBroj/vremeBroj;
		System.out.println("Rastojanieto"+" "+"pomegu"+" "+grad1+" "+"i"+" "+grad2+","+" "
		+"izrazeno"+" "+"vo"+" "+"kilometri,"+" iznesuva "+pat+".");
		System.out.println();
		System.out.println("Eden"+" "+"vozac"+" "+"go"+" "+"izvozil"+" "+"ova"+" "+
		"rastojanie"+" "+"za"+" "+vreme+edinica+","+" "+"sto"+" "+"znachi,"+" "+"negovata"+
				" "+"prosecna"+" "+"brzina"+" "+"iznesuvala"+" "+x+" "+"km/h.");
	}
}
