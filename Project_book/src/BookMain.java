
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookVo book = new BookVo();
		
		book.setTitle("네가 어떤 삶을 살든 나는 너를 응원할 것이다");
		System.out.println("책 제목 : " + book.getTitle());
		
		book.setAuthor("공지영");
		System.out.println("작가 : " + book.getAuthor());
		
		book.setPublisher("해냄");
		System.out.println("출판사 : " + book.getPublisher());
		
		book.setPrice(13500);
		System.out.println("가격 : " + book.getPrice() + "원 입니다.");
		
		book.setPubliDate("2016/08/20");
		System.out.println("출판일 : " + book.getPubliDate());
		
		System.out.println(book);
	}

}
