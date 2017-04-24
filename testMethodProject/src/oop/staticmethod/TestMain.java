package oop.staticmethod;

public class TestMain {
	public static void main(String[] args) {
		StaticMethod s = new StaticMethod();
		String add = "nice to meet you";
		
		s.setValue("hi.my name is barkmyungwoo");
		
		System.out.println(s.getValue());
		
		s.toUpper();
		
		s.setChar(1, 'o');
		
		System.out.println(s.valueLength());
		
		add = s.valueConcat("nice to meet you");
		
		System.out.println(add);
		
		
	}
}