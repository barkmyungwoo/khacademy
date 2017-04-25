package ncs.test2;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		System.out.println("문자를 입력하세요 : ");
		
		char[] c= new char[args[0].length()];
		
		for(int i=args[0].length(); i>=0 ; i--){
			c[i] = args[0].charAt(i);
			System.out.print(c[i]);
		}
	}

}
