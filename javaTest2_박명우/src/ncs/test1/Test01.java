package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];

		int b = 0, e = 0;																				//문자열 시작값 = b(begin), 끝 값 = e(end) 
		int j = 0;																						//배열 카운트 값
		double total=0;																					//평균 값

		System.out.println("점수를 입력 하세요.");
		String s = sc.nextLine()+" ";

		while (true) {
			if(s.length()<10)																			//숫자를 덜 쓰면 걸림
				return;
			
			for (int i = 0; i < s.length(); i++) {														
				if (s.charAt(i) == ' ') {																//띄어쓰기 감사
					e = i - 1;																			//끝 값에 띄어쓰기 인덱스 앞자리 입력
					
					if (e - b == 0) {																	// 점수가 한자리 일 때. 
						score[j] = (s.charAt(e) - 48);
						j++;						
					}
					else if (e - b == 1) {																//점수가 두자리 일 때. 
						score[j] = (s.charAt(b) - 48) * 10;
						score[j] += (s.charAt(e) - 48);
						j++;
					} 
					else if (e - b == 2) {																//점수가 3자리(100) 일 때 
						if (s.charAt(b)=='1'&& s.charAt(b + 1)=='0'&& s.charAt(e)=='0'){				//100이 맞는지 확인
							score[j] = 100;
							j++;
						} else
							System.out.println("점수를 잘못 입력합");
					} 
					else
						System.out.println("점수를 잘못 입력합");
					b = i + 1;																			//띄어쓰기 값 다음 자리 시작값에 입력
				}
			}
			
			if (j == 5)
				break;

		}
		
		for (int i = 0; i < score.length; i++)
			System.out.print(score[i]+", ");
		
		total = score[0]*0.3+score[1]*0.3+score[2]*0.1+score[3]*0.1+score[4]*0.2;
		
		System.out.printf("\n평가점수 : %.1f 점",total);
		System.out.println();

		if(total>=90)
			System.out.println("당신은 Gold 클레스 입니다.");
		else if(total>=80)
			System.out.println("당신은 Silver 클래스 입니다.");
		else if(total>=70)
			System.out.println("당신은 Bronze 클래스 입니다.");
		else 
			System.out.println("당신은 Nomal 클래스 입니다.");
	}
}
