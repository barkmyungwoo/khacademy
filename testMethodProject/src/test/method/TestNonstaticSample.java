package test.method;

public class TestNonstaticSample {
	public static void main(String[] args) {
		NonStaticSample no = new NonStaticSample();

		no.printLottoNumbers();
		
		no.outputChar(6, 'j');
		
		char al = no.alphabette();
		
		System.out.println(al);
		
		String sub = no.mySubstring("abcdefghijklmnop", 3, 11); 
		
		System.out.println(sub);
	}

}
