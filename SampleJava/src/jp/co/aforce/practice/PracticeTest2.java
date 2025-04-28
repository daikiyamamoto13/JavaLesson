package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[]args) {
		
		double TAX;
		TAX = 1.1;
		System.out.println("税率10%");
		
		int x;
		double price;
		x = 480;
		price = x * TAX;
		System.out.println("税込み" + price + "円");
		
		String name;
		name = "Daiki";
		System.out.println(name);
		
		String nedan;
		String en;
		nedan = "この商品の値段は";
		en = "円です。";
		System.out.println(nedan + price + en);
		
		
				
	}

}
