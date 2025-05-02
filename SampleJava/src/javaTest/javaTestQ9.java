package javaTest;

import java.util.Scanner;

public class javaTestQ9 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("商品の単価を入力してください");
		
		int money = scanner.nextInt();
		
		System.out.println("購入個数を入力してください");
		
		int x = scanner.nextInt();
		
		int total = money * x;
		
		if (total <= 5_000) {
			double total5 = total / 0.05;
			double total55 = total5 - total;
		} else if(total <= 10_000);
			double total10 = total / 0.1 ;
			double total1010 = total10 - total;
		
		if (x >= 3) {
			double total3up5 = total5 - 50 * x;
			double total3up10 = total10 - 50 * x;
					
		} else if (x >= 5) {
			double total5up5 = total5 - 100 * x;
			double total5up10 = total10 - 100 * x;
		}
		
		double intax1 = total3up5 * 1.1;
		double intax2 = total3up10 * 1.1;
		double intax3 = total5up5 * 1.1;
		double intax4 = total5up10 * 1.1;
		
		System.out.println("商品の単価：" + money + "円");
		System.out.println("購入個数：" + x +"個");
		System.out.println("割引前合計額：" + total + "円");
		System.out.println("割引額：" + total5 + total3up5,total5 + total3up10, +"円");
		System.out.println("割引後合計金額" + total55:total1010 + "円");
		System.out.println("")
	}

}
