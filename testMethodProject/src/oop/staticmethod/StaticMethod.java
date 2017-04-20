package oop.staticmethod;

public class StaticMethod {

	private static String value;

	public StaticMethod() {}

	public StaticMethod(String value){
		this.value = value;
	}

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticMethod.value = value;
	}
	
	public static void toUpper(){
		int i;
		for(i=0; i < value.length() ;i++){
			System.out.print(value.toUpperCase().charAt(i));
		}
	}
	
	public static void setChar(int a, char b){
		char[] cd = new char[value.length()];
		int val;
		for(int i = 0; i<value.length();i++){
			cd[i] = value.charAt(i);
		}
		
		cd[a] = b;
		val = value.length();
		value ="";
		
		for(int i = 0; i<val;i++){
			value += (char)cd[i];
		}		

		System.out.println(value.length());

		System.out.print(value);
		System.out.println("??");
	}
	
	public static int valueLength(){
		return value.length();
	}
	
	public static String valueConcat(String s) {
		return (value+s);
	}
}
