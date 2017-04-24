package ncs.test8;

import ncs.test7.Book;

public class BookStore {

	public static void main(String[] args) {
		Book bookdata = new Book();																//북 생성

		{
			bookdata = new Book("IT", "SQL PLUS", 50000, 5.0);									//북 초기화 
		}

		BookUpdate bookupdate = new BookUpdate();												//북업뎃 생성
		bookupdate = new BookUpdate(bookdata);													//북업뎃 초기화. 북 이용

		System.out.println("기본 정보");
		System.out.println(bookdata.getBookName() + "\t" + bookdata.getBookPrice());			// 북 이름, 기본 가격 출력

		System.out.println("변경된 정보");
		bookdata = bookupdate.updataBookPrice();												//북업뎃 .북 업뎃프라이스 실행 가격 반환해서 북에 저장
		System.out.println(bookdata.getBookName() + "\t" + bookdata.getBookPrice());
	}

}
