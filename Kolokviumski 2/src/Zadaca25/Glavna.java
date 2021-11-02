package Zadaca25;

import java.util.HashSet;
import java.util.Set;

public class Glavna {
	public static void presek(Set<Integer> mnozestvo1, Set<Integer> mnozestvo2) {
    	mnozestvo1.retainAll(mnozestvo2);
    	System.out.println(mnozestvo1);
    }
    public static void main(String[] args) {
    	Set<Integer> a=new HashSet<Integer>();
    	a.add(5);
    	a.add(3);
    	a.add(15);
    	Set<Integer> b=new HashSet<Integer>();
    	b.add(3);
    	b.add(5);
    	b.add(35);
    	presek(a,b);
    }
}
