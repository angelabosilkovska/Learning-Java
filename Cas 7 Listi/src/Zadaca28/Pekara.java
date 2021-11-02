package Zadaca28;
import java.util.ArrayList;

public class Pekara {
    private ArrayList<Leb> lagerlista=new ArrayList<Leb>();
    
    public Pekara(ArrayList<Leb> lista) {
    	for(int i=0;i<lista.size();i++) {
    		this.lagerlista.add(lista.get(i));
    	}
    }
    
}
