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
			System.out.println(value.charAt(i));
		}
	}
	
	public static void setChar(int a, char b){
		char[] cd = new char[value.length()];
		
		for(int i = 0; i<value.length();i++){
			cd[i] = value.charAt(i);
		}
		
		cd[a] = b;
		value ="";
		
		for(int i = 0; i<value.length();i++){
			value += cd[i];
		}		

		System.out.println(value);
	}
	
	public static int valueLength(){
		return value.length();
	}
	
	private static String valueConcat(String s) {
		return (value+s);
	}
}
