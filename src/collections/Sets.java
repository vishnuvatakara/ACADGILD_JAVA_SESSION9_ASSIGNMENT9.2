package collections;

import java.util.HashSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s1=new HashSet<String>();	//creating a first set
		s1.add("vishnu");	//add input to set1
		s1.add("vipin");
		HashSet<String> s2=new HashSet<String>();	//creating a second set
		s2.add("1234");
		s2.add("45664");//add input to set2
		//displaying two sets
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("after union operation");
		boolean result=s1.addAll(s2);	//performing union operation
		if(result) {
			System.out.println(s1);
			
		  }

	}

}
