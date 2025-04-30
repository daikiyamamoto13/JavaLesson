package javaLesson0430;

import java.util.Scanner;

public class IfLessonQ3 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("数字を三つ入力してください");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("三角形です");
		} else {
			System.out.println("三角形ではありません");
		}
		
			
		scanner.close();
	}

}
