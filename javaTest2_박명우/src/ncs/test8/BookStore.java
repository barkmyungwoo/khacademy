package ncs.test8;

import ncs.test7.Book;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bookdata = new Book();
		
		bookdata = new Book("IT", "SQL PLUS", 50000, 5.0);

		BookUpdate bookupdate = new BookUpdate();
		bookupdate = new BookUpdate(bookdata);
		
		
		System.out.println(bookupdate.toString());

		System.out.println("�⺻ ����");
		System.out.println(bookdata.getBookName() +"\t"+bookdata.getBookPrice());
		
		System.out.println("����� ����");
		bookdata = bookupdate.updataBookPrice();
		System.out.println(bookdata.getBookName() +"\t"+bookdata.getBookPrice());
	}

}
