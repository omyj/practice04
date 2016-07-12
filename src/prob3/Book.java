package prob3;

public class Book {

	int bookNo;
	String title;
	String author;
	int stateCode = 1;

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		
	}

	public void rent() {
		stateCode = 0;
		System.out.println(getTitle() + "이(가) 대여 됐습니다.");
	}

	public void print() {

		System.out.print("책 제목:"+getTitle()+", 작가:"+getAuthor()+", 대여 유무:");
		if (stateCode == 1) {
			System.out.println("재고있음");
		} else if (stateCode == 0) {
			System.out.println("대여중");
		}
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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

}
