package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodaySummary2 {
	
	public static void main(String args[]) {
		
		Map<String,Integer> productMap = new HashMap<>();
		
		
		
		productMap.put("Apple",100);
		productMap.put("Orenge",80);
		productMap.put("Banana",120);
		productMap.put("Starawberry",300);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("入力して下さい");
		
		String fruitsname = sc.nextLine();
		
		sc.close();
		
		Integer price = productMap.get(fruitsname);
		
		
		if(price != null) {
			System.out.println(fruitsname + ":" +price);
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
		
	}

}
