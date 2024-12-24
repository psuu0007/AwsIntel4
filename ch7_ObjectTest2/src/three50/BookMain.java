package three50;

import three50.book.Book;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		
		book.setName("어린왕자");
		book.setAuthor("생텍쥐페리");
		book.setPublisher("코너스톤");
		book.setDate("2020.09.22");
		book.setPrice(2970);
		
		book.info();
		
		Book book2 = new Book();
		
		System.out.println();
		
		book2.setName("셜록홈즈");
		book2.setAuthor("아서 코난 도일");
		book2.setPublisher("동서문화사");
		book2.setDate("2003.01.01");
		book2.setPrice(6120);
		
		book2.info();
		
		
	}

}
