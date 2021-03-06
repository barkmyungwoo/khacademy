package ncs.test7;

public class Book {
	String category;
	String bookName; 
	double bookPrice;
	double bookDiscountRate;

	public Book() {}

	public Book(String category, String bookName, double bookPrice, double bookDiscountRate) {
		this.category = category;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

//-------------------------------------------------------

	public String getCategory() {
		return category;
	}
	public String getBookName() {
		return bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

//-------------------------------------------------------

	public void setCategory(String category) {
		this.category = category;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}

//-------------------------------------------------------
	
	public String toString() {
		return category + "\t" + bookName + "\t" + bookPrice
				+ "\t" + bookDiscountRate;
	}
	
	

}
