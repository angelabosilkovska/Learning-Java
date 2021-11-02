package Zadaca12;

public class Voz extends Transport{
    private double potrosenaStruja;
    private int cena;
    
    public Voz(double tezinaNaTovar, int dolzinaVoKm, double potrosenaStruja,int cena) {
    	super(tezinaNaTovar,dolzinaVoKm);
    	this.potrosenaStruja=potrosenaStruja;
    	this.cena=cena;
    }
    public double getPotrosenaStruja() {
    	return potrosenaStruja;
    }
    public int getCena() {
    	return cena;
    }
    @Override
    public double presmetka()
    {
    	double vv;
    	vv=getPotrosenaStruja()*getCena();
    	return vv;
    }
}
