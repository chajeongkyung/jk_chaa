
public class BookVo {
	
	private String title = "";
	private String author = "";
	private String publisher = "";
	private String publiDate = "";
	private int price = 0;
	
	public BookVo() {
		super();
	}

	public BookVo(String title, String author, 
			String publisher, String publiDate, int price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publiDate = publiDate;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPubliDate() {
		return publiDate;
	}

	public void setPubliDate(String publiDate) {
		this.publiDate = publiDate;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" 
	+ author + ", publisher=" + publisher + ", publiDate=" 
				+ publiDate	+ ", price=" + price + "]";
	}
	
}
