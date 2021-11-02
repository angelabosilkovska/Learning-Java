package Zadaca17;

public abstract class Nedviznost {
    private String adresa;
    private String grad;
    
    public Nedviznost(String adresa, String grad) {
    	this.adresa=adresa;
    	this.grad=grad;
    }
    public String getAdresa() {
    	return adresa;
    }
    public String getGrad() {
    	return grad;
    }
    public void Pecati() {
    	System.out.println(grad);
    }
    public abstract int Presmetka();
}
