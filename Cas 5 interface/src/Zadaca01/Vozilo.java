package Zadaca01;

public class Vozilo implements AutoHibrid {
    public void TipNaPogon(boolean elektricenPogon, boolean benzinskiPogon) {
    if(elektricenPogon==true)
    	System.out.println("Pogonot e elektricen");
    if(benzinskiPogon==true)
    	System.out.println("Pogonot e benzinski");
}
}