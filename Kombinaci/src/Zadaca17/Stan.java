package Zadaca17;

public class Stan extends Nedviznost{
     private int brojNaSobi;
     private int kvadratura;
     private int brojNaSpratovi;
     
     public Stan(String adresa, String grad, int brojNaSobi, int kvadratura, int brojNaSpratovi) {
    	 super(adresa,grad);
    	 this.brojNaSobi=brojNaSobi;
    	 this.kvadratura=kvadratura;
    	 this.brojNaSpratovi=brojNaSpratovi;
     }
     public int getBrojNaSobi() {
     	return brojNaSobi;
     }
     public int getKvadratura() {
     	return kvadratura;
     }
     
     @Override
     public int Presmetka() {
     	if(brojNaSobi>=2 || brojNaSpratovi>=2) {
     		int a=kvadratura*700;
     		return a;
     	}
     	if(brojNaSobi>=3 || brojNaSpratovi>=5) {
     		int b=kvadratura*750;
     		return b;
     	}
     	else
     		return 0;
     }
}
