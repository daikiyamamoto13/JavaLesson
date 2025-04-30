package javaLesson0430;

import java.util.Scanner;

public class Ensyu1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("点数を入力してください");
		
		int score =  scanner.nextInt();
		
		if(score >= 60) {
			System.out.println("合格");	
		} else {
			System.out.println("不合格");
		}

		scanner.close();
	}

}
