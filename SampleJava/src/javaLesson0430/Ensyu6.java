package javaLesson0430;

import java.util.HashMap;
import java.util.Map;

public class Ensyu6 {

	public static void main(String[] args) {
		Map<String,Integer> JapanTourList = new HashMap<>();
		
		JapanTourList.put("東京",1_500_000);
		JapanTourList.put("大阪",1_200_000);
		JapanTourList.put("京都",800_000);
		JapanTourList.put("福岡",500_000);
		JapanTourList.put("札幌",400_000);
		
		Map<String,Integer> ForeignTourList = new HashMap<>();
		
		ForeignTourList.put("東京",2_500_000);
		ForeignTourList.put("大阪",1_800_000);
		ForeignTourList.put("京都",1_200_000);
		ForeignTourList.put("福岡",800_000);
		ForeignTourList.put("札幌",600_000);
		
	}

}
