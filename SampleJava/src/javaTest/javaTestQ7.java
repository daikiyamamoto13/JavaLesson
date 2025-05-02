package javaTest;

import java.util.Scanner;

public class javaTestQ7 {

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("年齢を入力してください");
		
		int age = scanner.nextInt();
		
		try {
			if (age <= 3) {
				System.out.println("３歳以下:無料" );
			} else if 
			( age <= 12) {
				System.out.println("４歳～１２歳：５００円");	
			} else if
			(age <= 17 ) {
				System.out.println("１３歳～１７歳：８００円");	
			} else if
			( age <= 59) {
				System.out.println("１８歳～５９歳：１２００円");
			} else { 
				System.out.println("６０歳以上：７００円");
			}
		}catch (NumberFormatException e) {
			System.out.println("数字を入力してください");
			
		
		scanner.close();
		}

	}
}	
