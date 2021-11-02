package Zadaca16;

public class Programer extends Covek{
   private int plata;
   private int brojNaSedmici;
         
   public Programer(String ime, String prezime, int godini, int plata, int brojNaSedmici) {
	   super(ime,prezime,godini);
	   this.plata=plata;
	   this.brojNaSedmici=brojNaSedmici;
   }
   public double Presmetaj(double rabotiniCasoviVoEdnaSedmica) {
	   double x;
	   x=plata*rabotiniCasoviVoEdnaSedmica*brojNaSedmici*5;
	   return x;
   }
}
