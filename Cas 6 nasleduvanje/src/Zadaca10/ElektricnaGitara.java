package Zadaca10;

public class ElektricnaGitara extends Instrument{
    private int brojNaZici;
    
    public ElektricnaGitara(String imeNaInstriment, int brojNaZici) {
    	super(imeNaInstriment);
    	this.brojNaZici=brojNaZici;
    }
    @Override
    public void Pecati() {
    	System.out.println(brojNaZici+" "+getImeNaInstrument());
    }
}
