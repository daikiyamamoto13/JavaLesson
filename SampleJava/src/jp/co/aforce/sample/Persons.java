package jp.co.aforce.sample;

public class Persons {
	private String name;
	private int age;
	
	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "歳)";
	}
	
	public static void main(String[] args) {
		Persons person = new Persons("山田太郎",25);
		String toStringResult = person.toString();
		System.out.println(toStringResult);
	}

}
