package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractise {
	public static void main(String[] args) {
		
		//decleration common way
		
		ArrayList S=new ArrayList();
		S.add(100);
		S.add("abc");
		S.add('B');
		S.add(100);
		S.add(100);
		
		System.out.println(S);
		
		// Data Modify
		S.add(3, "SAm");
		System.out.println(S);
		S.add(1, 123);
		System.out.println(S);
		
		//Data Replase
		
	  S.set(0, 10);
	  System.out.println(S);
	  S.set(6, 100);
	  System.out.println(S);
	  
	  //Data remove
	  
	  S.remove(1);
	  System.out.println(S);
	  
	  // isEmpty
	  
	  System.out.println(S.isEmpty());
	  
	  //Array Size
	  
	  System.out.println(S.size());
	  
	  //contain
	  
	  System.out.println(S.contains(10));
	  System.out.println(S.contains("abc"));
	  
	  
	  //index==location
	  System.out.println(S.indexOf(100));
	  System.out.println(S.lastIndexOf(100));
	  
	  //will help you to find data at perticular index.
	  
	  System.out.println(S.get(3));
	  
	  //for Loops
	  
	  for(int i=0;i<S.size();i++) {
		  System.out.print(S.get(i)+ " ");
	  }
	
	
	  //Modify For Loop
	  
	  System.out.println();
	  for (Object value:S) {
	  System.out.print(value+ " ");
	  }
	  
	  System.out.println();
	  
	  
	  //iterators
	  
	  Iterator I= S.iterator();
	  while(I.hasNext()) {
		  System.out.print(I.next()+" ");
	  }
	  System.out.println();
	  // lisiterators
	  
	  
	  ListIterator L=S.listIterator();
	  while(L.hasNext()) {
		  System.out.print(L.next()+" ");
	  }
	  
	  
	
	  
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//generic way ==homogeneous information
		ArrayList<String> A=new ArrayList<String>();
		A.add("sam");
		ArrayList<Integer> B=new ArrayList<Integer>();
		B.add(23);
		B.add(2343);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}

