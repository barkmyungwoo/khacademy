package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		double[][] s = new double[3][3];
		Scanner sc = new Scanner(System.in);
		double sum = 0;

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(i + "�� �л� ���� ���� " + (j + 1) + " : ");
				s[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("index\t����1\t����2\t����3\t����\t���");

		for (int i = 0; i < s.length; i++) {
			System.out.print(i);
			for (int j = 0; j < s[i].length; j++) {
				System.out.print("\t" + s[i][j]);
				sum += s[i][j];
			}
			System.out.print("\t"+sum+"\t");
			System.out.printf("%.1f",(sum/3));
			System.out.println();
			sum=0;
		}

	}

}
