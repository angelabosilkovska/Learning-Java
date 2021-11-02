package Zadaca13;

public class Printer  extends Thread{
    private double interval;
    private int n;
    
    public Printer(double interval, int n) {
    	this.interval=interval;
    	this.n=n;
    }
    public void StartPrint() {
    	for(int i=0;i<n;i++){
    		System.out.println("Pominaa 0.5 sekundi");
    		try {
    			sleep((long)interval);
    		} catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    }
}
