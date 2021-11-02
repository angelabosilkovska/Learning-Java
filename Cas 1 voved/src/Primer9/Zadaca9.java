package Primer9;

public class Zadaca9 {
	public static void main(String args[]) {
		String article1 = "чоколадо";
		String price1 = "50";
		String quantity = "5";
		String article2 = "сок";
		String price2 = "35";
		String unit = "денар";
		int x;
		int y;
		int z;
		int price22=Integer.parseInt(price2);
		int price11=Integer.parseInt(price1);
		int quantityy=Integer.parseInt(quantity);
		y=price22*quantityy;
		x=price11*quantityy;
		z=x+y;
		
		System.out.println("Сметка:");
		System.out.println("Едно"+" "+article1+"-"+price1+" "+unit+"и.");
		System.out.println(price1+" "+"x"+" "+quantity+" "+"="+" "+x);
		System.out.println("Еден"+" "+article2+"-"+price2+" "+unit+"и.");
		System.out.println("Вкупна"+" "+"цена:"+" "+z);
	}
}
