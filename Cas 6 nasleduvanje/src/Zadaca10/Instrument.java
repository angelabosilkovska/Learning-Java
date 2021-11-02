package Zadaca10;

public abstract class Instrument {
	private String imeNaInstrument;
	
	public Instrument(String imeNaInstrument) {
		this.imeNaInstrument=imeNaInstrument;
	}
	public String getImeNaInstrument() {
		return imeNaInstrument;
	}
    public abstract void Pecati();
}
