package ncs.test8;

import ncs.test7.Book;

public class BookUpdate {
	Book bookData = new Book();

	public BookUpdate(){

	}

	public BookUpdate(Book bookData){
		this.bookData.setBookName(bookData.getBookName());
		this.bookData.setBookPrice(bookData.getBookPrice());
		this.bookData.setBookDiscountRate(bookData.getBookDiscountRate());
	}
	
	public Book getBookData(){
		return bookData;
	}

	public Book updataBookPrice(){
		bookData.setBookPrice(bookData.getBookPrice()-(bookData.getBookPrice()*bookData.getBookDiscountRate()/100));
		return bookData;
	}
}