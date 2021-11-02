package Zadaca07;

public class Vozilo implements AutoHibrid{
	@Override
     public String tipNaPogon(Boolean elektricenPogon, Boolean benzinskiPogon) {
    	 if (elektricenPogon==true) {
    		 return "Na elektricen pogon";}
    		 else
    			 return "na benzin";
    	 }
     }
