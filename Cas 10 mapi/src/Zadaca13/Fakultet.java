package Zadaca13;
import java.util.Map;
import java.util.HashMap;

public class Fakultet {
    private Map<Integer, Student> mapa1=new HashMap<Integer, Student>();
    
    public Fakultet(Map<Integer, Student> mapa1) {
    	int i=0;
    	for(Student s:mapa1.values()) {
    		this.mapa1.put(i+1, s);
    		i++;
    	}	
    }
    public void pecati() {
    	for(Student s:this.mapa1.values()) {
    		System.out.println(s.getIme()+" "+s.getPrezime()+" "+s.getIndeks()+" "+s.getProsek());
    	}
    }
    	public void prebarajPoIme(String imez) {
    		int k=0;
    		for(Student s:this.mapa1.values()) {
    			if(s.getIme().equals(imez)) {
    				System.out.println(s.getIme()+" "+s.getPrezime()+" "+s.getIndeks()+" "+s.getProsek());
    				k++;
    			}
    			if(k==0) {
    				System.out.println("nema");
    			}
    		}
    	}
    }

