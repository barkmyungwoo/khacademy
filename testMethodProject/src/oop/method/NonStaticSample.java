package oop.method;

public class NonStaticSample {

	public NonStaticSample() {
	}

	public int[] NonStaticSample(int i) {
		int[] a = new int[i];

		for (int j = 0; j < a.length; j++) {
			a[j] = (int) (Math.random() * 100 + 1);
			System.out.print(a[j] + ", ");
		}
		return a;
	}

	public void display(int[] i) {
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j] + ", ");
		}
	}

	public void swap(int a[], int b, int c) {
		int tmp;

		tmp = a[b];
		a[b] = a[c];
		a[c] = tmp;
	}

	public void sortDescending(int a[]) {

		for (int i = 0; i < a.length; i++)
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					swap(a, i, j);				
					}
				
			}
	}

	public void sortAscending(int a[]) {
		// 오름차순
		int tmp;
		for (int i = 0; i < a.length; i++)
			for (int j = i; j < a.length; j++) {
				if (a[i] < a[j]) {
					swap(a, i, j);				
				}
			}
	}

	public int countChar(String s, char c) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				cnt++;
		}
		return cnt;
	}

	public int totalValue(int a, int b) {
		// 작은수에서 큰수까지 더하기
		int sum = 0;

		if (a > b) {
			for (int i = a; i < b; i++)
				sum += i;
		} 
		else {
			for (int i = b; i < a; i++)
				sum += i;
		}
		return sum;
	}

	public char pCharAt(String s, int a) {

		return s.charAt(a);
	}

	public String pConcat(String s1, String s2) {
		
		return (s1+s2);
	}
}
