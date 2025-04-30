package javaLesson0430;

import java.util.Scanner;

public class SwitchLessonQ3 {
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("曜日の番号を入力してください ex:月曜日=1,水曜日=3,日曜日=7");
		
		int dayweek = scanner.nextInt();
		
		switch (dayweek) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		
		default :
			System.out.println("1～7の数字を入れてください");
			
		}
		
		scanner.close();
	}

}
