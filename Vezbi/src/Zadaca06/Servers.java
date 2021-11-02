package Zadaca06;

public class Servers {
   private String processors;
   private String niCIP;
   private String hddSize;
   
   public void setProcessors(String processors) {
	   this.processors=processors;
   }
   public void setNiCip(String niCIP) {
	   this.niCIP=niCIP;
   }
   public void setHddSize(String hddSize) {
	   this.hddSize=hddSize;
   }
   public String getProcessors() {
	   return processors;
   }
   public String getNiCIP() {
	   return niCIP;
   }
   public String getHddSize() {
	   return hddSize;
   }
}
