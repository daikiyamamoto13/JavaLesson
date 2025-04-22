package jp.co.aforce.sample;

public class Caluculator {
	
	public static void main(String args[]) {
		
		/*計算する*/
		int a = 1;
		int b = 2;
		int c = a+b; //cは3になる
		
		/*計算した結果を表示する*/
		System.out.println("1+2="+c);
		DoubleInteger();
		GreaterThanTen();
		EvenOrOdd();
		Question4();
		Question5();
		Question6();
		Question7();
	}
	public  static void DoubleInteger() {
	        int num = 5;                   
	        int result = num * 2;         
	        System.out.println(num + "×2=" + result);  
	    
	}
	
	public static void GreaterThanTen(){
			int num = 12;
			System.out.println(num + (num > 10?"は10より大きい":"は10以下"));
	}
	
	public static void EvenOrOdd() {
			int num = 7;
			if (num % 2 == 0) {
				System.out.println(num + "は偶数です");
			}else {
				System.out.println(num + "は奇数です");
			}
	}
	
	public static void Question4() {
			double  num = 4.5;
			double result = num / 2;
			System.out.println(result );
	}
	
	public static void Question5() {
			double num = 7.8;
			int integerPart = (int) num;
			double decimalPart = num - integerPart;
			System.out.println("出力結果は、「整数部分：" + integerPart + "小数部分:" + decimalPart + "]となるようにする。");
	}
	
	public static void Question6() {
			double num = 3.2;
			double result = num * 10;
			System.out.println(num + "×10=" + result);
	}
	
	public static void Question7() {
			int num = 0;
			if(num == 0) {
				System.out.println("0です");	
			} else {
				System.out.println("0ではありません");
			}
	}
}



