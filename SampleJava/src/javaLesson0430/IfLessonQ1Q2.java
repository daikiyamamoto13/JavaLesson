package javaLesson0430;

import java.util.Scanner;

public class IfLessonQ1Q2 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("数字を入力してください");
		int number = scanner.nextInt();
		
		//偶数、奇数を判断する
		if (number % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
		
		
		//正の数、負の数、０を判断する
		if (number > 0) {
			System.out.println("正の数です");
		} else if (number < 0){
			System.out.println("負の数です");
		} else {
			System.out.println("ゼロです");
		}
		
		scanner.close();
	}
	

}
