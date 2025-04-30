package javaLesson0430;

import java.util.Scanner;

public class SwitchLessonQ5 {
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("成績(A,B,C,D,F)を入力してください");
		
		String score = scanner.nextLine();
		
		switch (score) {
		case "A":
			System.out.println("素晴らしい成績です");
			break;
		case "B":
			System.out.println("良い成績です");
			break;
		case "C":
			System.out.println("まあまあの成績です");
			break;
		case "D":
			System.out.println("もう少し勉強しましょう");
			break;
		case "F":
			System.out.println("勉強しないとやばいですよ");
			break;
		}
		
		scanner.close();
	}

}
