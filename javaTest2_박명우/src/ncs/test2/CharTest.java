package ncs.test2;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		String s = sc.nextLine();
		
		int count = s.length();
		
		for(int i=count-1; i>=0;i--){
			System.out.print(s.toUpperCase().charAt(i));
		}
	}

}
