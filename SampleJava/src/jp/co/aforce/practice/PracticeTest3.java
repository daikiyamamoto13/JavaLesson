package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeTest3 {
	public static void main(String[]args) {
		
		 String Stationery[] = new String[5];
		 
		 Stationery[0] = "シャープペンシル";
		 Stationery[1] = "ボールペン";
		 Stationery[2] = "リングノート";
		 Stationery[3] = "クリップ";
		 Stationery[4] = "消しゴム";
		 
		 System.out.println(Stationery[1]);
		 
		 ArrayList<String> Employee = new ArrayList<>();
		 
		 
		 Employee.add(0,"山田太郎");
		 Employee.add(1,"鈴木花子");
		 Employee.add(2,"佐藤次郎");
		 Employee.add(3,"山田太郎");
		 Employee.add(4,"高橋三郎");
		 
		 System.out.println(Employee.get(2));
		 
		 ArrayList<Integer> list1 = new ArrayList<>();
		 
		 list1.add(10);
		 list1.add(15);
		 list1.add(16);
		 list1.add(19);
		 
		 ArrayList<Integer> list2 = new ArrayList<>();
		 list2.add(11);
		 list2.add(12);
		 list2.add(18);
		 list2.add(20);
		 
		 list1.addAll(list2);
		
		 Collections.sort(list1);
		
		 for (Integer num : list1) {
			System.out.println(num);
			
		 }
		 ArrayList<Integer> list3 = new ArrayList<>();
		 
		 list3.add(13);
		 list3.add(14);
		 list3.add(17);
		 list3.add(21);
		 
		 ArrayList<Integer> newList = new ArrayList<>();
		 
		 for(Integer num : list1) {
			 newList.add(num);
		 }
		 
		 for(Integer num : list3) {
			 newList.add(num);
		 }
		 
		 Collections.sort(newList);
		 
		 for(Integer num : newList) {
		 System.out.print(num);
		 }
	}

}
	
