package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Sample {


	public static void main(String args[]) {
		
		List<String>fruitsList = new ArrayList<String>();
	
		fruitsList.add("apple");
		fruitsList.add("potato");
	
		System.out.println(fruitsList);
		
		fruitsList.add(1,"grape");
		fruitsList.add(1,"peach");
		
		System.out.println(fruitsList);
		
		fruitsList.get(0);
		String element1 = fruitsList.get(2);
		System.out.println("二番目の要素:"+element1);
		
		fruitsList.remove(3);
		System.out.println(fruitsList);
		
		fruitsList.remove("peach");
		System.out.println(fruitsList);
		

	
	
	
	}
	
}	
	