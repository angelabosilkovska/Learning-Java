package Zadaca07;

public class Student {
   private String ime;
   private String prezime;
   public int indeks;
   
   public Student(String ime, String prezime, int indeks) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.indeks=indeks;
   }
        public String getIme() {
		    return ime;
	    }
	    public String getPrezime() {
		    return prezime;
	    }
	    public void setIme(String ime) {
	    	this.ime=ime;
	    }
	    public void setPrezime(String prezime) {
	    	this.prezime=prezime;
	    }
}
