package Zadaca36;

public class Glavna {
    public static void main(String[] args) {
       Dekan d=new Dekan();
  	   d.setIme("Angela");
  	   d.setPrezime("Bosilkovska");
  	   d.setUlica("Partizanska");
  	   d.setTelefon(563364);
  	   d.setFakultet("FIKT");
  	   d.setEmbg(64646);
  	   d.setBod(53);
  	   d.setVrednostNaBod(675);
  	   System.out.println(d.getIme()+" "+d.getPrezime()+" "+d.getUlica()+" "+d.getTelefon()+" "+d.getFakultet()+" "+d.getEmbg()+" "+d.getBod()+" "+d.getVrednostNaBod());
  	   
  	   Direktor dd=new Direktor();
  	   dd.setIme("Simona");
	   dd.setPrezime("Markoska");
	   dd.setUlica("Partizanska");
	   dd.setTelefon(46564);
	   dd.setFakultet("FIKT");
	   dd.setEmbg(5425);
	   dd.setBod(23);
	   dd.setVrednostNaBod(522);
	   System.out.println(dd.getIme()+" "+dd.getPrezime()+" "+dd.getUlica()+" "+dd.getTelefon()+" "+dd.getFakultet()+" "+dd.getEmbg()+" "+dd.getBod()+" "+dd.getVrednostNaBod());
  	   
    }
  
}
