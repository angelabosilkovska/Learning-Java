package Zadaca03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<String> userMails=new ArrayList<String>();
		String iterModifier=" ";
		
		int duplicates=0;
		for(int i=1; i<=20; i++) {
			if(i<10) {
				iterModifier="0"+i;
			}
			else
			{
				iterModifier=" "+i;
			}
			if(i%2==0) {
				userMails.add("name"+iterModifier+"@mail.com");
			}
			userMails.add("name"+iterModifier+"@mail.com");
		}
		//proverka na duplikati
		HashSet set=new HashSet();
		for(int i=0; i<userMails.size(); i++) {
			if(!set.add(userMails.get(i)))
				duplicates++;
			System.out.println("Duplicate:"+userMails.get(i)+",");
		}
		System.out.println("---------------------");
		System.out.println(set.size()+"records in set:"+set);
		
		int percentage=100*duplicates/userMails.size();
		System.out.println(percentage);
        if(percentage>20) {
        	HashSet firstSet=fillFirstSet();
        	HashSet secondSet=fillSecondSet();
        	
        	HashSet union=new HashSet(firstSet);
        	union.addAll(secondSet);
        	
        	HashSet intersect=new HashSet(firstSet);
        	intersect.retainAll(secondSet);
        	
        	System.out.println("common element for filled sets is"+intersect);
        	
        	//union to list
        	//userMails=null;
        	ArrayList<String> userMailsFiltered=new ArrayList<String>(set);
        	pecatiLista(userMailsFiltered);
        }
	
        //System.out.println(userMails.size());
	}
	       public static HashSet fillFirstSet() {
	    	   HashSet firstSet=new HashSet();
	    	   for(int i=1;i<=11;i++) {
	    		   firstSet.add("name"+i+"@mail.com");
	    	   }
	    	   return firstSet;
	       }
           public static HashSet fillSecondSet() {
        	   HashSet secondSet=new HashSet();
        	   for(int i=11;i<=20;i++) {
        		   secondSet.add("name"+i+"@mail.com");
        	   }
        	   return secondSet;
           }
           public static void pecatiLista(ArrayList<String>listToPrintln) {
        	   Collections.sort(listToPrintln, Collections.reverseOrder());
        	   Iterator iter=listToPrintln.iterator();
        	   
        	   while(iter.hasNext()) {
        		   Object element=iter.next();
        		   System.out.println(element);
        	   }
           }
}    
