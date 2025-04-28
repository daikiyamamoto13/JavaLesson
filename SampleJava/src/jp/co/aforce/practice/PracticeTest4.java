package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest4 {
	public static void main(String[]args) {
		
		ArrayList<String> Animals = new ArrayList<>();
		
		Animals.add(0,"犬");
		Animals.add(1,"猫");
		Animals.add(2,"うさぎ");
		Animals.add(3,"へび");
		
		String Myfav =Animals.get(0);
		
		for(String word: Animals) {
			
			if(word == Myfav) {
				System.out.println(Myfav + "はリストに含まれています");
			}else {
				System.out.println(Myfav + "はリストに含まれていません");
				
				
			}
		}
	}

}
