package Zadaca08;
import java.util.Map;
import java.util.HashMap;

public class Recnik {
    Map<String,String> recnik=new HashMap<String, String>();
    public Recnik() {
    	recnik.put("Zdravo", "Hi");
    	recnik.put("Jas", "I");
    	recnik.put("sum", "am");
    }
    public String prevediZbor(String zbor) {
    	String prevod;
    	prevod=recnik.get(zbor);
    	if(prevod==null)
    		prevod="Nemam prevod za toj zbor";
    	return prevod;
    }
    public void dodadiNovZbor(String zbor, String prevod) {
    	recnik.put(zbor, prevod);
    	}
}
