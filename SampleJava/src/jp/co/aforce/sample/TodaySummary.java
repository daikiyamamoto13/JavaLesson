package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class TodaySummary {
	
	public static void main(String args[]) {
	
	List<String> productList = new ArrayList<String>();
	
		
	 
	productList.add("Apple");
	productList.add("Orange");
	productList.add("Banana");
	productList.add("Strawberry");
	
	String element1 = productList.get(0);
	
	System.out.println(element1);
	
	String product = "Orange";
	
	if(product == "Apple") {
		System.out.println("100円");
	} else {
		System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
	}
	
	
	System.out.println(productList);
	
	
	
	}
}
