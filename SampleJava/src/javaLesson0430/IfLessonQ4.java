package javaLesson0430;

import java.util.Scanner;

public class IfLessonQ4 {
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("年齢を入力してください");
		
		int age = scanner.nextInt();
		
		if (age <= 12) {
			System.out.println("無料");
		} else if (age >= 13 && age <= 59) {
			System.out.println("1000円");
		} else {
			System.out.println("500円");
		}
		
		scanner.close();
		
		
	}

}
