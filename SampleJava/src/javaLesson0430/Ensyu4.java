package javaLesson0430;

import java.util.ArrayList;

public class Ensyu4 {

	public static void main(String[] args) {
		ArrayList<String> fruitsList = new ArrayList<>();
		
		fruitsList.add("りんご");
		fruitsList.add("みかん");
		fruitsList.add("ぶどう");

		for(String fruits :fruitsList) {
			System.out.println(fruits);
		}
	}

}
