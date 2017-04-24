package ncs.test7;

public class BookTest {

	public static void main(String[] args) {
		Book bookArray[] = new Book[5];
		double sum=0;
		{
			bookArray[0] = new Book("IT", "SQL PLUS", 50000, 5.0);
			bookArray[1] = new Book("IT", "JAVA 2.0", 40000, 3.0);
			bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6.0);
			bookArray[3] = new Book("Nobel", "davincicode", 30000, 10.0);
			bookArray[4] = new Book("Nobel", "cloven hoof ", 50000, 15.0);
		}
		
		for(int i=0; i< bookArray.length;i++){
			System.out.println(bookArray[i].toString());
			sum+= bookArray[i].getBookPrice();
		}
		System.out.println("ÇÕ°è´Â : "+sum);
		

	}

}
