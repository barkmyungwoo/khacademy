package oop.method;

public class Testmain {

	public static void main(String[] args) {
		NonStaticSample no =new NonStaticSample();
		System.out.println(no.intArrayAllocation(7));
		
		int i[] = {1, 2, 3, 4, 6, 5, 7};

		no.display(i);
		System.out.println();

		no.swap(i, 2, 0);
		no.display(i);
		System.out.println();		

		no.sortDescending(i);
		no.display(i);
		System.out.println();

		no.sortAscending(i);;
		no.display(i);
		System.out.println();

		System.out.println(no.countChar("apple", 'p'));

		System.out.println(no.totalValue(1, 3));
		
		System.out.println(no.pCharAt("bark myung woo", 7));

		System.out.println(no.pConcat("hi", "hello"));
	}
	
	

}
