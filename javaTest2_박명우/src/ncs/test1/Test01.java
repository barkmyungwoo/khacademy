package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		double total = 0; 																			// ��� ��

		System.out.println("������ �Է� �ϼ���.");
		String[] s = sc.nextLine().split(" ", 5);

		for(int i = 0; i< score.length;i++){
			score[i]=Integer.parseInt(s[i]);
			System.out.print(score[i] + ", ");
		}
		
		total = score[0] * 0.3 + score[1] * 0.3 + score[2] * 0.1 + score[3] * 0.1 + score[4] * 0.2;
		System.out.printf("\n������ : %.1f ��", total);
		System.out.println();

		if (total >= 90)
			System.out.println("����� Gold Ŭ���� �Դϴ�.");
		else if (total >= 80)
			System.out.println("����� Silver Ŭ���� �Դϴ�.");
		else if (total >= 70)
			System.out.println("����� Bronze Ŭ���� �Դϴ�.");
		else
			System.out.println("����� Nomal Ŭ���� �Դϴ�.");
	}
}


//package ncs.test1;
//
//import java.util.Scanner;
//
//public class Test01 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] score = new int[5];
//		String num[];
//		int b = 0, e = 0; 																			// ���ڿ� �ε��� ���۰� = b(begin), �� �� = e(end)
//		int j = 0; 																					// �迭 ī��Ʈ ��
//		double total = 0; 																			// ��� ��
//		
//
//		System.out.println("������ �Է� �ϼ���.");
//		String s = sc.nextLine();
//		
//		num = s.split(" ", 5);
//		
//		for(int i = 0; i< score.length;i++){
//			score[i]=Integer.parseInt(num[i]);
//		}
//		
//		if (s.length() < 10) 																		// ���ڸ� �� ���� �ɸ�
//			return;
//		
//		if(s.length()>20)																			//���ڸ� �ʹ� ���� �ᵵ �ɸ�.
//			return;
//
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == ' ') { 																// ���� �˻�
//				e = i - 1; 																			// �� ���� ���� �ε��� ���ڸ� �Է�
//
//				if (e - b == 0) { 																	// ������ ���ڸ� �� ��.
//					score[j] = (s.charAt(e) - 48);
//					j++;
//				}
//
//				else if (e - b == 1) { 																// ������ ���ڸ� �� ��.
//					score[j] = (s.charAt(b) - 48) * 10;
//					score[j] += (s.charAt(e) - 48);
//					j++;
//				}
//
//				else if (e - b == 2) { 																// ������ 3�ڸ�(100) �� �� 
//					if (s.charAt(b) == '1' && s.charAt(b + 1) == '0' && s.charAt(e) == '0') { 		//100�� �� �� �����Ƿ� 100�� �´��� Ȯ��
//						score[j] = 100;																//�ٷ� 100 �־� �ָ� ��.
//						j++;																		
//					} else
//						System.out.println("������ �߸� �Է���");
//				} else
//					System.out.println("������ �߸� �Է���");
//				b = i + 1; 																			//���� ���� �ε��� �ڸ� ���� ���۰��� �Է�
//			}
//		}
//		
//		for (int i = 0; i < score.length; i++)
//			System.out.print(score[i] + ", ");
//
//		total = score[0] * 0.3 + score[1] * 0.3 + score[2] * 0.1 + score[3] * 0.1 + score[4] * 0.2;
//
//		System.out.printf("\n������ : %.1f ��", total);
//		System.out.println();
//
//		if (total >= 90)
//			System.out.println("����� Gold Ŭ���� �Դϴ�.");
//		else if (total >= 80)
//			System.out.println("����� Silver Ŭ���� �Դϴ�.");
//		else if (total >= 70)
//			System.out.println("����� Bronze Ŭ���� �Դϴ�.");
//		else
//			System.out.println("����� Nomal Ŭ���� �Դϴ�.");
//	}
//}
