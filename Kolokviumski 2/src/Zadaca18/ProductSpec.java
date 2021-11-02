package Zadaca18;

public class ProductSpec {
   private int productValue;
   private int productPrice;
   
   public ProductSpec(int productValue, int productPrice) {
	   this.productValue=productValue;
	   this.productPrice=productPrice;
   }
   public int getProductValue() {
	   return productValue;
   }
   public int getProductPrice() {
	   return productPrice;
   }
}
