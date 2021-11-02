package Zadaca01;

public class AlociranaMemorija {
    private int size;
    
    public AlociranaMemorija(int size) {
    	this.size=size;
    }
    public void pecati() {
    	System.out.println("Alocirana e memorija od "+size+" MB");
    }
    public int getSize() {
    	return size;
    }
}
